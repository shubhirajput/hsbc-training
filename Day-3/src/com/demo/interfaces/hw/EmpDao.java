package com.demo.interfaces.hw;
import com.demo.interfaces.hw1.*;
public interface EmpDao {
	public String findById(int id);
	public String save(Emp e);
	public String listAllEmps();

}
