package Frisbee;

public class UltimatePlayer extends Person
{

	private static int jerseyNumber;
	private static int num;
	private String position;

	
	public UltimatePlayer(String firstName, String lastName, String position)
	{
		super(firstName, lastName);
		
		if(position.equals("handler") || position.equals("cutter"))
		{
			this.position = position;
		}
		else
		{
			this.position = "handler";
		}
		
		// set jersey number 
		num ++;
		UltimatePlayer.jerseyNumber = num;
		
	}
	
	// initalize my getters
	String getPosition()
	{
		return position;
	}
	
	public String toString()
	{
		return super.toString() + "\n   Jersey #: " + jerseyNumber
								+ "\n   Position: " + position;
	}
	
}
