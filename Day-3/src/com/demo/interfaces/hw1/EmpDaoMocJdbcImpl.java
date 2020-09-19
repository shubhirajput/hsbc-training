package com.demo.interfaces.hw1;
import com.demo.interfaces.hw.EmpDao;

public class EmpDaoMocJdbcImpl implements EmpDao {

	public String findById(int id)
	{
		return "Hey Inside find JdbcImpl";

	}
	public String save(Emp e)
	{
		return "Hey Inside save JdbcImpl";
		
	}
	public String listAllEmps()
	{
		return "Hey Inside list JdbcImpl";
		
	}
	
}
