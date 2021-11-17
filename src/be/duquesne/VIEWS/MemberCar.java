package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class MemberCar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldvehicule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberCar frame = new MemberCar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberCar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modele du vehicule:");
		lblNewLabel.setBounds(5, 5, 158, 14);
		contentPane.add(lblNewLabel);
		
		textFieldvehicule = new JTextField();
		textFieldvehicule.setBounds(175, 2, 171, 20);
		contentPane.add(textFieldvehicule);
		textFieldvehicule.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de place");
		lblNewLabel_1.setBounds(10, 41, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(185, 38, 83, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("enregistrer vehicule");
		btnNewButton.setBounds(201, 190, 198, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("nombre de velos disposables");
		lblNewLabel_2.setBounds(5, 99, 173, 17);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(185, 99, 83, 20);
		contentPane.add(spinner_1);
	}
}
