package com.demo.interfaces.hw1;

public class Emp {
	
	private int empId;
	private String name;
	public Emp(int empId,String name)
	{
		
		this.empId=0;
		this.name=name;
	}
	
	
	public void display()
	{
		System.out.println(empId+" "+name);
		
	}
	public int findEmpId()
	{
	
		return this.empId;
	}
	
}