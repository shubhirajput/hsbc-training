package com.demo.threads.app1;

public class PrintWorker implements Runnable {
	private MessagePrinter p;
	private String msg;
	
	public PrintWorker(MessagePrinter p,String msg)
	{
		
		this.msg=msg;
		this.p=p;
	}
	
	
	public void run()
	{
		//p.print(msg);
		synchronized(p)
		{
		p.print(msg);
		}
		
		
	}

}
