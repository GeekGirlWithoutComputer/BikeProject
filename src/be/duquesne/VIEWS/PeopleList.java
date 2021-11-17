package be.duquesne.VIEWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.duquesne.POJO.Category;
import be.duquesne.POJO.Person;
import java.awt.Font;

public class PeopleList extends JFrame {

	private JPanel contentPane;
	private List<Person> all = new ArrayList<Person>();
	private JComboBox<Person> sp_cm;
	private Person lapers;

	public PeopleList() 
	{
		List();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		sp_cm = new JComboBox<Person>();
		sp_cm.setFont(new Font("Tahoma", Font.PLAIN, 9));
		sp_cm.setBounds(10, 25, 414, 48);
		contentPane.add(sp_cm);
		
		createCombobox();
	}
	
	public void List() 
	{
		Person pt = new Person();
		all = pt.findAll();
	}
	public Person createCombobox() 
	{
		//JOptionPane.showMessageDialog(null, "taille radio ."+ size.toString());
		
		for (Person  sp:
			all) 
		{
			sp_cm.addItem(sp);
		}		
		// JOptionPane.showMessageDialog( null,"item id ."+currentSpectacle); // test
		
		;
	
		return lapers=(Person) sp_cm.getSelectedItem();
	}

}
