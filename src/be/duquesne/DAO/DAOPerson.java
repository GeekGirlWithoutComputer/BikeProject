package be.duquesne.DAO;

import java.sql.Connection;
import java.util.List;

import be.duquesne.POJO.Person;

public class DAOPerson  extends DAO<Person> 
{

    public DAOPerson(Connection conn)
    {
        super(conn);
    }

	@Override
	public boolean create(Person obj) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person obj) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Person obj) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person find(long id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() 
	{
		// TODO Auto-generated method stub
		return null;
	}


}
