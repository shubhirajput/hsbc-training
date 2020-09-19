package com.demo.exceptions.demo4;
import com.demo.exceptions.demo4.LowBalanceException;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(int Balance)
	{
		
		this.balance=Balance;
	}
	
	public double withdraw(double amount)
	{
		//try
	//	{
		
		if(balance<amount)
		{
			throw new LowBalanceException();
			
		}
		else
		{
			balance=balance-amount;
			System.out.println("Transaction Successful,new balance is"+balance);
		
		}
		//}//catch(LowBalanceException e)
		//{
			
		//	System.out.println(e);
		//	throw e; 
		//}
			return balance;
		
	}

}
