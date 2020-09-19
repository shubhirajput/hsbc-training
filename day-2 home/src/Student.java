
public class Student {
	
	
	int RollNo;
	String Name;
	
	public Student()
	{
		int RollNo=34;
		String Name="Shubhi";
		
	}
	
	public Student(int r,String n)
	{
		this.RollNo=r;
		this.Name=n;
		
	}
	
	public Student(int r)
	{
		this.RollNo=r;
	}

	public static void main(String[] args) {
	  Student s=new Student();
	  Student s1=new Student(34,"Shubhi");
	  Student s2=new Student(34);  

	}

}
