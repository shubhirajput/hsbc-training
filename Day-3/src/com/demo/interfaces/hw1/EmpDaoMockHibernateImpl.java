package com.demo.interfaces.hw1;

import com.demo.interfaces.hw.EmpDao;

public class EmpDaoMockHibernateImpl implements EmpDao {

	
	
	
	public String findById(int id)
	{
		
		return "Hey Inside find Hibernate";
	}
	public String save(Emp e)
	{
		return "Hey Inside save Hibernate";
		
	}
	public String listAllEmps()
	{
		return "Hey Inside list Hibernate";
		
	}
}
