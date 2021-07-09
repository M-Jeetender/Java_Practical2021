

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    
    JButton btnRed, btnBlue;
    Main() {
        JFrame f = new JFrame("Swing Buttons");

        // For Button Red
        btnRed = new JButton("Red");
        btnRed.setBounds(16, 90, 250, 30);
        btnRed.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.RED);
            }
        });
        f.add(btnRed);


        // For Button Blue
        btnBlue = new JButton("Blue");
        btnBlue.setBounds(16, 140, 250, 30);
        btnBlue.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.BLUE);
            }
        });
        f.add(btnBlue);
        
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