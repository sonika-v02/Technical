package com.hexaware.crs;

import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create vehicles
	        Vehicle car1 = new Car("Toyota Innova", 5000);
	        Vehicle bike1 = new Bike("Silicon", 700);
	        Vehicle truck1 = new Truck("Ford F-150", 100);

	        // Create a user
	        User user = new User("Smith");

	        int choice;
	        do {
	            System.out.println("\nVehicle Rental System");
	            System.out.println("1. Rent a Car");
	            System.out.println("2. Rent a Bike");
	            System.out.println("3. Rent a Truck");
	            System.out.println("4. Return a Car");
	            System.out.println("5. Return a Bike");
	            System.out.println("6. Return a Truck");
	            System.out.println("7. View Rented Vehicles");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    user.rentVehicle(car1);
	                    break;
	                case 2:
	                    user.rentVehicle(bike1);
	                    break;
	                case 3:
	                    user.rentVehicle(truck1);
	                    break;
	                case 4:
	                    user.returnVehicle(car1);
	                    break;
	                case 5:
	                    user.returnVehicle(bike1);
	                    break;
	                case 6:
	                    user.returnVehicle(truck1);
	                    break;
	                case 7:
	                    user.viewRentedVehicles();
	                    break;
	                case 8:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 8);

	        scanner.close();
	    }
	}


