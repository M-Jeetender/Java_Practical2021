import java.awt.*;
import java.awt.event.*;

class DisplayString extends Frame{

    DisplayString(){

        setTitle("Main Window");
        setSize(300,300);


        Label display = new Label("Welcome to Programming With Java");
        display.setBounds(40,80,250,150);

        add(display);

        setBackground(Color.PINK);
        setLayout(null);

        addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we){
               System.exit(0);
           }
        });

        setVisible(true);
    }
}
public class Main {

    public static void main(String[] args) {
        DisplayString ds = new DisplayString();

    }
}
