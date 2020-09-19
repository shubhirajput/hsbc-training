package com.demo.interfaces.hw3;
import com.demo.interfaces.hw2.*;
public class BplTv implements TvRemote{
 
	
		int size;
		int cost;
		String quality;
		
		
		public BplTv()
		{
			
			size=0;
			cost=0;
			quality="hd";
			
		}
	
	public String size()
	{
		
		return "Bpl provides 10*20 screen";
	}
	public int cost()
	{
		
		return 2000 ;
	}
	public String features() {
		
		return "It provides good sound quality";
	}

	
}
