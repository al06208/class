package moduleOne;

public class Bicycle extends Vehicle {
	int numOfGears;
	boolean hasBasket;
	public Bicycle(String color, int numGears, boolean basket) {
		super(2,color);
		this.numOfGears = numGears;
		this.hasBasket = basket;
	}

}
