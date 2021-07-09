import java.awt.*;
import java.awt.event.*;

class Buttons extends Frame{

    Buttons(){

        setTitle("Change Background Color With Buttons");
        setSize(300,300);
        setLayout(null);

        Button bRed = new Button("RED");
        Button bBlue = new Button("BLUE");

         bRed.setBounds(100,100,90,30);
        bBlue.setBounds(100,140,90,30);

        add(bRed);
        add(bBlue);

        bRed.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED);
            }
        });

        bBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE);
            }
        });


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
        Buttons buttons = new Buttons();

    }
}
