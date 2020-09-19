package com.demo.inheritance.demo2;

public class App2 {
	
	
	public static void printDetails(Person p) //superclass reference to subclass object 
	{
		
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {
		Person p=new Person(100,"Shubhi");
		Employee e=new Employee(102,"Arjun",35666);
		//TraineeEmp t=new TraineeEmp(267,"Shan",2333,"good");
		System.out.println(p.getDetails());
		//System.out.println(e.getDetails());
		//System.out.println(t.getDetails());
		
		Person p2= new Employee(103,"Scott",89000);
		// over riding comes here into practise 
		TraineeEmp t1=new TraineeEmp(106,"shhu",3333,"avfg");
		//System.out.println(p2.getDetails()); //polymorphism or accessing common methods
		//p2.fun();// wrong bcoz it dont have knowledge of fun, we need to create object of employee
		printDetails(t1);

	}

}
