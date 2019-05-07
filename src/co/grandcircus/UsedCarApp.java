package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Initialize variables
		int menuOption = 0;
		String make = null;
		String model = null;
		int year = 0;
		double price = 0;
		double mileage = 0;
		
		// New used car object
		UsedCar newUsedCar = new UsedCar(make, model, year, price, mileage);
		
		// ArrayList to store the car objects
		ArrayList<Car> usedCarList = new ArrayList<>();
		
		//Inputs for usedCarList ArrayList
		usedCarList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		usedCarList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		usedCarList.add(new Car("Chewie", "Vette", 2017, 44989.95));
		usedCarList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		usedCarList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
		usedCarList.add(new UsedCar("GC", "Witherell", 2016, 144550.00, 3500.3));
		
		// While loop to let user decide when to end program
//		while (menuOption != (usedCarList.size() + 1)) {
			
			// For-loop to print out the ArrayList of new and used cars
			for (int i = 0; i < usedCarList.size(); i++) {
				
//				int j = i + 1;
				System.out.println(usedCarList.get(i));
				
//				System.out.println(j + ". " + usedCarList.get(i));
				// Quit menu option
				//System.out.println((usedCarList.size() + 1) + ". Quit");

//			} // End of while loop
		
			// User inputs a menu option
		
	
		
		}
	
		scan.close();
	
	}

}

