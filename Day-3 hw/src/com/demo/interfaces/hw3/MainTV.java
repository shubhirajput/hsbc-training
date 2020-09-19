package com.demo.interfaces.hw3;
import com.demo.interfaces.hw2.*;
public class MainTV {

	public static void main(String[] args) {
		 TvRemote tv=Factory.getConnect("Panasonic");
		 
		 
		 System.out.println(tv.size());
		 System.out.println(tv.cost());
		 System.out.println(tv.features());

	}

}
