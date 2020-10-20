package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.entity.Cust;


@Repository
public class CustDb {
	private static HashMap<Integer, Cust> c = new HashMap<>();

	public static HashMap<Integer, Cust> getDb() {
		return c;
	}

	public static void setDb(HashMap<Integer, Cust> c) {
		CustDb.c= c;
	}

	public CustDb() {

	
		
	 c.put(100,new Cust(100,"Shubhi",999999999));
	   c.put(101,new Cust(101,"Ayush",888888888));
	    c.put(102,new Cust(102,"Abhi",777777777));
	    c.put(103,new Cust(103,"John",666666666));
	    c.put(104,new Cust(104,"Scott",320999996));
	    	 c.put(105,new Cust(105,"David",122099990));
	    c.put(106,new Cust(106,"Jesus",629999900));
}
}