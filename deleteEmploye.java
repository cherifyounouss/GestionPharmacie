package cherif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteEmploye {

	protected JFrame frame;
	private JTextField delId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteEmploye window = new deleteEmploye();
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
	public deleteEmploye() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVeuillezDonnerLidentifiant = new JLabel("Identifiant de l’employé à supprimer");
		lblVeuillezDonnerLidentifiant.setFont(new Font("Krungthep", Font.BOLD, 18));
		lblVeuillezDonnerLidentifiant.setForeground(Color.WHITE);
		lblVeuillezDonnerLidentifiant.setBounds(0, 148, 371, 34);
		frame.getContentPane().add(lblVeuillezDonnerLidentifiant);
		
		JLabel lblDelete = new JLabel("DELETE");
		lblDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try{
		                String delIdent = delId.getText();
		                Class.forName("com.mysql.jdbc.Driver");
		                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie","root","");
		                Statement stmt=con.createStatement();
		                String query = "DELETE FROM employe WHERE identifiant = '"+delIdent+"'";
		                stmt.executeUpdate(query);
		            }
		            catch (Exception x){
		                JOptionPane.showMessageDialog(null, x.getMessage());
		            }
			}
		});
		lblDelete.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblDelete.setForeground(Color.WHITE);
		lblDelete.setBackground(Color.WHITE);
		lblDelete.setBounds(578, 417, 70, 40);
		frame.getContentPane().add(lblDelete);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				gestionEmployes window = new gestionEmployes();
				window.frame.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(deleteEmploye.class.getResource("/cherif/retour.png")));
		label_1.setBounds(57, 403, 139, 68);
		frame.getContentPane().add(label_1);
		
		delId = new JTextField();
		delId.setBounds(372, 137, 289, 60);
		frame.getContentPane().add(delId);
		delId.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(deleteEmploye.class.getResource("/cherif/bg.png")));
		label.setBounds(0, -17, 715, 516);
		frame.getContentPane().add(label);
	}
}
