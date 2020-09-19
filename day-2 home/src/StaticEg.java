
public class StaticEg {
       static int s=0;
       int n=10;
       
       
       public void plus()
       {
    	   s++;
    	   n++;
       }
       
       
       static public void add()
       {
    	   
    	  System.out.println("Accessing static variable inside static method and its value is "+s);
       }
       
       
       static {
    	   
    	   System.out.println("Inside static block");
       }
       
       
       
	public static void main(String[] args) {
		StaticEg se1=new StaticEg();
		StaticEg se2=new StaticEg();
		se1.plus();
		
		System.out.println(se1.s);
		System.out.println(se1.n);
		
		se2.plus();
		System.out.println(se2.s);
		System.out.println(se2.n);
		
		
		add();

	}

}
