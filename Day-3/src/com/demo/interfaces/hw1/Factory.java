package com.demo.interfaces.hw1;
import com.demo.interfaces.hw.EmpDao;

public class Factory {
	
	public static EmpDao getConnection(int n)
	{
		if(n==1)
			return new EmpDaoMocJdbcImpl();
		else if(n==2)
			return new EmpDaoMockHibernateImpl();
		else return null;
		
	}
	

}
