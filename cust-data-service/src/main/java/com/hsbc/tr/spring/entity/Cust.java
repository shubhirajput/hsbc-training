package com.hsbc.tr.spring.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cust {
	private int custId;
	private String name;
	private double phone;
	
	
	
	public Cust() {
		System.out.println("Customer Created...");
	}

	public Cust(int custId, String name,double phone) {
		this.custId =custId;
		this.name = name;
		this.phone = phone;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	
	

}
