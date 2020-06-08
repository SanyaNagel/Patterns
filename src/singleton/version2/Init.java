package singleton.version2;

import javax.swing.*;
import java.awt.*;

public class Init {
    JFrame frame;

    public Init(){
        frame = new JFrame();
        JButton button = new JButton("Субъект");
        button.addActionListener(new Angel());
        button.addActionListener(new Devil());
        frame.getContentPane().add(BorderLayout.CENTER, button);

    }
}
