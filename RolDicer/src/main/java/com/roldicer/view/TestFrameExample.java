package com.roldicer.view;

import javax.swing.*;

public class TestFrameExample {

    public static void main(String s[]) {

        NewTemplate frame = new NewTemplate();
        JLabel label = new JLabel("This is a label!");

        //panel.add(label);
        for (int i = 0; i < 100; i++) {
            JButton button = Generator.button();
            frame.addButton(button);
        }

        //frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
