package com.demo.interfaces.apptext;
import com.demo.interfaces.text.Writer;

public class PlainText implements Writer {

	
	public void write(String mssg)
	{
		
		System.out.println("Plain Text"+mssg);
	}
}
