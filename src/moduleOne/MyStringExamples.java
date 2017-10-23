package moduleOne;

public class MyStringExamples {

	public static void main(String[] args) {
		// TODO or not TODO
		// that is the comment
		String ex1 = new String("Mary has a little lamp");
		
	String ex2 = "Mary has a little lamb";
	// Hey, shitbag. Strings are IMMUTABLE
	// Immutable, adj. : Not changeable once it's created
	// But wait! Can't you change strings?
	// No! You create a copy with the changes applied, then replace the initial value with the new one.
	
	System.out.println("is ex1 at the same memory location as ex2? " + (ex1==ex2));
	
	String ex3 = "Mary has a little lamb";
	
	System.out.println("is ex2 at the same memory location as ex3? " + (ex3==ex2));
	/*
	 b'wait. This is true! What?
	 two of the same string via literal?
	 (String nuts = "nuts";) 
	 Java just doesn't make new space for it and points towards the old one
	 Can do that because a String never changes
	 must be exactly alike, though
	*/
	
	//String comparison
	System.out.println("Are ex1 and ex2 the same string? "+ex1.equals(ex2));
	//CASE-SENSITIVE BECAUSE OF UNICODE MMKAY?
	// compareto returns either 0, or an integer value
	// 0 means the same
	// it basically adds up all the chars and finds the difference
	
	System.out.println("ex1 and ex2 compared are "+(ex1.compareTo(ex2)));
	// b vs p
	// String length is a method String.length();
	// Array length is a variable Array.length;
	System.out.println("ex1 is of length " + ex1.length());
	//charAt - much like an array, return the char at this position in the array
	//returns a CHARACTER not a string
	System.out.println("index 15 in ex1 is "+ex1.charAt(15));
	//index not in the string? index out of bounds exception
	//if length is 22, last legal index is 21
	//last character?
	System.out.println(ex1.charAt(ex1.length()-1));
	// substring - like charAt for sections, returns a string
	System.out.println("Substring from index position 15 is " + ex1.substring(15));
	System.out.println("Substring from start to position 15 is "+ex1.substring(0,15));
	//NOTE: neither includes the charAt index 15, but works with 0. 
	//Strings can also Uppercase, Lowercase, and ignoreCase!
	
	//string regex
	System.out.println("912-478-5151".matches("\\d{3}-\\d{3}-\\d{4}"));
	
	}

}
