package com.demo.exceptions;
import java.io.File;
public class FileDemo {

	public static void main(String[] args) {
	File file=new File("d:\\temp\\io");
	
	System.out.println(file.isDirectory());
	System.out.println(file.canWrite());
	

	}

}
