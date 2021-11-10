package be.duquesne.POJO;

import java.util.List;

import be.duquesne.DAO.AbstractDaoFactory;
import be.duquesne.DAO.PersonDAO;
import be.duquesne.POJO.Category.TypesMember;
import be.duquesne.POJO.Category.TypesVtt;
public class Member extends Person
{
	private final AbstractDaoFactory dao = AbstractDaoFactory.getFactory(AbstractDaoFactory.DAO_FACTORY);
	
	protected final PersonDAO pDAO = dao.getPersonneDAO();
	/*on peut aussi travailler avec instanceof pour voir si c est un membre ou autre mais moi je choisis ce systeme*/
	public final static String statut = "MEMBER";
	private List<Category> categoryList;
	
	private TypesVtt type;
	private TypesMember typevelo;
	
	public Member() 
	{
		
		
	}

	public Member(String numPerson, String name, String firstname, String telephon, String password, String email) {
		super(numPerson, name, firstname, telephon, password, email);
		// TODO Auto-generated constructor stub
	}

	public Member(String password, String email) 
	{
		super(password, email);
		
	}
	public String getType() 
	{
		if(this.type == TypesVtt.BASE) 
			return "CYCLO";
		else if(this.type ==  TypesVtt.HIKER)
			return "HIKER";	
		else if(this.type ==  TypesVtt.DESCENDER)
			return "DESCENDER";	
		else
			return "TRIALIST";
	}
	
	@Override
	public boolean register() 
	{
		return pDAO.create(((Member) this));
	}
}
