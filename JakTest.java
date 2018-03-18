package cherif;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JakTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JakTest window = new JakTest();
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
	public JakTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setEnabled(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 928, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/GererFournisseurs.png"));
		label_5.setForeground(new Color(0, 102, 0));
		label_5.setBounds(585, 278, 143, 54);
		frame.getContentPane().add(label_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/GererEmployes.png"));
		label_7.setBounds(500, 384, 143, 63);
		frame.getContentPane().add(label_7);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/Sans-titre.png"));
		label_6.setBounds(364, 277, 194, 91);
		frame.getContentPane().add(label_6);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/Afficher-recette.png"));
		label_4.setForeground(new Color(0, 102, 0));
		label_4.setBounds(280, 393, 143, 54);
		frame.getContentPane().add(label_4);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(0, 102, 0));
		label_2.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/EnregistrerLivraison.png"));
		label_2.setBounds(198, 294, 143, 54);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/Effectuer-vente.png"));
		label_3.setBounds(389, 188, 143, 63);
		frame.getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/Sans-titre---40.jpg"));
		label_1.setBounds(156, 0, 683, 91);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 922, 1136);
		label.setIcon(new ImageIcon("/Users/abdoukhadredieylanidrame/eclipse-workspace/cherif/src/cherif/farma.png"));
		frame.getContentPane().add(label);
	}
}
