package moduleTwo;

import java.util.InputMismatchException;

public class ExampleOfThrowingException {

	public static void main(String[] args) {
		try {
			doubleUp(15.0);
		}
		catch(Exception e) {
			System.out.println("Numbuh must me between 10 and 20");
					
		}

	}
	public static double doubleUp(double x) throws InputMismatchException {
		double result = 0;
		if (x>=10 && x<=20) {
			result = x*2;
		}else throw new InputMismatchException();
		return result;
	}

}
