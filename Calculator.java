import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Calculator");
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Num1:");
        JTextField t1=new JTextField(15);
        f1.add(l1);
        f1.add(t1);
        JLabel l2=new JLabel("Num2:");
        JTextField t2=new JTextField(15);
        f1.add(l2);
        f1.add(t2);
        JButton b1=new JButton("Sum");
        JButton b2=new JButton("Product");
        JButton b3=new JButton("Difference");
        JButton b4=new JButton("Quotient");
        JButton b5=new JButton("Remainder");
        JLabel l3=new JLabel();
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                l3.setText("Sum="+sum);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int prod=num1*num2;
                l3.setText("Product="+prod);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int diff=num1-num2;
                l3.setText("Difference="+diff);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int quotient=num1/num2;
                l3.setText("Quotient="+quotient);
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int remainder=num1%num2;
                l3.setText("Remainder="+remainder);
            }
        });
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(l3);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}