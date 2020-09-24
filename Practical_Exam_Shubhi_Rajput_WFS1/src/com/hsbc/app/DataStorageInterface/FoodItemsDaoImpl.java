package com.hsbc.app.DataStorageInterface;
/**
 * 
 */

import java.util.List;

import com.hsbc.app.entity.FoodItems;

public interface FoodItemsDaoImpl {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws FoodNFException
	 */
	public FoodItems findById(int id) throws ItemNotFoundException;
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<FoodItems> Display();
	/**
	 * Saving FoodItemstomer
	 * @param c- FoodItemstomer object
	 * @return - Returns a status message
	 */
	
	
}