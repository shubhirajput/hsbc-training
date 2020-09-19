package com.demo.hw.abstraction;

public class MainApp {
	

		public static void main(String[] args) {
		      Bird ref;
			Parrot p=new Parrot();
			Eagle e=new Eagle();
			Duck d= new Duck();
			
			ref=p;
		ref.BirdFly();
			
			
			ref=e;
			ref.BirdFly();
			
			ref=d;
			ref.BirdFly();
	}

}
