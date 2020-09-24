package com.hsbc.app.service;
/**
 * @author SHUBHI
 */
import java.util.*;
import com.hsbc.app.entity.*;
import com.hsbc.app.DataStorageInterface.*;
public class ProductService
{

	
	private ProductDB dao;
	
	
	public ProductService(ProductDB dao) {
		this.dao = dao;
	}
	
	public String registerProduct(int itemId, String itemName, int itemPrice, bolean type) {
		return dao.save(new Product(itemId, itemName, itemPrice, type));
	}

	public String getProductDetails(int id) {

		try {
			ProductDB c = dao.findByItemId(id);

			return c.getItemId() + " " + c.getItemPrice+" "c.getItemName()+" "+c.getType();
		} catch (ItemNotFoundException e) {
			throw new RuntimeException("Item Not found");
		}
	}

	public void printCustomerList() {

		for (ProductDB d1 : dao.listAll()) {
			System.out.println(d1.getItemCode() + " " + d1.ItemName() + " " + d1.ItemPrice() + " " + d1.getType());
		}
	}
}



