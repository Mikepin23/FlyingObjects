package Package5;

import java.util.Objects;

import Package4.UAV;

public class Mav extends UAV {

	// Attributes
	private String model;
	private double size;

	// Default Constructor
	public Mav() {
		model = "J-917";
		size = 65;

	}

	// Parameter Constructor
	public Mav(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;

	}

	// Copy Constructor
	public Mav(Mav mav) {
		model = mav.model;
		size = mav.size;
	}

	// Getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	// Overridden toString method
	@Override
	public String toString() {
		return "The Mav's weight is " + getWeight() + ", the price is " + getPrice() + ", the model is " + model
				+ " and the size is " + size + ".";
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
		Mav other = (Mav) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size);
	}

//	public boolean equals(Mav mav) {
//		if (this.model.equals(mav.model) && this.size == mav.size) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
