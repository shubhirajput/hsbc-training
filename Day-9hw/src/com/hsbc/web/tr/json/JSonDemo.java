package com.hsbc.web.tr.json;
import java.io.*;
import org.json.*;
public class JSonDemo {
	
public static void main(String args[]) {
		
		Customer[] cusObj=new Customer[5];	
		JSONObject custJson=new JSONObject();	

			cusObj[0]=new Customer(1,"Shubhi","Dhampur",50000);
			cusObj[1]=new Customer(2,"Ayush","Goa",100000);
			cusObj[2]=new Customer(3,"isha","lcknow",5000);
			cusObj[3]=new Customer(4,"dams","kerela",444444);
			cusObj[4]=new Customer(5,"sanya","Bombay",22222);
	
			custJson.put("customer", cusObj);
		
		try {
		FileWriter fw=new FileWriter("customer.json",true);		
		fw.write(custJson.toString());
		fw.close();
		}
		catch(IOException ie) {
			System.out.println(ie);
		}

}

