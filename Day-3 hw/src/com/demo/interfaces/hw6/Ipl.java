package com.demo.interfaces.hw6;
import com.demo.interfaces.hw4.*;
import com.demo.interfaces.hw5.*;

public class Ipl implements Sports,Cricket {


	
	int teams;
	
	public Ipl()
	{
		
		this.teams=2;
		
	}
	public int noOfPlayers()
	{
		System.out.println("No of players:");
		return 15; 
		
	}
	public String typeOfGame()
	{
		return "Interclub game";
	}
	public String HowToPlay()
	{
		return "It is being played with bat and a ball inside a stadium";
	}
	public String TeamGame()
	{
		
		return "yes it is a team game";
		
		
	}
	
	
	
	

}
