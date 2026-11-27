import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu, exportMenu;
    JMenuItem newItem, openItem, saveItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem;
    JMenuItem pdfItem, txtItem, aboutItem;
    JLabel lblStatus;

    public menu() {
        setTitle("Menu and Submenu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblStatus = new JLabel("Select a menu item", SwingConstants.CENTER);
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        add(lblStatus, BorderLayout.CENTER);

        // Menu bar
        menuBar = new JMenuBar();

        // File menu
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Submenu inside File menu
        exportMenu = new JMenu("Export As");
        pdfItem = new JMenuItem("PDF");
        txtItem = new JMenuItem("Text File");
        exportMenu.add(pdfItem);
        exportMenu.add(txtItem);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exportMenu);   // submenu
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit menu
        editMenu = new JMenu("Edit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Help menu
        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set menu bar on frame
        setJMenuBar(menuBar);

        // Register listeners
        JMenuItem[] items = {newItem, openItem, saveItem, exitItem, cutItem,
                copyItem, pasteItem, pdfItem, txtItem, aboutItem};
        for (JMenuItem item : items) {
            item.addActionListener(this);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "Menu Demo using Java Swing");
        } else {
            lblStatus.setText(e.getActionCommand() + " clicked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new menu());
    }
}