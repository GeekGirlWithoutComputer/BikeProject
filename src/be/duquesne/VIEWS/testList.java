package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import be.duquesne.POJO.Category;

public class testList extends JFrame 
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testList frame = new testList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel contentPane;
	private List<Category> all = new ArrayList<Category>();
	private JComboBox<Category> sp_cm;
	private Category lacat;
	private JTextField un;
	private JTextField deux;
	private JTextField date;
	private JTextField nb;
	private JTextField sp;
	private JButton btnPlace;
	private JTextField spp;
	private testList activity;
	
	public testList() 
	{
		activity=this;
		
		List();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sp_cm = new JComboBox<Category>();
		sp_cm.setBounds(10, 104, 318, 32);
		contentPane.add(sp_cm);
		
		 	un = new JTextField();
		    un.setBounds(10, 166, 264, 32);
		    contentPane.add(un);
		    un.setColumns(10);
		    
		    deux = new JTextField();
		    deux.setBounds(10, 222, 264, 28);
		    contentPane.add(deux);
		    deux.setColumns(10);
		
		createCombobox();
	}
	
	public void List() 
	{
		Category ct = new Category();
		all = ct.findAll();
	}
	public Category createCombobox() 
	{
		Category ct = new Category();
		ct.findAll();
		sp_cm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				activity.setId();
			}
		});
		//JOptionPane.showMessageDialog(null, "taille radio ."+ size.toString());
		
		for (Category  sp:
			all) 
		{
			sp_cm.addItem(sp);
		}		
		// JOptionPane.showMessageDialog( null,"item id ."+currentSpectacle); // test
		
		;
	
		return lacat =(Category) sp_cm.getSelectedItem();
	}
	
	public void setId()
	{
		Category ct = new Category();
		ct= (Category) sp_cm.getSelectedItem();
		un.setText("no  : "+ct.getCodeCat());
		deux.setText("nom : "+ ct.getType());
		
		
		
		
		
		
		
	}	

}
