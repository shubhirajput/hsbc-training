
public class Hello {
	
	public void hello(int i) {
		System.out.println("inside int hello");
	}
	public void hello(byte i) {
		System.out.println("inside byte hello");
	}
	public void hello(short i) {
		System.out.println("inside short hello");
	}
	public hello(long i) {
		System.out.println("inside long hello");
	}

	public static void main(String[] args) {
		
    Hello h=new Hello();
    h.hello(5);
	}

}
 

