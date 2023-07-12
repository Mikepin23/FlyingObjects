package Package2;

public class Quadcopter extends Helicopter {

	// Attributes
	private int maxFlyingSpeed;

	// Default Constructor
	public Quadcopter() {
		maxFlyingSpeed = 500;
	}

	// Parameter Constructor
	public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear,
			int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	// Copy Constructor
	public Quadcopter(Quadcopter q) {
		maxFlyingSpeed = q.maxFlyingSpeed;
	}

	// Getters and setters
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Quadcopter's brand is " + getBrand() + ", the price is " + getPrice() + ", the horsepower is "
				+ getHorsepower() + ", the number of cylinders is " + getNumberOfCylinders() + ", the creation year is "
				+ getCreationYear() + ", the passenger capacity is " + getPassengerCapacity()
				+ " and the max flying speed is " + maxFlyingSpeed + ".";
	}
	
	// Overridden equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadcopter other = (Quadcopter) obj;
		return maxFlyingSpeed == other.maxFlyingSpeed;
	}

//	public boolean equals(Quadcopter q) {
//		if (this.maxFlyingSpeed == q.maxFlyingSpeed) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
