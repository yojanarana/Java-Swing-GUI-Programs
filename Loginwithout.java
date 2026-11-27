import javax.swing.*;
public class Loginwithout{
    public static void main(String[] args) {
        JFrame f1=new JFrame("Register");
        f1.setSize(300,300);
        f1.setLayout(null);
        JLabel l1=new JLabel("Name:");
        l1.setBounds(10,10,150,20);
        f1.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(70,10,200,20);
        f1.add(t1);
        JLabel l2=new JLabel("Password:");
        l2.setBounds(10,50,150,20);
        f1.add(l2);
        JPasswordField p1 =new JPasswordField();
        p1.setBounds(80,50,190,20);
        f1.add(p1);
        JButton b1=new JButton("Login");
        b1.setBounds(80,90,100,30);
        f1.add(b1);
        f1.setVisible(true);
    }
}