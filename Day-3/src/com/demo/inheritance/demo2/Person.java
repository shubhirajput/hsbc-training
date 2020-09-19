package com.demo.inheritance.demo2;

class Person{
	
	private int id;
	private String name;
	
	public Person(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	
	public String getDetails()
	{
		
		return id+" "+name;
	}

}
