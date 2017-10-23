package moduleOne;

public class Vehicle {
	private int numOfWheels;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;
	public Vehicle(int numWheels, String colorVal) {
		this.setNumOfWheels(numWheels); this.color = colorVal;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	

}
