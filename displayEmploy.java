package cherif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class displayEmploy {

	protected JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	//protected JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayEmploy window = new displayEmploy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public displayEmploy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoadTable = new JButton("Load employee data\n");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie","root","");
	                Statement stmt=con.createStatement();
	                String query = "SELECT * FROM employe";
	                ResultSet rs = stmt.executeQuery(query);
	                table.setModel(DbUtils.resultSetToTableModel(rs));

					con.close();
					} 

				catch (Exception x){
	                JOptionPane.showMessageDialog(null, x.getMessage());
	            }

			}
		});
		btnLoadTable.setBounds(270, 67, 239, 29);
		frame.getContentPane().add(btnLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 128, 389, 264);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(0, 153, 0));
		table_1.setBounds(242, 128, 389, 264);
		frame.getContentPane().add(table_1);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				gestionEmployes window = new gestionEmployes();
				window.frame.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Identifiant");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setBounds(6, 129, 104, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMdp = new JLabel("Password");
		lblMdp.setForeground(Color.WHITE);
		lblMdp.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblMdp.setBounds(6, 178, 104, 29);
		frame.getContentPane().add(lblMdp);
		
		JLabel lblNom = new JLabel("Name");
		lblNom.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(6, 240, 53, 26);
		frame.getContentPane().add(lblNom);
		
		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_1.setBounds(6, 300, 86, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTlphone = new JLabel("Phone");
		lblTlphone.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblTlphone.setForeground(Color.WHITE);
		lblTlphone.setBounds(6, 361, 104, 31);
		frame.getContentPane().add(lblTlphone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 366, 123, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 306, 123, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(107, 124, 123, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 181, 120, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 242, 120, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnModifier.setBounds(488, 494, 124, 53);
		frame.getContentPane().add(btnModifier);
		label_1.setIcon(new ImageIcon(displayEmploy.class.getResource("/cherif/retour.png")));
		label_1.setBounds(27, 484, 134, 66);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 51, 0));
		label.setIcon(new ImageIcon(displayEmploy.class.getResource("/cherif/farma1.png")));
		label.setBounds(0, -21, 657, 729);
		frame.getContentPane().add(label);
	}
}
