package com.demo.exceptions.demo3;
import com.demo.exceptions.demo3.App1;
public class App2 {

	int a,b;
	
	public App2(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	public void divide(int a,int b)
	{
		
		
		try
		{
			
			int c=a/b;
			System.out.println("no exception");
			
		}
		
		catch(ArithmeticException e)
		{
			
			//System.out.println("hiii");
			e.printStackTrace();
		}
	}
}
