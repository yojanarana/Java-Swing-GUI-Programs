import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseLister {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Mouse");
        f1.setSize(270,300);
        f1.setLayout(new FlowLayout());
        JButton b1=new JButton("Mousesss");
        JLabel l1=new JLabel();
        b1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                l1.setText("Clicked");
            }
            public void mousePressed(MouseEvent e) {
                l1.setText("Pressed");
            }
            public void mouseReleased(MouseEvent e) {
                l1.setText("Released");
            }
            public void mouseEntered(MouseEvent e) {
                l1.setText("Entered");
            }
            public void mouseExited(MouseEvent e) {
                l1.setText("Exited");
            }});
        f1.add(b1);f1.add(l1);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}