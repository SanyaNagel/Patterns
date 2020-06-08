package Decorator.IOProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Inverter extends FileInputStream {
    public Inverter(InputStream in) throws FileNotFoundException {
        super(String.valueOf(in));
    }

    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read (byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for(int i = offset; i < offset+result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
