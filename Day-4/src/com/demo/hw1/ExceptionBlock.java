package com.demo.hw1;

public class ExceptionBlock {

	public static void main(String[] args) {
		int a=10,b,c;
		try
		{
			b=0;
			c=a/b;
			System.out.println(c);
			System.out.println("No Error Encountered");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("In Finally....");
			
		}

	}

}
