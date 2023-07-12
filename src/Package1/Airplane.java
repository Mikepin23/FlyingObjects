package Package1;

import java.util.Objects;

public class Airplane {

	// Attributes
	private String brand;
	private double price;
	private int horsepower;

	// Default Constructor
	public Airplane() {
		brand = "Boeing";
		price = 1000000.00;
		horsepower = 1000;
	}

	// Parameter Constructor
	public Airplane(String brand, double price, int horsepower) {
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}

	// Copy Constructor
	public Airplane(Airplane a) {
		brand = a.brand;
		price = a.price;
		horsepower = a.horsepower;
	}

	// Getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Airplane's brand is " + brand + ", the price is " + price + " and the horsepower is " + horsepower
				+ ".";
	}

	// Overridden equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return Objects.equals(brand, other.brand) && horsepower == other.horsepower
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

//	public boolean equals(Airplane a) {
//		if (this.brand.equalsIgnoreCase(a.brand) && this.price == a.price && this.horsepower == a.horsepower) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
