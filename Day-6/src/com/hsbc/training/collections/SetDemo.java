package com.hsbc.training.collections;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<String>();
		TreeSet<String> names=new TreeSet<>();
		
		names.add("SHUBHI");
		names.add("Rashii");
		names.add("SHUBHI");
		names.add("Ayush");
		
		System.out.println(names.contains("Kiran"));
		System.out.println(names);
		names.remove("Rashii");
		names.add("Ratan");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			name="hi,"+name;
			
		}
		
		
		
	System.out.println(names);

	}

}
