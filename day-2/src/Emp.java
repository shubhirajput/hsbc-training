
public class Emp {
	private int empId;
	private String name;
public Emp(int empId,String name)
{
this.empId=empId;
this.name=name;

}
/*public void getEmpInfo()
{
 System.out.println( empId+ " "+name);	
}*/
public String getEmpInfo()
{
return empId+" "+name;	

}
	}

