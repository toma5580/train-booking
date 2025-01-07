

package Admin;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {
    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public Home() {
        this.setBounds(450, 319, 1014, 460);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBounds(490, 441, 97, 25);
        this.contentPane.add(btnNewButton);
        String[][] data = new String[100][2];
        int i = 0;
//        boolean j = false;
        List li1 = new List();
        List li2 = new List();
        new List();
        new List();
        new List();
        new List();
        new List();
        new List();
        String[] columnNames = new String[]{"Name", "Department"};

        try {
            System.out.println("add");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3000/railway", "root", "pradumya");
            PreparedStatement st = (PreparedStatement)con.prepareStatement("Select name,class,section,roll,teach from students");
            ResultSet rs = st.executeQuery();
            li1.add("|-----|Name|-----|");
            li2.add("|-----|Destination-ID-Time-From|-----|");

            while(rs.next()) {
                li1.add(rs.getString(1));
                ++i;
                li2.add(rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getString(4) + "-" + rs.getString(5));
            }
        } catch (Exception var17) {
            System.out.println(var17);
        }

        String[][] data1 = new String[i][i];
        int j = 0;

        for(int k = 0; k < i; ++k) {
            data1[k][j] = li1.getItem(k);
            j = j + 1;
            data1[k][j] = li2.getItem(k);
            j = 0;
        }

        this.table = new JTable(data1, columnNames);
        this.table.setBounds(12, 13, 1014, 460);
        this.contentPane.add(this.table);
    }
}
