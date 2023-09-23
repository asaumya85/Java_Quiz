import java.awt.*;
import javax.swing.*;
import java .awt.event.*;

public class Directions extends JFrame {
    String name;
    JButton start ,back;

    Directions(String name){
        this.name=name;
        getContentPane().setBackground(Color.black);
        setLayout(null);


        JLabel heading=new JLabel("Welcome " + name +" To Get Started");
        heading.setBounds(70,50,1000,50);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Times New Roman",Font.BOLD,50));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(40,180,800,400);
        rules.setForeground(Color.white);
        rules.setFont(new Font("Times New Roman",Font.ITALIC,20));
        rules.setText("<html>" +
                "1. Do not close the browser any time" + "<br><br>" +
                "2. Candiate should check their name displayed on the screen " + "<br><br>" +
                "3. there are 10 questions" + "<br><br>" +
                "4. Each Correct Answer hold 2 marks." + "<br><br>" +
                "5. There is no negative marking " + "<br><br>" +
                "6. There is a 15 sec timer  for each question " + "<br><br>" +
                "7. Kindly read each question properly before answer it ." + "<br><br>" +
                "</html>");
        add(rules);

        back=new JButton("Back");
        back.setBounds(170,600,150,70);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        back.addActionListener(this::actionPerformed);
        add(back);

        start=new JButton("Start");
        start.setBounds(1075,600,150,70);
        start.setBackground(Color.WHITE);
        start.setForeground(Color.BLACK);
        start.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        start.addActionListener(this::actionPerformed);
        add(start);

        setSize(1300,900);
        setLocation(60,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==back){
            setVisible(false);
            new Login();
        } else if (ae.getSource()==start) {
            setVisible(false);
            new Quiz(name);

        }
        ;
    }

    public static void main(String[] args) {
        new Directions("User");

    }
}
