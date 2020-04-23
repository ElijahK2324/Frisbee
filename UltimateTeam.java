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
		
		// PROBLEM AREA
		/*
		  In regards to the email i sent i expect this to iterate through every player
		  check if their position is equal to cutter and if it is print that player 
		  for some reason it only prints the FIRST player and im not sure why
		  im not super good at using the enhanced for loop so i think that might be the problem so
		  if you could jusst check over and see if there is any huge problems that might be inhibiting 
		  this 
		*/
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
