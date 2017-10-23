package moduleOne;

public class FleetTester {

	public static void main(String[] args) {
		Car c = new Car("Red", 4, true);
		System.out.println(c.getNumOfWheels());
		Bicycle b = new Bicycle("Pink", 5, false);
		System.out.println(b.getNumOfWheels());
	}

}
