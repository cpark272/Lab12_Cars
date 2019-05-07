package co.grandcircus;

public class UsedCar extends Car {
	
	// Instance variables
	private double mileage = 0;
	
	// Car overloaded constructor
	public UsedCar() {
	}
	
	// Using data for the parent and data specific to the class
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	// Getter to get mileage
	public double getMileage() {
		return mileage;
	}

	// Setter to set mileage
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	// Method override for toString to output meaningful elements
	@Override
	public String toString() {
		return getMake() + "\t" + getModel() + "\t" + getYear() + "\t" + getPrice() + "\t" + mileage;
	}
	
	

}
