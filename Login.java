import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,exit;
    JTextField tname;

    Login(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
//        adding Image on frame
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login5.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,650,800);
        add(image);
//add heading on page
        JLabel heading=new JLabel("JAVA QUIZ");
        heading.setBounds(920,120,650,75);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Times New Roman",Font.BOLD,75));
        add(heading);
// add login
        JLabel name=new JLabel("ENTER THE NAME");
        name.setBounds(950,280,400,30);
        name.setForeground(Color.white);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(name);
        tname=new JTextField();
        tname.setBounds(955,341,300,35);
        tname.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        add(tname);
//  creating Button
        rules=new JButton("Directions");
        rules.setBounds(760,460,190,70);
        rules.setBackground(Color.WHITE);
        rules.setForeground(Color.BLACK);
        rules.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        rules.addActionListener(this);
        add(rules);

        exit=new JButton("Exit");
        exit.setBounds(1175,460,190,70);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        exit.addActionListener(this);
        add(exit);



        setSize(1540,1000);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            setVisible(false);
            String name=tname.getText();
            new Directions(name);

        } else if (ae.getSource()==exit) {
            setVisible(false);

        }


    }
    public static void main(String[] args) {
       new Login();
    }
}
