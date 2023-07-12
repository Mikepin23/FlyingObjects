package Package5;

import java.util.Objects;

import Package4.UAV;

public class AgriculturalDrone extends UAV {

	// Attributes
	private String brand;
	private int carryCapacity;

	// Default Constructor
	public AgriculturalDrone() {
		brand = "DJI";
		carryCapacity = 5;

	}

	// Parameter Constructor
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}

	// Copy Constructor
	public AgriculturalDrone(AgriculturalDrone ad) {
		brand = ad.brand;
		carryCapacity = ad.carryCapacity;
	}

	// Getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Agricultural Drone's weight is " + getWeight() + ", the price is " + getPrice() + ", the brand is " + brand
				+ " and the carry capacity is " + carryCapacity + ".";

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
		AgriculturalDrone other = (AgriculturalDrone) obj;
		return Objects.equals(brand, other.brand) && carryCapacity == other.carryCapacity;
	}

//	public boolean equals(AgriculturalDrone ad) {
//		if (this.brand.equalsIgnoreCase(ad.brand) && this.carryCapacity == ad.carryCapacity) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
