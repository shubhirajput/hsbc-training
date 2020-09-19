package com.demo.interfaces.apptext;
import com.demo.interfaces.text.*;
public class TestApp {

	public static void main(String[] args) {
		Writer w=MyTextFactory.getWriter("Html");
		
     w.write("Heloo Inteface");
	}

}
