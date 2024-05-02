package ols2307.awt;

import java.awt.Button;
import java.awt.Frame;

public class Addition {
    Addition() {
        Frame frame = new Frame("Addition Program");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        Button button = new Button("Click Me!");
        button.setBounds(10, 100, 100, 50);
        frame.add(button);
    }
    public static void main(String[] args) {
        new Addition();
    }
}
