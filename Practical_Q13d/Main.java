

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyKeyAdapter extends KeyAdapter {
    JLabel l;

    MyKeyAdapter(JLabel l) {
        this.l = l;
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Typed character is: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {

        System.out.println("Pressed character is: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Released character is: " + e.getKeyChar());
    }
}

public class Main {

    JLabel l;
    Main() {

        JFrame f = new JFrame("Key Event Using Swing");
        l = new JLabel("", SwingConstants.CENTER);
        l.setBounds(90, 60, 250, 30);
        f.addKeyListener(new MyKeyAdapter(l));
        f.add(l);
        f.setSize(500, 220);
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