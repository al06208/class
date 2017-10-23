package moduleOne;

public class TestByValue {

	String name = "Mary";
	
	public static void main(String[] args) {
		TestByValue tbv = new TestByValue();
		
		int x = 5;
		System.out.println("X is now "+x+".");
		tbv.change(x);
		System.out.println("X is now "+x+".");
		System.out.println(tbv.name);
		tbv.changeName(tbv.name);
		System.out.println(tbv.name);
		
		

	}
	public void change(int x) {
		x = x+20;
	}
	public void changeName(String name) {
		this.name = name+" Lamb";
		}

}
