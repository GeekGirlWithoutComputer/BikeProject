package VIEWS;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.toedter.calendar.JCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import com.toedter.components.JSpinField;

import be.duquesne.POJO.Category;
import be.duquesne.POJO.Category.TypesMember;
import be.duquesne.POJO.Category.TypesVtt;
import be.duquesne.VIEWS.MainActivity;
import be.duquesne.POJO.Person;
import javax.swing.JRadioButton;

public class test3 extends JFrame {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel contentPane;
	private Person personne;
	private JTextField titreField;
	private JPanel panel;
	private JLabel labelBronze, labelOr, labelArgent, labelDiamant;
	private JLabel labelArtiste;
	private TypesVtt place = TypesVtt.BASE;
	private TypesMember p;
	private int maxParPersonne;
	private JSpinField representationHeureMax, representationHeureMin, fieldBronze, fieldBase, fieldArgent, fieldOr,
			fieldDiamant, maxParPersonneField;
	private JCalendar calendar;
	
	private JButton addArtisteBtn;
	ButtonGroup bG = new ButtonGroup();
	private JRadioButton r1 ,r2,r3;

	/**
	 * Create the frame.
	 */
	public test3() 
	{
		
		test3 me = this;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 698);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 548, 661);
		contentPane.add(panel);
		panel.setLayout(null);
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(Color.DARK_GRAY);
		btnRetour.setForeground(Color.WHITE);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnRetour.setBounds(450, 10, 88, 26);
		panel.add(btnRetour);

		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(TypesMember.values()));

		comboBox.setBounds(318, 272, 180, 26);
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				p = (TypesMember) comboBox.getSelectedItem();
				resetChampPrix();
				if(p==TypesMember.CYCLO)
				{
					 creerChampCyclo() ;
				}
				else if (p==TypesMember.VTT)
				{
					creerChampVTT() ;
				}
				else
				{
					//cat prob 
				}
			}
		});
		JLabel labelConfiguration = new JLabel("Categorie");
		labelConfiguration.setFont(new Font("Dialog", Font.BOLD, 15));
		labelConfiguration.setForeground(Color.WHITE);
		labelConfiguration.setBounds(318, 254, 160, 13);
		panel.add(labelConfiguration);

		

		

	
		createChoise();
		resetChampPrix();
		creerChampCyclo();
		
	}

	

	
	private void createChoise() {
	
		
		 r1 = new JRadioButton("hiker");
		r1.setBounds(292, 457, 109, 23);
		panel.add(r1);
		
		 r2 = new JRadioButton("Descender");
		r2.setBounds(292, 500, 109, 23);
		panel.add(r2);
		
		r3 = new JRadioButton("Trialist");
		r3.setBounds(292, 553, 109, 23);
		panel.add(r3);
		// pr ne pas tous les selectionner  radio groupe
		 bG.add(r1);
		 bG.add(r2);
		 bG.add(r3);

		

		
	}

	public void create() {

		boolean isSpectacleCreated = creerSpectacle();
		if (isSpectacleCreated) {
			


			JOptionPane.showMessageDialog(null, "Ajouté avec succes !");
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout du spectacle !");
		}
		

	}

	
	

	

	

	private boolean creerSpectacle() {
		String titre = titreField.getText();
		
		return true;
	}

	private void setRepresentationButton() {
	}

	private Date getDate() {
		java.util.Date utilStartDate = calendar.getDate();
		return new java.sql.Date(utilStartDate.getTime());
	}

	

	

	

	private void resetChampPrix() {
		if (fieldBase != null)
			fieldBase.setVisible(false);
		if (fieldBronze != null)
			fieldBronze.setVisible(false);
		if (fieldOr != null)
			fieldOr.setVisible(false);
		if (fieldArgent != null)
			fieldArgent.setVisible(false);
		if (fieldDiamant != null)
			fieldDiamant.setVisible(false);
		if (labelBronze != null)
			labelBronze.setVisible(false);
		if (labelOr != null)
			labelOr.setVisible(false);
		if (labelArgent != null)
			labelArgent.setVisible(false);
		if (labelDiamant != null)
			labelDiamant.setVisible(false);
	}

	private void creerChampCyclo() 
	{
		//fieldBase.setVisible(true);
		r1.setVisible(false);
		r2.setVisible(false);
		r3.setVisible(false);
	}

	private void creerChampVTT() 
	{
		r1.setVisible(true);
		r2.setVisible(true);
		r3.setVisible(true);
	}

	
}
