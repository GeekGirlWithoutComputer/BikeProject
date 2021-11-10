
package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import com.toedter.components.JSpinField;
import be.duquesne.POJO.Category;
import be.duquesne.POJO.Person;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSpinner;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class test2 extends JFrame 
{
	
	/*                       VARIABLES                                                      */

	private JPanel contentPane;
	private Person personne;
	
	private Category catItem;
	Category configItem;
	
	private JButton btnDeconn;
	private test2 activity;
	private JButton btnAchat;
	private JPanel panel;
	private JSpinField trialist, hiker, descender;
	private JLabel lblDiamant, lblBronze, lblArgent, lblOr;
	private JLabel lblBase;
	
	
	
	
	
	
	List<Category> catList ;
   /*                                                                               */
	public test2() 
	{
		activity=this;
		
		 
		
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 681, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		/*     BOUTON POUR CONFIRMER L ACHAT DES PLACES                             */
		
		btnAchat = new JButton("ACHETER");
		btnAchat.setBackground(Color.DARK_GRAY);
		btnAchat.setForeground(Color.WHITE);
		btnAchat.setBounds(10, 287, 308, 72);
		btnAchat.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		
		panel.add(btnAchat);
		lblBronze = new JLabel("BRONZE");
		lblBronze.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArgent = new JLabel("ARGENT");
		lblArgent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiamant = new JLabel("DIAMANT");
		lblDiamant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hiker = new JSpinField();
		trialist = new JSpinField();
		descender= new JSpinField();
		
		lblBronze.setBounds(55, 52, 87, 27);
		lblArgent.setBounds(39, 89, 87, 27);
		hiker.setBounds(151, 89, 80, 27);
		trialist.setBounds(151, 126, 80, 27);
		descender.setBounds(151, 52, 80, 27);
		lblDiamant.setBounds(39, 163, 87, 27);
		
		
		panel.add(hiker);
		panel.add(lblArgent);
		panel.add(trialist);
		panel.add(descender);
		panel.add(lblDiamant);
		panel.add(lblOr);
		
		hiker.setMinimum(0);
		descender.setMinimum(0);
		trialist.setMinimum(0);
		
		
		
		btnDeconn = new JButton("DECONNEXION");
		btnDeconn.setBounds(314, 287, 332, 72);
		panel.add(btnDeconn);
		btnDeconn.setForeground(Color.WHITE);
		btnDeconn.setBackground(Color.DARK_GRAY);
		
		
		btnDeconn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				StartActivity page = new StartActivity();
				page.setVisible(true);
				activity.dispose();
			}
		});

		
		
		
		
	
		
	}

	
	
	
	
	
	
	
	
	
/***************************************************************************************************************************
 * 
 * 
 * 
 * EN FCT DE TTES LES PLACES QUE LE CLIENT AURA SELECT ON VA CALCULER SELON LE PRIX DE CHAQUE PLACE ET FIRE LE TOT
 * 
 * 
 * 
 * 	
 *************************************************************************************************************************/
	
	
/**********************************************************************************************************
 * 
 * ici on va devoir aller chercher ds representation le spectacle associé et le nbre de place par client
 * ensuite on chope ttes les valeurs entree par le client 
 * si ce que le client selct est oki on retourne 1 si pas 0 
 * 
************************************************************************************************************ */
	
	/****************************************************************************************************
	 * 
	 * 
	 * ici on va chercher les diff categories qui sont ds les differentes config cirque debout cirque assis
	 * 
	 * ****************************************************************************************************/
	
/**************************************************************************************************************************
 * 
 * 
 * 			ON VERIFIE CE QUE RENVOIE LES DEUX  FONCTIONS QUI VERIF NBRE DE PLCES 
 * 			pour rappel si 0 pas oki si 1 oki 
 * 			
 * 
 * **************************************************************************************************************************/
	
}
