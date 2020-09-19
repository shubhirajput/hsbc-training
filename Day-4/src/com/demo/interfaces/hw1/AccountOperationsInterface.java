package com.demo.interfaces.hw1;
import com.demo.interfaces.hw2.*;
public interface AccountOperationsInterface {
	
	
	public double deposit(double amt) throws AccountBlockedException;
	public double withdraw(double amt) throws AccountBlockedException,InsufficientBalanceException;
	public double getBalance() throws AccountBlockedException;
	public void blockAccount();
	
	

}
