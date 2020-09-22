package com.hsbc.training.collections;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Dhampur");
		cities.add("Dehraddom");
		cities.add("mumbai");
		cities.add("pune");
		cities.add("delhi");
		cities.add("ghazipur");
		cities.add("benaras");
		
		
		cities.add(2,"Chandigarh");
		cities.remove(5);
		System.out.println(cities);
		Collections.sort(cities);
		System.out.println("after sorting: "+cities);
	}

}
class MyListSorter implements Comparator<String>
{
            public int compare(String o1,String o2)
            {
            	
            	
            	return o1.compareTo(o2);
            }
}