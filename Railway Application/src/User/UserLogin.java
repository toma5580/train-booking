
package User;

import Admin.Add;
import Admin.AdminLogin;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class UserLogin extends JFrame {
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;
    private JLabel label;
    private JLabel label_1;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserLogin frame = new UserLogin();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public UserLogin() {
        this.setDefaultCloseOperation(3);
        this.setBounds(450, 190, 1014, 597);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Railway Ticket Booking");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", 0, 71));
        lblNewLabel.setBounds(215, 43, 755, 93);
        this.contentPane.add(lblNewLabel);
        this.btnNewButton = new JButton("Admin Login");
        this.btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserLogin.this.dispose();
                AdminLogin obj = new AdminLogin();
                obj.setTitle("Admin Login");
                obj.setVisible(true);
            }
        });
        this.btnNewButton.setFont(new Font("Tahoma", 0, 50));
        this.btnNewButton.setBounds(674, 172, 309, 298);
        this.contentPane.add(this.btnNewButton);
        this.btnNewButton_1 = new JButton("Book Tickets");
        this.btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Add obj = new Add();
                obj.setTitle("Booking Panel");
                obj.setVisible(true);
            }
        });
        this.btnNewButton_1.setFont(new Font("Tahoma", 0, 65));
        this.btnNewButton_1.setBounds(36, 172, 600, 298);
        this.contentPane.add(this.btnNewButton_1);
        this.label_1 = new JLabel("");
        this.label_1.setFont(new Font("Tahoma", 0, 50));
        this.label_1.setBounds(0, 0, 1008, 562);
        this.contentPane.add(this.label_1);
    }
}
