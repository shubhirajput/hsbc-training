package com.demo.interfaces.hw6;
import com.demo.interfaces.hw4.*;
import com.demo.interfaces.hw5.*;
public class Factory {
	
	public static Cricket getConnection(String s)
	{
		
		if(s.equals("TestMatch"))
			return new TestMatch();
		else if(s.equals("Ipl"))
			return new Ipl();
		else return null;
		
		
	}

}
