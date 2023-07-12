package Package2;

import Package1.Airplane;

public class Helicopter extends Airplane {

	// Attributes
	private int numberOfCylinders;
	private int creationYear;
	private int passengerCapacity;

	// Default Constructor
	public Helicopter() {
		numberOfCylinders = 16;
		creationYear = 2020;
		passengerCapacity = 6;
	}

	// Parameter Constructor
	public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear,
			int passengerCapacity) {
		super(brand, price, horsepower);
		this.numberOfCylinders = numberOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	// Copy Constructor
	public Helicopter(Helicopter h) {
		numberOfCylinders = h.numberOfCylinders;
		creationYear = h.creationYear;
		passengerCapacity = h.passengerCapacity;
	}

	// Getters and setters
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Helicopter's brand is " + getBrand() + ", the price is " + getPrice() + ", the horsepower is "
				+ getHorsepower() + ", the number of cylinders is " + numberOfCylinders + ", the creation year is "
				+ creationYear + " and the passenger capacity is " + passengerCapacity + ".";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		return creationYear == other.creationYear && numberOfCylinders == other.numberOfCylinders
				&& passengerCapacity == other.passengerCapacity;
	}

//	public boolean equals(Helicopter h) {
//		if (this.numberOfCylinders == h.numberOfCylinders && this.creationYear == h.creationYear
//				&& this.passengerCapacity == h.passengerCapacity) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
