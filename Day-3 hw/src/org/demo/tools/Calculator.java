package org.demo.tools;

public class Calculator {
	
	double x,y;
	public Calculator(double x,double y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void add()
	{    double c=this.x+this.y;
		System.out.println("x+y=" + c);
		
	}
	
	public void sub()
	{
      double c=this.x-this.y;
      System.out.println("x-y="+c);
}
	
	public void multiply()
	{
		
		double c=this.x*this.y;
		System.out.println("x*y="+c);
		
		
	}
}