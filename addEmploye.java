package cherif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class addEmploye {

	protected JFrame frame;
	protected JTextField mdp;
	private JTextField surname;
	private JTextField id;
	private JTextField tel;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEmploye window = new addEmploye();
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
	public addEmploye() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 0));
		frame.getContentPane().setLayout(null);
		
		mdp = new JTextField();
		mdp.setBounds(267, 446, 279, 37);
		frame.getContentPane().add(mdp);
		mdp.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblNom.setBounds(63, 133, 61, 16);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setBounds(63, 199, 78, 29);
		frame.getContentPane().add(lblPrenom);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setForeground(Color.WHITE);
		lblTelephone.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblTelephone.setBounds(63, 277, 115, 24);
		frame.getContentPane().add(lblTelephone);
		
		JLabel lblIdentifiant = new JLabel("Identifiant");
		lblIdentifiant.setForeground(Color.WHITE);
		lblIdentifiant.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblIdentifiant.setBounds(63, 364, 115, 29);
		frame.getContentPane().add(lblIdentifiant);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setBounds(63, 450, 166, 24);
		frame.getContentPane().add(lblMotDePasse);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(addEmploye.class.getResource("/cherif/Sans-titre---40.jpg")));
		label_1.setBounds(77, 6, 607, 102);
		frame.getContentPane().add(label_1);
		
		surname = new JTextField();
		surname.setColumns(10);
		surname.setBounds(267, 197, 279, 37);
		frame.getContentPane().add(surname);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(267, 362, 279, 37);
		frame.getContentPane().add(id);
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBounds(267, 273, 279, 37);
		frame.getContentPane().add(tel);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(267, 125, 279, 37);
		frame.getContentPane().add(name);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				gestionEmployes window = new gestionEmployes();
				window.frame.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(addEmploye.class.getResource("/cherif/retour.png")));
		label.setBounds(25, 533, 135, 64);
		frame.getContentPane().add(label);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				 String identifiant =id.getText();
	                String nom = name.getText();
	               String prenom = surname.getText();
	                String motPasse = new String(mdp.getText());
	               String numTel = tel.getText();
	               
	               Class.forName("com.mysql.jdbc.Driver");
	                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie","root","");
	                Statement stmt=con.createStatement();
	                String insertion = "INSERT INTO employe (identifiant, nom, prenom, mdp, telephone) VALUES ('"+identifiant+"', '"+nom+"', '"+prenom+"', '"+motPasse+"', '"+numTel+"' )";
	                 stmt.executeUpdate(insertion);
			}
					catch (Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
			}
		});
		label_3.setIcon(new ImageIcon(addEmploye.class.getResource("/cherif/enregistrer.png")));
		label_3.setBounds(541, 533, 143, 64);
		frame.getContentPane().add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(addEmploye.class.getResource("/cherif/farma1.png")));
		label_2.setBounds(0, -15, 719, 712);
		frame.getContentPane().add(label_2);
		frame.setBounds(100, 100, 719, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
