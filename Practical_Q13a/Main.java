/* Q13a,Write a program to create a frame using Swing.Implement mouseClicked( ), mouseEntered( ) 
and mouseExited( ) events. Frame should become visible when mouse enters it */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
    JLabel l;
    Main() {
        JFrame f = new JFrame("Mouse Event Using SWING");
        l = new JLabel("", SwingConstants.CENTER);
        l.setBounds(15, 110, 260, 30);
        f.add(l);

        f.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked at " + e.getX() + "," + e.getY());
            }

            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }
        });

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