
public class EmpDb
{
	Emp[] empList=new Emp[10];
	
	public EmpDb()
	{
		empList[0]=new Emp(56,"Shubhi");
		empList[1]=new Emp(78,"Rajput");
	}
/*public void search(int eId)
{
	for(int i=0;i<empList.length;i++)
	{
	if(empList[i].empId==eId)
	{
	System.out.println(empList[i].empId);
	System.out.println(empList[i].name);
	}
}*/

public String addEmp(Emp e)
{
           String Message="";
           int count=0;
	for(int i=0;i<empList.length;i++)
	{
		
		if(empList[i]==null) {
			empList[i]=e;
			Message="Emp added";
			break;
		}
			
		else 
			count++;
	}
	if(count==empList.length)
		Message="DB full";
	return Message;
		
	
	}

/*public void list()
{
	
for(int i=0;i<empList.length;i++)
{
	System.out.println(empList[i].empId);
	System.out.println(empList[i].name;);
	
}

}

*/

public static void main(String[] args)
{
EmpDb db=new EmpDb();
Emp e=new Emp(102,"Arun");
System.out.println(db.addEmp(e));
//db.search(258);



}






}

