package com.demo.interfaces.hw2;
import com.demo.interfaces.hw1.*;

public class Account implements AccountOperationsInterface {
	
	double balance;
	String current;
	
	public Account(double balance,String current)
	{
		
		this.balance=balance;
		this.current=current;
	}
	
	public double deposit(double amt) throws AccountBlockedException
	{
		
		if(current=="block")
			throw new AccountBlockedException();
		else
			balance=balance+amt;
		return balance;
	}
	public double withdraw(double amt) throws AccountBlockedException,InsufficientBalanceException
	{
		if(current=="block")
	    throw new AccountBlockedException();

        else if(this.balance<amt)
	     throw new InsufficientBalanceException();

         else return balance;
		
		
	}
	public double getBalance() throws AccountBlockedException
	{
		
		if(current=="block")
			throw new AccountBlockedException();
		
		return balance;
		
	}
	public void blockAccount()
	{
		this.balance=0.0;
		this.current="TEMPORARILY CLOSED";
	}


}
