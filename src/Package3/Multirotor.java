package Package3;

import Package2.Helicopter;

public class Multirotor extends Helicopter {

	// Attributes
	private int numberOfRotors;

	// Default Constructor
	public Multirotor() {
		numberOfRotors = 5;
	}

	// Parameter Constructor
	public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear,
			int passengerCapacity, int numberOfRotors) {
		super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
		this.numberOfRotors = numberOfRotors;
	}

	// Copy Constructor
	public Multirotor(Multirotor m) {
		numberOfRotors = m.numberOfRotors;
	}

	// Getters and setters
	public int getNumberOfRotors() {
		return numberOfRotors;
	}

	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Quadcopter's brand is " + getBrand() + ", the price is " + getPrice() + ", the horsepower is "
				+ getHorsepower() + ", the number of cylinders is " + getNumberOfCylinders() + ", the creation year is "
				+ getCreationYear() + ", the passenger capacity is " + getPassengerCapacity()
				+ " and the number of rotors is " + numberOfRotors + ".";
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
		Multirotor other = (Multirotor) obj;
		return numberOfRotors == other.numberOfRotors;
	}

//	public boolean equals(Multirotor m) {
//		if (this.numberOfRotors == m.numberOfRotors) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
