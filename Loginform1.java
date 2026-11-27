import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Loginform1
        extends JFrame
        implements ActionListener {

    JLabel lblTitle, lblUser, lblPass, lblMessage;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin, btnReset;

    public Loginform1() {
        setTitle("Login Form");
        setSize(350, 280);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitle = new JLabel("LOGIN");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setBounds(125, 15, 100, 30);
        add(lblTitle);

        lblUser = new JLabel("Username:");
        lblUser.setBounds(40, 65, 80, 25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(130, 65, 170, 25);
        add(txtUser);

        lblPass = new JLabel("Password:");
        lblPass.setBounds(40, 105, 80, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(130, 105, 170, 25);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(60, 155, 100, 30);
        btnLogin.addActionListener(this);
        add(btnLogin);

        btnReset = new JButton("Reset");
        btnReset.setBounds(180, 155, 100, 30);
        btnReset.addActionListener(this);
        add(btnReset);

        lblMessage = new JLabel("", SwingConstants.CENTER);
        lblMessage.setBounds(40, 200, 260, 25);
        add(lblMessage);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                lblMessage.setForeground(new Color(0, 128, 0));
                lblMessage.setText("Login Successful!");
            } else {
                lblMessage.setForeground(Color.RED);
                lblMessage.setText("Invalid Username or Password");
            }
        } else if (e.getSource() == btnReset) {
            txtUser.setText("");
            txtPass.setText("");
            lblMessage.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loginform1());
    }
}