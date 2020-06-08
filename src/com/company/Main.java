package com.company;

import Decorator.Kofe.KofeMain;
import singleton.version1.singletonMain;
import singleton.version2.Angel;
import singleton.version2.Devil;
import singleton.version2.Init;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame frame;
//Пробуем изменения
    public static void main(String[] args) {
        KofeMain kofeMain = new KofeMain();

        Main example = new Main();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Субъект");
        button.addActionListener(new Angel());
        button.addActionListener(new Devil());
        frame.getContentPane().add(BorderLayout.CENTER, button);

    }
}
