
public class Big {

	public static void main(String[] args) {
		int i=10;
		int j=8;
		int k=3;
		int l = k > (i > j ? i : j) ? k : ((i > j) ? i : j);
		System.out.println("Largest amongst three numbers is="+l);

	}

}
