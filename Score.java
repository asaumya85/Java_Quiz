import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;


public class Score extends JFrame  implements ActionListener{
String name;
int score;
    Score(String name,int score){
this.name=name;
this.score=score;
        setSize(1540,1000);
        setLocation(0,0);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel head=new JLabel("Thank You "+name+" for playing with Java Quiz");
        head.setBounds(100,80,1150,80);
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Times-Roman",Font.BOLD,54));
        add(head);

        JLabel lbscore =new JLabel("Your Score is "+score);
        lbscore.setBounds(200,310,1150,55);
        lbscore.setForeground(Color.WHITE);
        lbscore.setFont(new Font("Times-Roman",Font.BOLD,34));
        add(lbscore);

         JButton end=new JButton("End ");
        end.setBounds(140,510,160,40);
        end.setBackground(Color.WHITE);
        end.setForeground(Color.BLACK);
        end.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        end.addActionListener(this);
        add(end);
    }
    public  void actionPerformed(ActionEvent ae) {
            setVisible(false);
            new Login();
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}
