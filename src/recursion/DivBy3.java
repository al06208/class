package recursion;

public class DivBy3 {

	public static void main(String[] args) {
		int result = divide(30226);
		System.out.println("The remiandor isk " + result);

	}
	
	public static int divide(int x) {
		//base condition
		if(x < 3)
			return x;
		return divide(x-3);
		
	}

}
