package com.hsbc.web.tr.json;

public class Customer {

int custId;
String custName;
String address;
double accountBalance;

public Customer(int custId,String custName,String address,double accountBalance)
{
	
this.custId=custId;
this.custName=custName;
this.address=address;
this.accountBalance=accountBalance;

}

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}



}


