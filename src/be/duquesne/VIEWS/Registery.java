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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import be.duquesne.POJO.Category;
import be.duquesne.POJO.Category.TypesMember;
import be.duquesne.POJO.Category.TypesVtt;
import be.duquesne.POJO.Member;
import be.duquesne.POJO.Person;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
/**/
public class Registery extends JFrame 
{

	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField name;
	private JTextField firstname;
	private JTextField email;
	private JTextField password;
	private JComboBox comboBox;
	private List<Person> all = new ArrayList<Person>();
	private JTextField adress;
	private JTextField telephon;
	private TypesVtt place = TypesVtt.CYCLO;
	private TypesMember p;
	ButtonGroup bG = new ButtonGroup();
	private JRadioButton r1 ,r2,r3;
	private String choose;
	private Member m;
	private Category cat ;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private Registery activity;
	private JTextField un;
	private JTextField deux;

	
	public Registery()
	{
		List();
		this.cat= new Category();
		
		 activity=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	    panel_1 = new JPanel() 
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
		panel_1.setBounds(22, 10, 662, 371);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		name = new JTextField();
		name.setBounds(21, 35, 185, 33);
		panel_1.add(name);
		name.setColumns(10);

		
		firstname = new JTextField();
		firstname.setColumns(10);
		firstname.setBounds(29, 323, 185, 33);
		panel_1.add(firstname);

		
		
		JLabel lblCat = new JLabel("De quelle categorie d\u00E9sirez vous faire partie ?");
		lblCat.setBounds(29, 243, 353, 33);
		panel_1.add(lblCat);
		
		comboBox = new JComboBox();

		//comboBox.setModel(new DefaultComboBoxModel(TypesVtt.values()));
		comboBox.setModel(new DefaultComboBoxModel(TypesMember.values()));
		
		comboBox.setBounds(360, 257, 180, 26);
		panel_1.add(comboBox);
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				p = (TypesMember) comboBox.getSelectedItem();
				//place=(TypesVtt)comboBox.getSelectedItem();
			
				//if(place==TypesVtt.CYCLO)
				if(p==TypesMember.CYCLO)
				{
					 creerChampCyclo() ;
				}
				//else if (place==TypesVtt.VTT)
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

		telephon = new JTextField();
		telephon = new JTextField();
		telephon = new JTextField();
		un = new JTextField();
	    un.setBounds(21, 351, 264, 32);
	    panel_1.add(un);
	    un.setColumns(10);
	    
	    deux = new JTextField();
	    deux.setBounds(10, 128, 264, 28);
	    panel_1.add(deux);
	    deux.setColumns(10);
		createChoise();
		
		creerChampCyclo();
		
		//JOptionPane.showMessageDialog(null, p);
		
		
		
	}
	
	
	
	
	
