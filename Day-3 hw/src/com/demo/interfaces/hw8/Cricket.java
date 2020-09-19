package com.demo.interfaces.hw8;

public class Cricket extends Sport {

	int TeamPlayers;
	int Teams;
	
	public Cricket()
	{
		this.TeamPlayers=0;
		this.Teams=0;
		
	}
	public void players()
	{
		System.out.println("We have this many players");
		
	}
	
	public static void main(String[] args)
	{
		Sport s=new Sport();
		Cricket c= (Cricket) s;
		c.players();
		
	}
	
	
}
