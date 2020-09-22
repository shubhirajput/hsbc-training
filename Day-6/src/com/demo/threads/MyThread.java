package com.demo.threads;

public class MyThread extends Thread {

	public void run()
	{
		
		
	
		try
		{
			for(int i=0;i<10;i++)
				System.out.println("Iteration no:"+i);
			Thread.sleep(2000);// as there is multiple threads,we dont know which one is working so this static functions serve for every thresd.
			
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
			
		}
	}
	
	
}
