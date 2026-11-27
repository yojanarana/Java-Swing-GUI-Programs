import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OddEven {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Odd/Even");
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Enter number:");
        JTextField t1=new JTextField(15);
        f1.add(l1);f1.add(t1);
        JButton b1=new JButton("Check");
        JLabel l2=new JLabel();
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num= Integer.parseInt(t1.getText());
                if(num%2==0)
                    l2.setText("Even");
                else
                    l2.setText("Odd");
            }});
        f1.add(b1);f1.add(l2);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}