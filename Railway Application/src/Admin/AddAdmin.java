

package Admin;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class AddAdmin extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddAdmin frame = new AddAdmin();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public AddAdmin() {
        this.setBounds(450, 319, 1014, 460);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        final JTextArea nm = new JTextArea();
        nm.setFont(new Font("Segoe UI", 0, 35));
        nm.setBounds(280, 26, 688, 80);
        this.contentPane.add(nm);
        new ButtonGroup();
        final JTextArea sub = new JTextArea();
        sub.setFont(new Font("Segoe UI", 0, 37));
        sub.setBounds(280, 119, 688, 80);
        this.contentPane.add(sub);
        JLabel lblAdminName = new JLabel("Admin Name:");
        lblAdminName.setFont(new Font("Segoe UI", 0, 35));
        lblAdminName.setBounds(32, 26, 285, 81);
        this.contentPane.add(lblAdminName);
        final JTextArea idd = new JTextArea();
        idd.setFont(new Font("Segoe UI", 0, 38));
        idd.setBounds(280, 212, 688, 81);
        this.contentPane.add(idd);
        JLabel lblAdminId = new JLabel("Admin ID:");
        lblAdminId.setFont(new Font("Segoe UI", 0, 35));
        lblAdminId.setBounds(32, 130, 285, 81);
        this.contentPane.add(lblAdminId);
        JLabel lblAdminEmail = new JLabel("Admin Email:");
        lblAdminEmail.setFont(new Font("Segoe UI", 0, 35));
        lblAdminEmail.setBounds(32, 212, 285, 81);
        this.contentPane.add(lblAdminEmail);
        final JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                if (a == 0) {
                    String name1 = nm.getText();
                    String sub1 = sub.getText();
                    int j = 0;
                    String id1 = idd.getText();

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3000/railway", "root", "pradumya");
                        PreparedStatement st = (PreparedStatement)con.prepareStatement("INSERT INTO faculty(name,user,email,pass) values(?,?,?,?)");
                        st.setString(1, name1);
                        st.setString(2, id1);
                        st.setString(3, sub1);
                        st.setString(4, "UEMK");
                        j = st.executeUpdate();
                    } catch (Exception var9) {
                        System.out.println(var9);
                    }

                    boolean i = false;
                    if (j == 1) {
                        String n = "\n";
                        JOptionPane.showMessageDialog(btnNewButton, "Congratulations," + n + "Events is added sucessfully" + n + "Thankyou.");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Please,enter the informations");
                    }
                }

            }
        });
        btnNewButton.setFont(new Font("Segoe UI", 0, 35));
        btnNewButton.setBounds(388, 320, 197, 80);
        this.contentPane.add(btnNewButton);
    }
}
