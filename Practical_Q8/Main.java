// Q8 Write a program to create a frame using AWT. Implement mouseClicked( ), mouseEntered( ) 
// and mouseExited( ) events. Frame should become visible when mouse enters it. 

import java.awt.*;
import java.awt.event.*;

class MouseDemo extends Frame{

    String msg = " ";
    int mouseX =100, mouseY=100;

    MouseDemo(){


        setSize(300,300);
        setLayout(new FlowLayout());
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me){
                msg = "Mouse Clicked";
                mouseX = me.getX();
                mouseY= me.getY();
                repaint();
            }

            public void mouseEntered(MouseEvent me){
                    msg = "Mouse Entered";
                    repaint();
            }

            public void mouseExited(MouseEvent me){
                msg = "Mouse Exited";
                repaint();

            }
        });

        addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we){
             System.exit(0);
         }
        });
    }

    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }
}

 class Main {

    public static void main(String[] args) {
        MouseDemo md = new MouseDemo();
        md.setVisible(true);
    }
}
