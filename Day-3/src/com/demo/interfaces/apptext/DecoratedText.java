package com.demo.interfaces.apptext;
import com.demo.interfaces.text.Writer;
public class DecoratedText implements Writer {

	public void write(String mssg)
	{
		System.out.println("Decorated Text"+mssg);
		
	}
}
