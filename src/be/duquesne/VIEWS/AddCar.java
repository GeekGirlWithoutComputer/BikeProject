package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddCar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCar frame = new AddCar();
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
	//recoit une personne a qui appartient le vehicule 
	public AddCar() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de places passagers:");
		lblNewLabel.setBounds(10, 43, 188, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreDePlaces = new JLabel("Nombre de places v\u00E9lo:");
		lblNombreDePlaces.setBounds(10, 78, 188, 24);
		contentPane.add(lblNombreDePlaces);
		
		JButton btnNewButton = new JButton("Ajouter ");
		btnNewButton.setBounds(245, 211, 136, 39);
		contentPane.add(btnNewButton);
	}
}
