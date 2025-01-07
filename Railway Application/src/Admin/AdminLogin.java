

package Admin;

import User.UserLogin;
import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminLogin extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;
    private JLabel label;
    private JLabel label_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminLogin frame = new AdminLogin();
                    frame.setTitle("Railway Ticketing");
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AdminLogin() {
        this.setDefaultCloseOperation(3);
        this.setBounds(450, 190, 1014, 597);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Railway Reservation Admin Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", 0, 46));
        lblNewLabel.setBounds(235, 13, 689, 126);
        this.contentPane.add(lblNewLabel);
        this.textField = new JTextField();
        this.textField.setFont(new Font("Tahoma", 0, 32));
        this.textField.setBounds(481, 170, 281, 68);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        this.passwordField = new JPasswordField();
        this.passwordField.setFont(new Font("Tahoma", 0, 32));
        this.passwordField.setBounds(481, 286, 281, 68);
        this.contentPane.add(this.passwordField);
        JLabel lblUsername = new JLabel("Admin-ID");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", 0, 31));
        lblUsername.setBounds(250, 178, 193, 52);
        this.contentPane.add(lblUsername);
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", 0, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        this.contentPane.add(lblPassword);
        this.btnNewButton = new JButton("Login");
        this.btnNewButton.setFont(new Font("Tahoma", 0, 31));
        this.btnNewButton.setBounds(538, 392, 224, 73);
        this.btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean i = false;
                boolean j = false;
                String ustr = AdminLogin.this.textField.getText();
                String pstr = AdminLogin.this.passwordField.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3000/railway", "root", "pradumya");
                    PreparedStatement st = (PreparedStatement)con.prepareStatement("Select user,pass from faculty where user=? and pass=?");
                    st.setString(1, ustr);
                    st.setString(2, pstr);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        i = true;
                    } else {
                        i = false;
                    }
                } catch (Exception var9) {
                    System.out.println(var9);
                }

                if (i) {
                    AdminLogin.this.dispose();
                    AdminHome ah = new AdminHome();
                    ah.setTitle("Faculty Home");
                    ah.setVisible(true);
                    JOptionPane.showMessageDialog(AdminLogin.this.btnNewButton, "You have successfully logged in");
                } else {
                    JOptionPane.showMessageDialog(AdminLogin.this.btnNewButton, "Wrong Username & Password");
                }

            }
        });
        this.contentPane.add(this.btnNewButton);
        this.btnNewButton_1 = new JButton("User Panel");
        this.btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin.this.dispose();
                UserLogin us = new UserLogin();
                us.setTitle("Student-Login");
                us.setVisible(true);
            }
        });
        this.btnNewButton_1.setFont(new Font("Tahoma", 0, 33));
        this.btnNewButton_1.setBounds(250, 387, 262, 83);
        this.contentPane.add(this.btnNewButton_1);
        this.label_1 = new JLabel("");
        this.label_1.setBounds(0, 0, 1008, 562);
        this.contentPane.add(this.label_1);
    }
}
