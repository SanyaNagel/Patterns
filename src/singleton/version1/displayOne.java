package singleton.version1;

import singleton.version1.interfaces.Observer;

public class displayOne implements Observer {
    private int param;

    public displayOne() {
        param = 0;
    }

    @Override
    public void update(int param) {
        this.param = param;
        display();
    }
    @Override
    public void display() {
        System.out.println("Display 1: " + param);
    }
}
