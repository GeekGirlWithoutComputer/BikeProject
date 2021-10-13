package be.duquesne.DAO;

import java.sql.Connection;

import be.duquesne.POJO.Person;

public class DAOFactory 
{
	protected static final Connection conn = Connexion.getInstance();
	public DAO<Person> getPersonDAO()
	{
		return new DAOPerson(conn);
	}
}
