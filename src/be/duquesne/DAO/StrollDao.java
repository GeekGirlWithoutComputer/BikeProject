package be.duquesne.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import be.duquesne.POJO.Person;
import be.duquesne.POJO.Stroll;

public class StrollDao implements DAO<Stroll>
{
	protected Connection con_ = null;
	private String sql;
	

	public StrollDao(Connection con) 
	{
		con_ = con;
		
	}
//INSERT INTO "STUDENT03_27"."STROLL_" (NAME, PLACEOFDEPARTUNE, DATEOFDEPARTUNE) VALUES ('vtthard', 'charleroi centre', '10-12-2021')
	//INSERT INTO "STUDENT03_27"."STROLL_" (NAME, COST, PLACEOFDEPARTUNE, DATEOFDEPARTUNE) VALUES ('jjj', '55', 'lll', TO_DATE('2001-12-12 00:00:00', 'YYYY-MM-DD HH24:MI:SS'))


	@Override
	public boolean create(Stroll obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(Stroll obj, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int findByLast(Stroll s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Stroll obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Stroll obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stroll find(Stroll obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAll(Stroll obj) 
	{
		List<Stroll> liste = new ArrayList<Stroll>();
		
			Statement stm = null;
			ResultSet rs = null;
			try
			{
				 sql = "Select * From STROLL_ ";
				//rs = stm.executeQuery(sql);
				rs=this.con_.createStatement().executeQuery(sql);
				while(rs.next())
				{
				// on peut bosser avec le nom des champs aussi c est au choix
					liste.add(new Stroll(
							
							
							/*
							 * private int numStroll;
	private String placeOfDepartune;
	private Double cost;
	private Date dateOfDepartune;
	private String nameStroll;*/
							rs.getInt(1),
							rs.getString(2),
							rs.getDouble(3),
							
							rs.getString(4),
							rs.getDate(5)
							
							)
							);		
					
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			// test debbug
			for(Stroll cf : liste) 
	        {
	        	
	        	//JOptionPane.showMessageDialog(null,"list    " +cf);
	        		
	        }
			return liste;
	}

}
