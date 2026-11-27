import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorV2
        extends JFrame
        implements ActionListener{
    public JLabel l1,l2,l3;
    public JTextField t1,t2;
    public JButton b1,b2,b3,b4,b5;
    public CalculatorV2(){
        setSize(300,300);
        setLayout(new FlowLayout());
        l1=new JLabel("Num1:");
        t1=new JTextField(15);
        add(l1);add(t1);
        l2=new JLabel("Num2:");
        t2=new JTextField(15);
        add(l2);add(t2);
        b1=new JButton("Sum");
        b2=new JButton("Product");
        b3=new JButton("Difference");
        b4=new JButton("Quotient");
        b5=new JButton("Remainder");
        l3=new JLabel();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        add(b1);add(b2);add(b3);add(b4);add(b5);add(l3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getSource()==b1)
            l3.setText("Sum="+(n1+n2));
        if(e.getSource()==b2)
            l3.setText("Product="+(n1*n2));
        if(e.getSource()==b3)
            l3.setText("Difference="+(n1-n2));
        if(e.getSource()==b4)
            l3.setText("Quotient="+(n1/n2));
        if(e.getSource()==b5)
            l3.setText("Remainder="+(n1%n2)); }
    public static void main(String[] args) {
        new CalculatorV2();}}