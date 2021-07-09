
import java.awt.*;
import java.awt.event.*;




class Information {
    Button btnClose;
    Panel panelForm;
    Label labelName, labelCourse, labelRollNo, labelCollege;
    TextField fieldName, fieldCourse, fieldRollNo, fieldCollege;


    Information(String name, String course, String rollNo, String college) {

        Frame f = new Frame("Personal Information");

        labelName = new Label("Name:");
        labelName.setBounds(30, 30, 90, 23);

        labelCourse = new Label("Course:");
        labelCourse.setBounds(30, 60, 90, 23);

        labelRollNo = new Label("Roll No.:");
        labelRollNo.setBounds(30, 90, 80, 23);

        labelCollege = new Label("College:");
        labelCollege.setBounds(30, 120, 90, 23);

        fieldName = new TextField(name);
        fieldName.setBounds(120, 30, 210, 23);
        fieldName.setEditable(false);

        fieldCourse = new TextField(course);
        fieldCourse.setBounds(120, 60, 210, 23);
        fieldCourse.setEditable(false);

        fieldRollNo = new TextField(rollNo);
        fieldRollNo.setBounds(120, 90, 210, 23);
        fieldRollNo.setEditable(false);

        fieldCollege = new TextField(college);
        fieldCollege.setBounds(120, 120, 210, 23);
        fieldCollege.setEditable(false);

        btnClose = new Button("Close");
        btnClose.setBounds(110, 160, 140, 30);

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        panelForm = new Panel();

        panelForm.setLayout(null);
        panelForm.add(labelName);
        panelForm.add(fieldName);
        panelForm.add(labelCourse);
        panelForm.add(fieldCourse);
        panelForm.add(labelRollNo);
        panelForm.add(fieldRollNo);
        panelForm.add(labelCollege);
        panelForm.add(fieldCollege);
        panelForm.add(btnClose);

        f.add(panelForm);
        f.setSize(380, 250);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}


class CGPA {
    Label l;
    Button btnClose;
    CGPA(String cgpa) {
        Frame f = new Frame("Previous Year CGPA");
        l = new Label("Your CGPA was: " + cgpa);
        l.setAlignment(Label.CENTER);
        l.setBounds(20, 20, 250, 30);

        btnClose = new Button("Close");
        btnClose.setBounds(90, 60, 100, 30);
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.add(l);
        f.add(btnClose);
        f.setSize(310, 150);
        f.setLayout(null);
        f.setVisible(true);
         f.setLocationRelativeTo(null);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
}


public class Main implements ActionListener {
    Button btnInfo, btnCGPA;
    Main() {
        Frame f = new Frame("Student Details");
        btnInfo = new Button("A");
        btnInfo.setBounds(150, 100, 200, 69);
        btnInfo.addActionListener(this);
        f.add(btnInfo);

        btnCGPA = new Button("B");
        btnCGPA.setBounds(150, 234, 200, 69);
        btnCGPA.addActionListener(this);
        f.add(btnCGPA);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
       f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent we){
               f.dispose();
           }
       });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInfo) {
            new Information(
                    "M Jeetender",
                    "BSc (Hons) Computer Science",
                    "88020",
                    "ARSD College"
            );
        } else if (e.getSource() == btnCGPA) {
            new CGPA("0.64");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}