package be.duquesne.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import be.duquesne.POJO.Member;
import be.duquesne.POJO.Person;

public class PersonDAO implements DAO<Person>
{
		protected Connection con_ = null;
		private String sql;
		// injection de dependance pour le systeme de connexion 
		public PersonDAO(Connection con) 
		{
			con_ = con;
		}
		@Override
		public boolean create(Person obj) 
		{
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean create(Person obj, int id)
		{
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public int findByLast(Person s)
		{
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public boolean delete(Person obj) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean update(Person obj) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public Person find(Person obj) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public List<?> findAll(Person obj) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean login(Person p) 
		{
			try 
			{
				ResultSet result = this.con_.createStatement()
						.executeQuery("SELECT * FROM PERSON WHERE email = '" 
						+ p.getEmail()
						+ "' AND statut ='" 
						+ p.getStatut()
						+ "'AND password = '" + p.getPassword()
						+ "'"
					);
				if (result.next()) 
				{
					return true;
				}

			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return false;
		}
		/*INSERT INTO "STUDENT03_27"."PERSON" (PASSWORD, STATUT, ADRESS, TELEPHON, EMAIL, NAME, FIRSTNAME) VALUES ('Hello', 'MEMBER', 'rue du puit 21 7000 mons', '0499874512', 'side@lol.be', 'Jean', 'DuJardin')
*/
		 public boolean create(Member m)
		  { 
		        try
		        {
		                      
		        	PreparedStatement state = con_.prepareStatement
		        			("INSERT INTO PERSON(PASSWORD, STATUT, ADRESS, TELEPHON, EMAIL, NAME, FIRSTNAME)"
		        					+ "VALUES (?,?,?,?,?,?,?)");
		        	
		            state.setString(1, m.getPassword());
		          
		            state.setString(2, "MEMBER");
		            
		            state.setString(4, m.getAdress());
		      
		            state.setString(5, m.getTelephon());
		            state.setString(6, m.getEmail());
		            state.setString(7, m.getName());
		            state.setString(8, m.getFirstname());
		           
		            
		            state.execute();
		            return true;
		        }

		        catch(SQLException e)
		        {
		            e.printStackTrace();
		        }
		        
		        return false;
		    }
		 
		
}
