package com.demo.threads.app1;

public class MessagePrinter {
	
	public synchronized void  print(String message)
	{
		
		System.out.println(message);
		
	}

}
