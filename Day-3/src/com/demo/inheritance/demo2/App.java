package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		Person p=new Person(100,"Shubhi");
		Employee e=new Employee(102,"Arjun",35666);
		TraineeEmp t=new TraineeEmp(267,"Shan",2333,"good");
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
		System.out.println(t.getDetails());

	}

}
