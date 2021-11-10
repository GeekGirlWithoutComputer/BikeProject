package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.duquesne.POJO.*;



import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Register extends JFrame
{

	private JPanel contentPane;

	
	public Register() 
	{
		Register activity = this;
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				Image img = Toolkit.getDefaultToolkit()
						.getImage(MainActivity.class
								.getResource("/be/duquesne/IMG/R.jpg")
								);
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_1.setBounds(47, 11, 662, 371);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		JButton btnArtiste = new JButton("CYCLO");
		btnArtiste.setBounds(23, 76, 209, 35);
		btnArtiste.setForeground(new Color(255, 255, 0));
		btnArtiste.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnArtiste.setBackground(Color.DARK_GRAY);
		panel_1.add(btnArtiste);
		btnArtiste.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				StrollChoice page = new StrollChoice();
				page.setVisible(true);
				
				activity.dispose();
			}
		});
		
		JButton btnManager = new JButton("VTT");
		btnManager.setForeground(new Color(255, 255, 0));
		btnManager.setBackground(Color.DARK_GRAY);
		btnManager.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnManager.setBounds(22, 133, 210, 35);
		panel_1.add(btnManager);
		
		btnManager.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				/*
				RegisByStatus page = new RegisByStatus(Manager.statut);
				page.setVisible(true);
				
				activity.dispose();
				*/
			}
		});
		//retour premiere page on peut aussi envisager de fre retour sur strt activity
		JButton btnRetour = new JButton("BACK");
		btnRetour.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 20));
		btnRetour.setBounds(472, 319, 87, 41);
		btnRetour.setBackground(Color.RED);
		btnRetour.setForeground(Color.BLACK);
		btnRetour.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainActivity page = new MainActivity();
				page.setVisible(true);
				activity.dispose();
			}
		});
		panel_1.add(btnRetour);
		
		
		
		JLabel lblNewLabel = new JLabel("Registration as : ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana Pro Cond Black", Font.BOLD, 28));
		lblNewLabel.setBounds(116, 24, 392, 41);
		panel_1.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("TRIALIST");
		rdbtnNewRadioButton.setBounds(379, 163, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DESCENDER");
		rdbtnNewRadioButton_1.setBounds(379, 201, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("HIKER");
		rdbtnNewRadioButton_2.setBounds(379, 242, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("VTT");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(373, 102, 186, 41);
		panel_1.add(lblNewLabel_1);
	}
}
