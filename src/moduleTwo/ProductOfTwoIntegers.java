package moduleTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean done = false;
		while(!done) {
			Scanner scan = new Scanner(System.in);
			try {
					System.out.println("Enter two inters to multiply: ");
					int x=0;
					int y=0;
					if(scan.hasNextInt()) {
						x = scan.nextInt();
						if(scan.hasNextInt()) { 
							y = scan.nextInt();
						}
						else System.out.println("Entries must both be integers.");
					}
					else System.out.println("Entries must both be integers.");
					done = true;
					
		
			}
			catch(InputMismatchException e) {
				System.out.println("Entries must both be integers.");
			}
		}
	}

}
