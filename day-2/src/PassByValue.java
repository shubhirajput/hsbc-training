
public class PassByValue {
 int x=20;
 
 public void display(int y)
 {
	 x=10;
	 System.out.println("the value ="+x);
 }
	public static void main(String[] args)
	{
		PassByValue p=new PassByValue();
		System.out.println(p.x);
		p.display(200);
	

	}

}
