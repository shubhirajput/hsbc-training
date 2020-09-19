
public class Factorial {

	public static void main(String[] args) {
		int s=5,f=1;
		for(int i=s;i>0;i--)
		{
			f=f*i;
			
		}
		System.out.println("Factorial is="+f);
		f=1;
		while(s!=0)
		{
			f=f*s;
			s--;
			
			
		}
		System.out.println("Factorial is="+f);

	}

}
