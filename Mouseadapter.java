import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mouseadapter {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Mouse");
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Num1:");
        JTextField t1=new JTextField(15);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Num2:");
        JTextField t2=new JTextField(15);
        f1.add(l2);f1.add(t2);
        JButton b1=new JButton("Calculate");
        JLabel l3=new JLabel();
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                l3.setText("Sum="+(a+b));
            }
            public void mouseExited(MouseEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                l3.setText("Product="+(a*b));
            }});
        f1.add(b1);f1.add(l3);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}