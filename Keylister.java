import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Keylister{
    public static void main(String[] args) {
        JFrame f1=new JFrame("KEy Example");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JTextField t1=new JTextField(15);
        JLabel l1=new JLabel();
        t1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                l1.setText("Typing");
            }
            public void keyPressed(KeyEvent e) {
                l1.setText("Pressed");
            }
            public void keyReleased(KeyEvent e) {
                l1.setText("Released");
            }
        });
        f1.add(t1);f1.add(l1);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}