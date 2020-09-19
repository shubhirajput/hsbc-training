
public class myCalculator {
	
	int EngM;
	int HinM;
	int ScieM;
	
	public myCalculator(int x,int y,int z)
	{
		this.EngM=x;
		this.HinM=y;
		this.ScieM=z;
	}
	
	public int addition(myCalculator f)
	{
		int sum=f.EngM+f.HinM+f.ScieM;
		return sum;
		
	}
	public int subtract()
	{
		return 0;
	}
	
	public int multiply()
	{
		return 0;
		
	}
	public int divide(int x,int y)
	{
		int d=x/y;
		return d;
	}

	public static void main(String[] args) {
		
          myCalculator m=new myCalculator(23,34,45);
          int z=m.addition(m);
          int w=m.divide(z,3);
          
	}

}
