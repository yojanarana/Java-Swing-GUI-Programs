import java.awt.*;
import javax.swing.*;
public class Register {
    public static void main(String[] args) {
        JFrame f1=new JFrame();
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Name:");
        JTextField t1=new JTextField(15);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Email:");
        JTextField t2=new JTextField(15);
        f1.add(l2);f1.add(t2);
        JLabel l3=new JLabel("Password:");
        JPasswordField p1=new JPasswordField(15);
        f1.add(l3);f1.add(p1);
        JLabel l4=new JLabel("Confirm Password:");
        JPasswordField p2=new JPasswordField(10);
        f1.add(l4);f1.add(p2);
        JButton b1=new JButton("Register");
        f1.add(b1);
        f1.setVisible(true);
    }
}