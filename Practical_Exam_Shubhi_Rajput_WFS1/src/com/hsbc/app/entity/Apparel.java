package com.hsbc.app.entity;
/**
 * @author SHUBHI
 * 
 */
public class Apparel {

       private int itemCode;
       private String itemName;
       private int itemPrice;
       private String dom;
       private String doe;
       private boolean type;
       

public Apparel( int itemCode,String itemName,int itemPrice,String dom,String doe,boolean type)
{
	
	 this.itemCode=itemCode;
     this.itemName=itemName;
     this.itemPrice=itemPrice;
     this.dom=dom;
     this.doe=doe;
     this.type=type;

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


public String getDom() {
	return dom;
}


public void setDom(String dom) {
	this.dom = dom;
}


public String getDoe() {
	return doe;
}


public void setDoe(String doe) {
	this.doe = doe;
}


public boolean isType() {
	return type;
}


public void setType(boolean type) {
	this.type = type;
}


@Override
public int hashCode() {
	
	return this.getItemCode();
	
}

@Override
public boolean equals(Object obj) {
	Apparel a=(Apparel)obj;
	if (a.getItemCode()==this.getItemCode()) {
		return true;
	}
	return false;
}



}




