
public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.empId=123;
		e.empName="Shubhi";
		e.city="Dhampur";
		e.salary=55000;
		
		String info=e.getEmpDetails();
		System.out.println(info);

	}

}
