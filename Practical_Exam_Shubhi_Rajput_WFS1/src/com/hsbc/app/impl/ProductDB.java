package com.hsbc.app.impl;
/**
 * @author SHUBHI
 * @param id
 * @throws ItemNotFountException
 */
import com.hsbc.app.DataStorageInterface.*;
import java.util.*;
import com.hsbc.app.entity.*;



public class ProductDB implements FoodItemsDaoImpl, ElectronicsDaoImpl, ApparelDaoImpl {

	static Map<Integer, Product> FoodDB = new HashMap<>();
	static Map<Integer, Product> ElectronicsDB = new HashMap<>();
	static Map<Integer, Product> ApparelDB = new HashMap<>();

	public ProductDB() {
		ElectronicsDB.put(100, new Product(1013, "TV", 3000, 12, 100));
		ElectronicsDB.put(101, new Product(1026, "Mobile", 8000, 24, 97));
		ElectronicsDB.put(102, new Product(1114, "Watch", 1500, 18, 64));
		FoodDB.put(103, new Product(101, "Milk", 40, "20-09-2020", "25-09-2020", "yes", 10));
		FoodDB.put(104, new Product(102, "Curd", 20,"21-09-2020", "24-09-2020", "yes", 15));
		FoodDB.put(105, new Product(111, "Cake", 12,"24-09-2020", "29-09-2020", "no", 20));
		ApparelDB.put(106, new Product(222, "T-Shirt", 500, "large", "cotton",50));
		ApparelDB.put(107, new Product(432, "Shirt", 320, "medium", "cotton",32));
		ApparelDB.put(108, new Product(325, "Sweater", 2000, "medium", "woolen",20));
		

	}

	@Override
	public foodDisplay() {
		ArrayList<Product> foodList = new ArrayList(FoodDB.values());
		return foodlist;
		
		
}
@Override
  public Food findbyId(int id) throws ItemNotFountException{

  try{
  if(FoodDB.containsKey(id){
  FoodDB.get(id);
}
  else{
  throw new ItemNotFoundException();
 }
 catch(ItemNotFoundException e){
throw e;
}
}
@Override
	public electronicsDisplay() {
		
		ArrayList<Product> electronicList = new ArrayList(ElectronicDB.values());
		return electroniclist;
		
}
@Override
pulic Electronic findbyId(int id) throws ItemNotFountException{

try{
if(ElectronicDB.containsKey(id){
return ElectronicDB.get(id);
}
else{
throw new ItemNotFoundException();
}
catch(ItemNotFoundException e){
throw e;
}
}
@Override
	public apparelDisplay() {
		ArrayList<Product> apparelList = new ArrayList(ApparelDB.values());
		return apparellist;
		
}
pulic Apparel findbyId(int id) throws ItemNotFountException{

try{
if(ApparelDB.containsKey(id){
return Apparel.get(id);
}
else{
throw new ItemNotFoundException();
}
catch(ItemNotFoundException e){
throw e;
}
}



