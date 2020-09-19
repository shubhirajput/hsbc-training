package com.demo.hw1;

public class MyNullPointer {
	
	public static void main(String[] args)
	{
		
		String s=null;
		try
		{
		System.out.println(s.toString());
		System.out.println("No exceptions found");
	
	}catch(NullPointerException e) 
		{
		//throw new MyNullPointerExceptions();
			e.printStackTrace();
		}
	

}
}