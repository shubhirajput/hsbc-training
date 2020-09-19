package com.demo.interfaces.hw3;
import com.demo.interfaces.hw2.*;
public class Factory {
	
	
	public static TvRemote getConnect(String s) {
		
		if(s.equals("BplTv"))
			return new BplTv();
		if(s.equals("SonyTv"))
			return new SonyTv();
		if(s.equals("Panasonic"))
			return new PanasonicTv();
		else return null;
		
		
	}
	
	
	
	
	

}
