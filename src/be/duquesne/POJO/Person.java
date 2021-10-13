package be.duquesne.POJO;

public abstract class Person 
{
	//    attributes
	protected String numPerson;
	protected String name;
	protected String firstname;
	protected String telephon;
	protected String password;
	protected String email;
	//getters setters 
	public String getNumPerson() 
	{
		return numPerson;
	}
	public void setNumPerson(String numPerson) 
	{
		this.numPerson = numPerson;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getTelephon() 
	{
		return telephon;
	}
	public void setTelephon(String telephon) 
	{
		this.telephon = telephon;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	//builders
	public Person() {}
	public Person(String numPerson, String name, String firstname, String telephon, String password, String email) 
	{
		super();
		this.numPerson = numPerson;
		this.name = name;
		this.firstname = firstname;
		this.telephon = telephon;
		this.password = password;
		this.email = email;
	}
	//methods
	//no body in the abstract class, children will redefine it
	 public  abstract  void Login() ;
	@Override
	public String toString() 
	{
		return "Person [name=" + name + ", firstname=" + firstname + ", telephon=" + telephon + ", password=" + password
				+ ", email=" + email + "]";
	}
	 
	 
	 
	
	
	
	
	
}
