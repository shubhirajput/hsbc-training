package com.demo.interfaces.hw6;
import com.demo.interfaces.hw4.*;
import com.demo.interfaces.hw5.*;
public class MainApp {

	public static void main(String[] args)
	{
		
		//Cricket s=Factory.getConnection("Ipl");
		Cricket c=Factory.getConnection("TestMatch");
		System.out.println(c.noOfPlayers());
		System.out.println(c.typeOfGame());
		System.out.println(c.HowToPlay());
		System.out.println(c.TeamGame());
		
		
	}
	
}
