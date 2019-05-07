package co.grandcircus;

import java.text.DecimalFormat;

public class Car {
	
	// List of instance variables
	private String make = null;
	private String model = null;
	private int year = 0;
	private double price = 0;
	
	// Constructor for Car.class
	public Car(String make, String model, int year, double price) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// Getter to get make
	public String getMake() {
		return make;
	}

	// Setter to set make
	public void setMake(String make) {
		this.make = make;
	}

	// Getter to get model 
	public String getModel() {
		return model;
	}

	// Setter to set model
	public void setModel(String model) {
		this.model = model;
	}

	// Getter to get year
	public int getYear() {
		return year;
	}

	// Setter to set year
	public void setYear(int year) {
		this.year = year;
	}

	// Getter to get price
	public double getPrice() {
		return price;
	}

	// Setter to set year
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		 return make + "\t" + model + "\t" + year + "\t" + price;
	}
	
//	// Helper method to format year to String
//	private static String formatYear(int x) {
//		
//		String stringYear = Integer.toString(x); // Creates a new object
//		
//		return stringYear;
//	}
//		
//	// Getter to format year using formatYear method
//	public String getStringYear() {
//		
//		String finalYear = formatYear(getYear());
//		
//		return finalYear;
//	}
//	
//	
//	
//	// Helper method to format price to String
//	private static String formatPrice(double x) {
//		
//		DecimalFormat df = new DecimalFormat("#.00");
//		String stringPrice = df.format(x); // Creates a new object
//		
//		return stringPrice;
//	}
//	
//	// Getter to format price using formatPrice method
//	public String getStringPrice() {
//		
//		String finalPrice = formatPrice(getPrice());
//		
//		return finalPrice;
//	}

}