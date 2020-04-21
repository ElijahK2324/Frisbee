package Frisbee;

public class Coach extends Person 
{
	
	private String role; 

	Coach(String firstName, String lastName, String role) 
	{
		super(firstName, lastName);
		this.role = role;
		// TODO Auto-generated constructor stub
	}

	public String toString() 
	{
		return super.toString() + "\n   Role: " + role;
	}
}
