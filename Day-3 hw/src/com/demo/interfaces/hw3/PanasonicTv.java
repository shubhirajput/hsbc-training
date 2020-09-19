package com.demo.interfaces.hw3;
import com.demo.interfaces.hw2.*;
public class PanasonicTv implements TvRemote {

	int size;
	int cost;
	String quality;
	
	
	public PanasonicTv()
	{
		
		size=0;
		cost=0;
		quality="hd";
		
	}

public String size()
{
	
	return "Panasonic provides 20*20 screen";
}
public int cost()
{
	
	return 10000 ;
}
public String features() {
	
	return "It provides good sound quality with smart tv features";
}


	
	
	
	
}