	private void createChoise() 
	{
		r1 = new JRadioButton("Hiker");
		r1.setBounds(360, 292, 109, 23);
		panel_1.add(r1);
		r2 = new JRadioButton("Descender");
		r2.setBounds(360, 318, 109, 23);
		panel_1.add(r2);
		
		r3 = new JRadioButton("Trialist");
		r3.setBounds(360, 344, 109, 23);
		panel_1.add(r3);
		// pr ne pas tous les selectionner  radio groupe
		bG.add(r1);
		bG.add(r2);
		bG.add(r3);
		 
		 JButton btnNewButton = new JButton("Valider");
		 btnNewButton.setBounds(249, 594, 188, 23);
		 panel_1.add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("enregistrer votre vehicule");
		 btnNewButton_1.setBounds(66, 487, 299, 23);
		 panel_1.add(btnNewButton_1);
		 
		 JButton btnRegis = new JButton("Valider");
		 btnRegis.addActionListener(new ActionListener() 
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		/*on suppose qu il n y a que des membres qui s inscrivent , le tresorier a ses logs differemment vu sa position */
		 		String statut = "MEMBER";
		 		place=choosePlace() ;//1511
		 		Person membre;
		 		
		 		int id=cat.findId();
		 		membre= new Member 
		 				(name.getText(),
		 		firstname.getText(),
		 		telephon.getText(),
		 		password.getText(),
		 		email.getText(),
		 				 		statut, adress.getText(),
		 				 		cat);
		 				 		//place);
		 		Person oki = membre.find();
		 		
		 		if(oki == null) 
				{
					Boolean oki2=membre.register();
							
					
					//JOptionPane.showMessageDialog(null, "register  ??:"+oki2);
					JOptionPane.showMessageDialog(null, "find id  ??:"+id);
					JOptionPane.showMessageDialog(null, "cat   ??:"+cat );
					
					if(oki2) 
					{
						JOptionPane.showMessageDialog(null, "Compte crée avec succes !");

						Registery page = new Registery();
						
						page.setVisible(true);
						activity.dispose();
					}
					
					else 
					{
						JOptionPane.showMessageDialog(null, "Erreur lors de la création du compte.");
					}
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Utilisateur  deja existant.");
				}
				
		 		
		 		choose();
		 	}
		 });
		 btnRegis.setBounds(39, 287, 149, 33);
		 panel_1.add(btnRegis);
		 
		 lblNewLabel = new JLabel("NOM");
		 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel.setBounds(21, 11, 185, 25);
		 panel_1.add(lblNewLabel);
		 
		 lblNewLabel_1 = new JLabel("PRENOM");
		 lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel_1.setBounds(21, 75, 185, 25);
		 panel_1.add(lblNewLabel_1);
		 
		 lblNewLabel_2 = new JLabel("TELEPHONE");
		 lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_2.setBounds(21, 155, 185, 33);
		 panel_1.add(lblNewLabel_2);
		 
		 lblNewLabel_3 = new JLabel("EMAIL");
		 lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_3.setBounds(355, 11, 185, 25);
		 panel_1.add(lblNewLabel_3);
		 
		 telephon = new JTextField();
		 telephon.setColumns(10);
		 telephon.setBounds(21, 199, 185, 33);
		 panel_1.add(telephon);
		 
		 email= new JTextField();
		 email .setColumns(10);
		 email .setBounds(355, 41, 185, 33);
		 panel_1.add(email );
		 
		 password = new JTextField();
		 password.setColumns(10);
		 password.setBounds(360, 111, 185, 33);
		 panel_1.add( password);
		 
		 lblNewLabel_4 = new JLabel("MOT DE PASSE");
		 lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_4.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel_4.setBounds(355, 83, 185, 25);
		 panel_1.add(lblNewLabel_4);
		 
		 adress = new JTextField();
		 adress.setColumns(10);
		 adress.setBounds(285, 199, 320, 33);
		 panel_1.add(adress);
		 
		 lblNewLabel_5 = new JLabel("ADRESSE");
		 lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_5.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 15));
		 lblNewLabel_5.setBounds(285, 167, 320, 25);
		 panel_1.add(lblNewLabel_5);
	}
	
	private void creerChampCyclo() 
	{
		
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
	
	
	
	public TypesMember setId3() 
	{
		Category ct = new Category();
		
		un.setText("no  : "+ct.getCodeCat());
		deux.setText("nom : "+ ct.getType());
		return p= (TypesMember) comboBox.getSelectedItem();

	}
	public void choose() 
	{
		
		if (r1.isSelected()) 
		{
			//choose="HIKER";
			this.cat.setType(place.HIKER);
			JOptionPane.showMessageDialog(null, "hiker"+place.HIKER);
			
			
		}
		else if (r2.isSelected()) 
		{
			this.cat.setType(place.DESCENDER);
			JOptionPane.showMessageDialog(null, "desc");
		}
		else if (r3.isSelected()) 
		{
			this.cat.setType(place.TRIALIST);
			JOptionPane.showMessageDialog(null, "tria");
		}
		else// ca prends CYCLO
		{
			
		}
	}
	
	public  TypesVtt choosePlace() 
	{
		
		if (r1.isSelected()) 
		{
			//choose="HIKER";
			this.cat.setType(place.HIKER);
			JOptionPane.showMessageDialog(null, "hiker"+place.HIKER);
			return place.HIKER;
			
			
		}
		else if (r2.isSelected()) 
		{
			this.cat.setType(place.DESCENDER);
			JOptionPane.showMessageDialog(null, "desc");
			return place.DESCENDER;
		}
		else if (r3.isSelected()) 
		{
			this.cat.setType(place.TRIALIST);
			JOptionPane.showMessageDialog(null, "tria");
			return place.TRIALIST;
		}
		//else// ca prends CYCLO
		{
			
			JOptionPane.showMessageDialog(null,setId3() );
			
			return place.CYCLO;
		}
	}
	
	public void List() 
	{
		
		Person pt = new Person();
		all = pt.findAll();
	}
}


