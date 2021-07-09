import java.awt.*;
import java.awt.event.*;

class KeyTyped extends Frame{

    String msg = " ";
    KeyTyped(){

        setTitle("Key Typed");
        setSize(300,300);
        setLayout(new FlowLayout());

        addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent ke) {
               msg = "Typed character is : " + ke.getKeyChar();
               repaint();
            }

            public void keyPressed(KeyEvent ke){ }

            public void keyReleased(KeyEvent ke){ }
        });


        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g){
        g.drawString(msg,100,100);
    }
}
public class Main {

    public static void main(String[] args) {
        KeyTyped key = new KeyTyped();

    }
}
