package be.duquesne.VIEWS;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import be.duquesne.POJO.Person;
import be.duquesne.POJO.Stroll;

public class StrollList extends JFrame 
{

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{	
					StrollList frame = new StrollList();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private JPanel contentPane;
	private DefaultListModel<String> listModelArt = new DefaultListModel<>();
	private DefaultListModel<Stroll> listModelRep = new DefaultListModel<>();
	private JScrollPane scrollPane;
	private JList<String> jListArt;
	private JList<Stroll> jListRepresentation;
	private JButton btnClose;
	private JLabel genre;
	private StrollList activity;
	
	
	
	private Stroll s = new Stroll();
	private Person personne;
	
	
	private JComboBox<Stroll> Spp;
	
	
	private   JLabel libel,test;
	private TextArea txydescr;

	public StrollList() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel_1 = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				Image img = Toolkit.getDefaultToolkit()
						.getImage(MainActivity.class
								.getResource("/be/duquesne/IMG/ss.jpg")
								);
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panel_1.setBounds(0, 0, 664, 562);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		Spp = new JComboBox<Stroll>();
		Spp.setBackground(Color.LIGHT_GRAY);
		Spp.setBounds(10, 11, 404, 30);
		panel_1.add(Spp);
		
		test = new JLabel("\" \" ");
	       test.setForeground(new Color(245, 255, 250));
	       test.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 12));
	       test.setBackground(UIManager.getColor("Button.highlight"));
	       test.setBounds(189, 157, 193, 30);
	       panel_1.add(test);
	       
	        genre = new JLabel("\" \"");
	        genre.setForeground(new Color(240, 255, 255));
	        genre.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 12));
	        genre.setBackground(UIManager.getColor("Button.highlight"));
	        genre.setBounds(25, 129, 251, 14);
	        panel_1.add(genre);
	        
	         
	         libel = new JLabel("\" \"");
	         libel.setForeground(new Color(240, 255, 255));
	         libel.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 12));
	         libel.setBackground(UIManager.getColor("Button.highlight"));
	         libel.setBounds(11, 69, 207, 25);
	         panel_1.add(libel);
	         
	         txydescr = new TextArea();
	         txydescr.setBounds(25, 162, 146, 79);
	         panel_1.add(txydescr);
	         
	        JButton btnRetour = new JButton("RETOUR MENU PRINCIPAL");
	 		btnRetour.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
	 		btnRetour.setBounds(310, 504, 320, 36);
	 		btnRetour.setBackground(Color.RED);
	 		btnRetour.setForeground(UIManager.getColor("CheckBox.darkShadow"));
	 		btnRetour.addActionListener(new ActionListener() 
	 		{
	 			public void actionPerformed(ActionEvent e) 
	 			{
	 				StartActivity page = new StartActivity();
	 				page.setVisible(true);
	 				activity.dispose();
	 			}
	 		});
	 		panel_1.add(btnRetour);
			
			activity = this;
			
			init();
			
			
			createCombobox() ;
			
	}
	private List<Stroll> allS = new ArrayList<Stroll>();
	public Stroll  createCombobox() 
	{
		Spp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				activity.setId();
			}
		});
		
		
		//JOptionPane.showMessageDialog(null, "taille radio ."+ size.toString());
		for (Stroll  sp: allS) 
		{
			Spp.addItem(sp);
			
		}		
		// JOptionPane.showMessageDialog( null,"item id ."+currentSpectacle); // test
		
		;
	
		return s =(Stroll) Spp.getSelectedItem();
	}
	
	public void setId()
	{
	//selection de l item
		s= (Stroll) Spp.getSelectedItem();
	
		
		
		libel.setText("nom de la balade  :  "+s.getNameStroll());
		
			
		
		
		test.setText("NO : "+Integer.toString(s.getNumStroll()));
		
		genre.setText("lieux de depart : "+s.getPlaceOfDepartune());
		 
		txydescr.setText("prix  : "+s.getCost());
		
		
	}
	public void init() 
	{
		Stroll balade= new Stroll();
		allS = balade.findAll();
	}
}
