package com.demo.io.entity;
import java.io.*;
public class ReadAndWriteEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
        fr=new FileReader("c:\\temp\\io\\emp.txt");
        br=new BufferedReader(fr);
        String line="";
       
        while((line=br.readLine())!=null)
        {
        	System.out.println(line);
        	String[] cols=line.split(",");
        	int id=Integer.parseInt(cols[0]);
        	double sal=Double.parseDouble(cols[3]);
        	Emp e=new Emp(id,cols[1],cols[2],sal);
        	System.out.println(e.getEmpId()+" "+e.getName());
       
        }
	}catch(FileNotFoundException e)
		{
		System.out.println(e);
		}
		catch(EOFException e)
		{System.out.println("done reading ...");
			
			
		}
		
		catch(IOException e)
		{
			
			System.out.println(e);
		}
		}
		
}
