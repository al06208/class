package moduleTwo;

public class ExceptionHandling {

	static String s;
	public static void main(String[] args) {
		int[] x = new int[4];
		try {
			x[0] = 5;
			x[1] = 10;
			x[2] = 7;
			s.charAt(0);
			int y = 2/0;
			x[3] = 4;
			x[4] = 15;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("thassa out of bounds, b0ss.");
		}
		catch(ArithmeticException e) {
			System.out.println("Ha! Chuck Norris jokes! That's funny!");
		}
		catch(NullPointerException e) {
			System.out.println("b0ss, pleas");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
