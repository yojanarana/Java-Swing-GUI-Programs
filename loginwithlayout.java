import javax.swing.*;
import java.awt.*;

public class loginwithlayout {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Register");
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Name:");
        f1.add(l1);
        JTextField t1=new JTextField(15);
        f1.add(t1);
        JLabel l2=new JLabel("Password:");
        f1.add(l2);
        JPasswordField p1 =new JPasswordField(13);
        f1.add(p1);
        JButton b1=new JButton("Login");
        f1.add(b1);
        f1.setVisible(true);
    }
}