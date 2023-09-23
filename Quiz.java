import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    JLabel qno;
    JLabel ques;
    public static int ans_given = 0;
    public static int score = 0;
    String userans[][] = new String[10][1];
    public static int count = 0;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup grpbtn;
    JButton prev, next;
    String name;

    Quiz(String name) {
        this.name = name;
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setSize(1520, 1000);
        setLocation(0, 0);

//        //        adding Image on frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/timer.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 650, 780);
        add(image);

        qno = new JLabel();
        qno.setBounds(710, 200, 70, 30);
        qno.setForeground(Color.white);
        qno.setFont((new Font("Times Roman", Font.PLAIN, 24)));
        add(qno);


        opt1 = new JRadioButton();
        opt1.setBounds(740, 250, 500, 30);
        opt1.setForeground(Color.white);
        opt1.setBackground(Color.black);
        opt1.setFont((new Font("Times Roman", Font.PLAIN, 21)));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(740, 300, 500, 30);
        opt2.setForeground(Color.white);
        opt2.setBackground(Color.black);
        opt2.setFont((new Font("Times Roman", Font.PLAIN, 21)));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(740, 350, 500, 30);
        opt3.setForeground(Color.white);
        opt3.setBackground(Color.black);
        opt3.setFont((new Font("Times Roman", Font.PLAIN, 21)));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(740, 400, 500, 30);
        opt4.setForeground(Color.white);
        opt4.setBackground(Color.black);
        opt4.setFont((new Font("Times Roman", Font.PLAIN, 21)));
        add(opt4);

        grpbtn = new ButtonGroup();
        grpbtn.add(opt1);
        grpbtn.add(opt2);
        grpbtn.add(opt3);
        grpbtn.add(opt4);

        prev = new JButton("SUBMIT");
        prev.setBounds(740, 510, 160, 40);
        prev.setBackground(Color.WHITE);
        prev.setForeground(Color.BLACK);
        prev.setFont(new Font("Mongolian Baiti", Font.ITALIC, 30));
        prev.addActionListener(this);
        add(prev);
        prev.setVisible(false);

        next = new JButton("Next");
        next.setBounds(1140, 510, 160, 40);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Mongolian Baiti", Font.ITALIC, 30));
        next.addActionListener(this);
        add(next);


        ques = new JLabel();
        ques.setBounds(760, 200, 950, 30);
        ques.setForeground(Color.white);
        ques.setFont((new Font("Times Roman", Font.PLAIN, 24)));
        add(ques);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure ";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";


        start(count);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (grpbtn.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = grpbtn.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setVisible(false);
                prev.setVisible(true);
            }
            count++;
            start(count);
        }

        else if(ae.getSource()==prev) {
            ans_given = 1;
            if (grpbtn.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = grpbtn.getSelection().getActionCommand();
            }

            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0] == answers[i][1]) {
                    score = score + 10;
                }
            }
            setVisible(false);
            new Score(name, score);
        }

    }


    public void start(int count){
        qno.setText(" "+(count+1)+".");
        ques.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        grpbtn.clearSelection();

    }
    public static void main(String[] args) {
        new Quiz("User");
    }
}
