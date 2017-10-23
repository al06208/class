
public class PersonTest {

	public static void main(String[] args) {
		person p1 = new person();
		p1.setName("Mary");
		person p2 = new person();
		p2.setName("Bob");
		
		
		//primitives copying etc
		int x = 5;
		int y = 7;
		int j = x + y;
		//copy
		x = y;
		System.out.println("x is "+x+" y is "+y+" j is "+j);
		
		//copy objects
		p1 = p2;
		//p1 and p2 now have the same address; there is now an address with an object there not connected to it
		System.out.println("p1 name is "+p1.getName()+" p2 name is "+p2.getName());
		
		p1.setName("Bobby");
		System.out.println("p1 name is "+p1.getName()+" p2 name is "+p2.getName());
		
		
	}

}
