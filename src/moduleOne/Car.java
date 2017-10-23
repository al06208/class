package moduleOne;

public class Car extends Vehicle {
	int numOfCylinders;
	boolean hasGps;
	public Car(String color, int numCylinders, boolean gps) {
		super(4, color);
		this.numOfCylinders = numCylinders;
		this.hasGps = gps;
	}
	

}
