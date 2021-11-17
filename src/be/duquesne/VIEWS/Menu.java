package be.duquesne.VIEWS;

import java.awt.BorderLayout;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.JComboBox;

import be.duquesne.POJO.Person;

import javax.swing.JButton;

public class Menu extends JFrame 
{

	private JPanel contentPane;
	private JPanel panel;
	private Person personne;
	
	
	public Menu(Person personne)  
	{
		this.personne = personne;
		Menu activity = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				Image img = Toolkit.getDefaultToolkit()
						.getImage(MainActivity
						.class.getResource("/be/duquesne/IMG/s2.jpg"));
						g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel.setBounds(20, -13, 662, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRetour = new JButton("DECONNEXION");
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRetour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				StartActivity  page = new StartActivity () ;
				page.setVisible(true);
				activity.dispose();
			}
		});
		btnRetour.setForeground(Color.BLACK);
		btnRetour.setBackground(Color.RED);
		btnRetour.setBounds(445, 322, 207, 57);
		panel.add(btnRetour);
		
		
		JLabel lblType = new JLabel("BONJOUR  : " 
		+" " + personne.getStatut() + "  "
		+" " +personne.getEmail()
														
		           );
		lblType.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 15));
		lblType.setForeground(Color.WHITE);
		lblType.setBounds(92, 11, 563, 74);
		panel.add(lblType);
		
	}

}
