package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import be.duquesne.POJO.Member;
import be.duquesne.POJO.Person;
import be.duquesne.POJO.Treasurer;

public class LoginByStatut extends JFrame 
{

	private JPanel contentPane;

	public LoginByStatut() 
	{
		LoginByStatut activity=this;
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
		
		// creation d un panel pour taper une photo en background 
		JPanel panel_1 = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				Image img = Toolkit.getDefaultToolkit()
						.getImage(MainActivity.class
								.getResource("/be/duquesne/IMG/c.jpg")
								);
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_1.setBounds(10, 11, 434, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_1.setBounds(22, 10, 662, 371);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		JButton btnMember = new JButton("MEMBER");
		btnMember.setEnabled(false);
		btnMember.setForeground(UIManager.getColor("CheckBox.focus"));
		btnMember.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnMember.setBackground(Color.DARK_GRAY);
		btnMember.setBounds(60, 100, 135, 57);
		panel_1.add(btnMember);
		btnMember.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Login page = new Login(Member.statut);
				page.setVisible(true);
				activity.dispose();
			}
		});
		
		JButton btnRetour = new JButton("RETOUR MENU PRINCIPAL");
		btnRetour.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnRetour.setBounds(141, 319, 485, 48);
		btnRetour.setBackground(Color.RED);
		btnRetour.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartActivity page = new StartActivity();
				page.setVisible(true);
				activity.dispose();
			}
		});
		panel_1.add(btnRetour);
		
		panel_1.setBounds(10, 11, 694, 390);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Connexion en tant que :");
		lblNewLabel.setBackground(UIManager.getColor("Button.light"));
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(31, 17, 598, 72);
		panel_1.add(lblNewLabel);

		
		JButton btnManager = new JButton("TREASURER");
		btnManager.setEnabled(false);
		btnManager.setBackground(Color.DARK_GRAY);
		btnManager.setForeground(UIManager.getColor("CheckBox.focus"));
		btnManager.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnManager.setBounds(450, 100, 135, 57);
		panel_1.add(btnManager);
		btnManager.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Login page = new Login(Treasurer.statut);
				page.setVisible(true);
				activity.dispose();
			}
		});

	}

}
