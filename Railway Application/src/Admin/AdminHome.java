

package Admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class AdminHome extends JFrame {
    private JPanel contentPane;
    private JFrame jf;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminHome frame = new AdminHome();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AdminHome() {
        this.setDefaultCloseOperation(3);
        this.setBounds(450, 190, 1014, 597);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1008, 26);
        this.contentPane.add(menuBar);
        JMenu mnNewMenu_1 = new JMenu("Main Menu");
        menuBar.add(mnNewMenu_1);
        JMenuItem mntmAddOldBooks = new JMenuItem("Add Admin \r\n");
        mntmAddOldBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Add obj = new Add();
                obj.setVisible(true);
            }
        });
        mnNewMenu_1.add(mntmAddOldBooks);
        final JButton btnNewButton = new JButton("Log Out");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                if (a == 0) {
                    AdminHome.this.dispose();
                    AdminLogin ms = new AdminLogin();
                    ms.setTitle("Faculty Login");
                    ms.setVisible(true);
                }

            }
        });
        btnNewButton.setBounds(899, 39, 97, 25);
        this.contentPane.add(btnNewButton);
        JButton btnAllEvents = new JButton("See All Bookings");
        btnAllEvents.setFont(new Font("Tahoma", 0, 65));
        btnAllEvents.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Home obj = new Home();
                obj.setVisible(true);
            }
        });
        btnAllEvents.setBounds(41, 88, 912, 236);
        this.contentPane.add(btnAllEvents);
        JButton btnAddFaculty = new JButton("Add Railway Manager");
        btnAddFaculty.setFont(new Font("Tahoma", 0, 48));
        btnAddFaculty.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddAdmin obj = new AddAdmin();
                obj.setVisible(true);
            }
        });
        btnAddFaculty.setBounds(41, 345, 912, 166);
        this.contentPane.add(btnAddFaculty);
        JMenu mnNewMenu = new JMenu("Search");
        mnNewMenu.setBounds(0, 39, 58, -32);
        this.contentPane.add(mnNewMenu);
        JLabel label = new JLabel("");
        label.setBackground(Color.BLACK);
        label.setBounds(0, 26, 1008, 536);
        this.contentPane.add(label);
    }
}
