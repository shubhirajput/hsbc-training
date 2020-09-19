package com.demo.interfaces.hw2;

public class mainApp {
	public static void main(String[] args) {
		Account a=new Account(10000,"Active");
		
		
		try {
			System.out.println("balance:"+a.getBalance());
		}
		catch(AccountBlockedException e)
		{
			e.printStackTrace();
		}
		
		
		try {
			
			System.out.println("balance="+a.deposit(7000));
			
		}
		catch(AccountBlockedException d)
		{
			d.printStackTrace();
		}
		
		try {
			System.out.println("balance:"+a.withdraw(6000));
		}
		catch(AccountBlockedException f)
		{
			f.printStackTrace();
		}
		catch(InsufficientBalanceException g)
		{
			g.printStackTrace();
		}

	}

}