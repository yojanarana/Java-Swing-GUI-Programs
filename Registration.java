import javax.swing.*;
import java.awt.*;
public class Registration {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Registration");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Name:");
        JTextField t1=new JTextField(15);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Gender:");
        JRadioButton b1=new JRadioButton("Male");
        JRadioButton b2=new JRadioButton("Female");
        JRadioButton b3=new JRadioButton("Other");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);bg.add(b2);bg.add(b3);
        f1.add(l2);f1.add(b1);f1.add(b2);f1.add(b3);
        JLabel l3=new JLabel("Hobbies:");
        JCheckBox c1=new JCheckBox("Singing");
        JCheckBox c2=new JCheckBox("Dancing");
        JCheckBox c3=new JCheckBox("Playing");
        f1.add(l3);f1.add(c1);f1.add(c2);f1.add(c3);
        JLabel l4=new JLabel("Country:");
        String []country={"United States","Nepal","UK","Japan","Korea","Dubai","Qatar"};
        JComboBox co=new JComboBox(country);
        f1.add(l4);f1.add(co);
        JLabel l5=new JLabel("About You:");
        JTextArea a1=new JTextArea(10,20);
        f1.add(l5);f1.add(a1);
        JButton bt1=new JButton("Register");
        JButton bt2=new JButton("Clear");
        f1.add(bt1);f1.add(bt2);
        f1.setVisible(true);
    }
}