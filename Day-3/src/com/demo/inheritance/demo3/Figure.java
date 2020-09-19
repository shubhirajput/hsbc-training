package com.demo.inheritance.demo3;

public abstract class Figure {   // abstract may or may nt have asbtract mrthods but keyword abstract// we can;t instantaiate abstract classes.there objects can;t be created

	
	protected int dim1;
	protected int dim2;
	
	
	public Figure(int dim1,int dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
		
	}
	
	public Figure(int dim2)
	{
		this.dim2=dim2;
		
	}
	
	abstract public double area();
}
