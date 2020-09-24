package com.hsbc.app.entity;
/**
 * 
 * @author SHUBHI
 *
 */
public class FoodItems {
	
	
	private int itemCode;
    private String itemName;
    private int itemPrice;
    private int size;
    private String material;
    private int quantity;
    
    
	 public FoodItems(int itemCode, String itemName, int itemPrice, int size, String material, int quantity) {

		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return this.getItemCode();
	}
	@Override
	
	public boolean equals(Object obj) {
		FoodItems f=(FoodItems)obj;
		if (this.getItemCode()==f.getItemCode()) {
			return true;
		}
		return false;
	}
		
	}
	
	
	
	
	