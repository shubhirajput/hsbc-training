package com.demo.interfaces.hw1;

import com.demo.interfaces.hw.EmpDao;

public class MainApp {

	public static void main(String[] args) {
		 EmpDao e=Factory.getConnection(1);
		 
		System.out.println(e.findById(1));
		 System.out.println(e.save(new Emp(12,"Shubhi")));
		 System.out.println(e.listAllEmps());
	}

}


