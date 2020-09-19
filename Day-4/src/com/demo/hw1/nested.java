package com.demo.hw1;

public class nested {


		public static void main(String[] args) {
			try {
				int a = 10;
				int b = 0;
				try {
					double d = a / b;
				} catch (NullPointerException e) {
					System.out.println("Inner catch : " + e);
				}
				
			} catch (ArithmeticException e) {
				System.out.println("Outer catch : " + e);
			}finally {
				System.out.println("Finally....");
			}

			System.out.println("App resumes normal execution");
			
		/*	finally {
				no finally without try-catch possible
				there can  be a try block without catch but with only finally.
				
			}*/
		}
	}

