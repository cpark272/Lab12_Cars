package co.grandcircus;

public class UsedCar extends Car {
	
	// Instance variables
	private String make = null;
	private String model = null;
	private int year = 0;
	private double price = 0;
	private double mileage;
	
	// Car overloaded constructor
	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
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
		return super.toString() + make + "\t" + model + "\t" + year + "\t" + price + "\t" + "\t" + mileage;
	}
	
	

}
