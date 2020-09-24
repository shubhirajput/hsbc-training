package com.hsbc.app.main;
/**
 * 
 */
import com.hsbc.app.DataStorageInterface.*;
import com.hsbc.app.entity.*;
import com.hsbc.app.service.*;
import com.hsbc.app.impl.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		ProductDB dao = new ProductDB();

		ProductService service = new ProductService(dao);
		try {
			System.out.println(service.getProductDetails(108));
			
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		String s=service.registerProduct(100,"TV","1000","NO");
		 System.out.println(s);
		
	}
}
