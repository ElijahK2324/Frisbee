package Frisbee;

public class Captain  extends UltimatePlayer
{
	
	private boolean type; // true for offense / false for defense

	public Captain(String firstName, String lastName, String position, boolean type) 
	{
		super(firstName, lastName, position);
		this.type = type;
	}
	
	public String getType()
	{
		if(type == true)
			return "offense";
		else
			return "defense";
	}
	
	public String toString()
	{
		return super.toString() + "\n   Captain:  " + getType();
		
	}

}
