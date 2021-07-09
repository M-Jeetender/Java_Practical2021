// Q13b.Using SWING, write a program to display a string in frame window with pink color as background

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
    JLabel l;

    Main() {
        JFrame f = new JFrame("Background Color Using Swing");

        l = new JLabel("Programming With JAVA", SwingConstants.CENTER);
        l.setBounds(0, 100, 260, 30);
        f.add(l);
        f.getContentPane().setBackground(Color.PINK);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}