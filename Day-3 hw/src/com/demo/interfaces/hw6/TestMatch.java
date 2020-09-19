package com.demo.interfaces.hw6;
import com.demo.interfaces.hw4.*;
import com.demo.interfaces.hw5.*;

public class TestMatch implements Sports,Cricket{
	
	int Teams;
	
	public TestMatch()
	{
		
		this.Teams=2;
		
	}
	public int noOfPlayers()
	{
		System.out.println("No of players:");
		return 11; 
		
	}
	public String typeOfGame()
	{
		return "International game";
	}
	public String HowToPlay()
	{
		return "It is being played with bat and a ball";
	}
	public String TeamGame()
	{
		
		return "yes it is a team game";
		
		
	}
	
	
	
	

}
