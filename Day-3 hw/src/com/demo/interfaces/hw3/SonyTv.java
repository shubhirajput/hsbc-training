package com.demo.interfaces.hw3;
import com.demo.interfaces.hw2.*;
public class SonyTv implements TvRemote {

	
	int size;
	int cost;
	String quality;
	
	
	public SonyTv()
	{
		
		size=0;
		cost=0;
		quality="hd";
		
	}

public String size()
{
	
	return "Sony provides 10*20 screen";
}
public int cost()
{
	
	return 5000 ;
}
public String features() {
	
	return "It provides good sound quality with free tata sky set up box";
}


}
