package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	System.out.println("Start of program");
	try {
	int a=10;
	int b=0;
	double d=a/b;
	System.out.println("No exception in try block");
	}catch(ArithmeticException e) {
		//e.printStackTrace();
		//System.out.println(e);
		System.out.println(e.getMessage());
		
	}
	//System.in.read();//checked error
	//System.out.println(d);

	}

}
