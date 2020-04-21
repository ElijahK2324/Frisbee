package Frisbee;

import java.util.ArrayList;

public class UltimateTeam {
	
	// initalize temp tring and both arraylists listing player and coaches
	private ArrayList<UltimatePlayer> players;
	private ArrayList<Coach> coaches;
	
	// TEMP STRING 
	String tempString = "";
	String tempString2 = "";
	
	UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) 
	{
		this.players = players;
		this.coaches = coaches;
	}
	
	
	///////// GET CUTTERS //////////
	public String getCutters() 
	{
		tempString = "empty";
		
		// iterate through the string 
		for(UltimatePlayer i: players)
		{
			// ultimate player
			if(i.getPosition().equals("cutter"))
			{
				tempString = ("\n " + String.valueOf(i));
			}
			
		}
		
		return tempString;
	
	}
	
	///////// GET HANDLER //////////
	public String getHandlers()
	{
		tempString = "empty";
		
		// for each player (i) in ultimate player
		for(UltimatePlayer i: players)
		{
			// ultimate player
			if(i.getPosition().equals("handler"))
			{
				tempString = ("\n" + String.valueOf(i));
			}
			
		}
		
		return tempString;
	}
	
	//////// TO STRING ////////
    public String toString()
    {
    	// Initialize first string 
        tempString = "";
        
        // for each coach in coaches
        for(Coach i: coaches)
        {
            // save the first String of the players in team
        	tempString = (tempString + "\n" + String.valueOf(i));
            
            
        }
        
        // Initialize second string 2 
        tempString2 = "";
        
        // for players ultimate players
        for(UltimatePlayer i: players)
        {
            // save the second String of the players in the team
        	tempString2 = (tempString2 + "\n" + String.valueOf(i));
            
        }
        
       // return the coaches
       return ("COACHES" + tempString + "\n\nPLAYERS\n" + tempString2 );
        
    }

    //////////////// KNOWN PROBLEMS 
}
