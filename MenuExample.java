import java.awt.*;
import javax.swing.*;
public class MenuExample {
    public static void main(String[] args){
        JFrame f1=new JFrame("Menu Example");
        f1.setSize(300,300);
        JMenuBar b1=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenu sm1=new JMenu("Export");
        m1.add(i1);m1.add(i2);m1.add(sm1);
        JMenuItem i3=new JMenuItem("Pdf");
        JMenuItem i4=new JMenuItem("JPG");
        JMenuItem i5=new JMenuItem("PNG");
        sm1.add(i3);sm1.add(i4);sm1.add(i5);
        JMenu m2=new JMenu("Edit");
        JMenu m3=new JMenu("Help");
        JMenu m4=new JMenu("About");
        b1.add(m1);b1.add(m2);b1.add(m3);b1.add(m4);
        f1.setJMenuBar(b1);
        f1.setVisible(true);
    }
}