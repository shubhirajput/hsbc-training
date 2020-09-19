package com.demo.exceptions.demo3;
import com.demo.exceptions.demo3.App2;
public class App1 {
	int c,d;
	public App1(int c,int d)
	{
		
		this.c=c;
		this.d=d;
		
	}
	
	public void calculate(int a,int b)
	{
		App2 a2=new App2(3,0);
		a2.divide(a,b);
	}

}
