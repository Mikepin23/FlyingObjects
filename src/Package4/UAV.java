package Package4;

import Package1.Airplane;

public class UAV extends Airplane {

	// Attributes
	private double weight;
	private double price;

	// Default Constructor
	public UAV() {
		weight = 100.00;
		price = 200000.00;
	}

	// Parameter Constructor
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}

	// Copy Constructor
	public UAV(UAV u) {
		weight = u.weight;
		price = u.price;
	}

	// Getters and setters
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The UAV's weight is " + weight + " and the price is " + price + ".";
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
		UAV other = (UAV) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

//	public boolean equals(UAV u) {
//		if (this.weight == u.weight && this.price == u.price) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
