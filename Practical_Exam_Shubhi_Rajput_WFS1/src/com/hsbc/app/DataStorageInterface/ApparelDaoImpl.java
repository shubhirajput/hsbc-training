package com.hsbc.app.DataStorageInterface;
import java.util.*;
import com.hsbc.app.entity.*;
/**
 * 
 * @author SHUBHI
 *
 */

public interface ApparelDaoImpl {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws FoodNFException
	 */
	public Apparel findById(int id) throws ItemNotFoundException;
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<Apparel> Display();
	/**
	 * Saving Appareltomer
	 * @param c- Appareltomer object
	 * @return - Returns a status message
	 */
	

}