package be.duquesne.POJO;

import be.duquesne.DAO.AbstractDaoFactory;
import be.duquesne.DAO.PersonDAO;

public class Responsible extends Person
{
	private final AbstractDaoFactory dao = AbstractDaoFactory.getFactory(AbstractDaoFactory.DAO_FACTORY);
	
	protected final PersonDAO pDAO = dao.getPersonneDAO();
	/*on peut aussi travailler avec instanceof pour voir si c est un membre ou autre mais moi je choisis ce systeme*/
	public final static String statut = "RESPONSIBLE";


}
