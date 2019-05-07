package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Initializing variables
		int numCars = 0;
		String make = null;
		String model = null;
		int year = 0;
		double price = 0;
		
		// New car object
		Car newCar = new Car(make, model, year, price);
		
		// Title of program
		System.out.println("Welcome to the Grand Circus Motors admin console!");
				
		// Number of car models
		System.out.print("How many cars are you entering: ");
		numCars = scan.nextInt();
		
		// ArrayList to store the car objects
		ArrayList<Car> carList = new ArrayList<>();
		
		for (int i = 0; i < numCars; i++) {
			
			int j = i + 1;
			// Takes user input for each car
			System.out.print("Enter Car #" + j + " Make: ");
			make = scan.next();
			System.out.print("Enter Car #" + j + " Model: ");
			model = scan.next();
			System.out.print("Enter Car #" + j + " Year: ");
			year = scan.nextInt();
			System.out.print("Enter Car #" + j + " Price: ");
			price = scan.nextDouble();
			System.out.println("");
			scan.nextLine();

			// Inputs the current car object into the ArrayList named carList
			carList.add(new Car(make, model, year, price));
			
		}

		// Title for current inventory in the ArrayList
		System.out.println("Current Inventory:");

		// Outputs the entered cars stored in carList ArrayList
		for (int i = 0; i < numCars; i++) {
			
			System.out.println(carList.get(i));
			
		}
		
		scan.close();

	}

}



//System.out.println(newCar.getMake());
//System.out.println(newCar.getModel());
//System.out.println(newCar.getStringYear());
//System.out.println(newCar.getStringPrice());
