package com.demo.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
		
		int[] nums= {1,2,3,4};
		System.out.println(nums[4]);
		
		
		String[] names=new String[5];
		names[2].length();// string not populated. null of type string
		
		throw new RuntimeException();
		//System.out.println("No exceptions found");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println("Array Limit is being exceeded");
			
			
		}
		catch(Exception e)
		{
               System.out.println("Exception caught"+e);			
			
		}
		
		finally {
			
			
			System.out.println("This is finally block");
		}
		
	}
}