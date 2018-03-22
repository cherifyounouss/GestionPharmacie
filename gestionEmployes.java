package cherif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class gestionEmployes {

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionEmployes window = new gestionEmployes();
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
	public gestionEmployes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Supprimer Employés");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				deleteEmploye window = new deleteEmploye();
				window.frame.setVisible(true);
			}
		});
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblNewLabel.setBounds(18, 286, 218, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Ajouter Employés");
		label.setFont(new Font("Krungthep", Font.PLAIN, 18));
		label.setForeground(Color.WHITE);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//{ 
				//gestionEmployes window = new gestionEmployes();
					 //addEmploye.frame.setVisible(true); 
				//	this.setVisible(false); 
					//} 
		     	frame.setVisible(false);
				addEmploye window = new addEmploye();
				window.frame.setVisible(true);
			}
		});
		
		label.setBounds(242, 169, 197, 50);
		frame.getContentPane().add(label);
		
		JLabel lblListerEmploys = new JLabel("Lister Employés");
		lblListerEmploys.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				frame.setVisible(false);
				displayEmploy window = new displayEmploy();
				window.frame.setVisible(true);
			}
		});
		lblListerEmploys.setForeground(Color.WHITE);
		lblListerEmploys.setFont(new Font("Krungthep", Font.PLAIN, 18));
		lblListerEmploys.setBounds(436, 286, 164, 50);
		frame.getContentPane().add(lblListerEmploys);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					JakTest window = new JakTest();
					window.frame.setVisible(true);
			}
		});
		label_3.setIcon(new ImageIcon(gestionEmployes.class.getResource("/cherif/retour.png")));
		label_3.setBounds(248, 278, 134, 58);
		frame.getContentPane().add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(gestionEmployes.class.getResource("/cherif/Sans-titre---40.jpg")));
		label_2.setBounds(91, 0, 623, 99);
		frame.getContentPane().add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(gestionEmployes.class.getResource("/cherif/farma1.png")));
		label_1.setBounds(0, 0, 720, 685);
		frame.getContentPane().add(label_1);
		frame.setBounds(100, 100, 720, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
