package com.hexaware.crs;



class User {
    private String name;
    private Vehicle[] rentedVehicles;
    private int vehicleCount;

    public User(String name) {
        this.name = name;
        this.rentedVehicles = new Vehicle[5];  // Let's assume a user can rent a maximum of 5 vehicles.
        this.vehicleCount = 0;
    }

    public String getName() {
        return name;
    }

    public void rentVehicle(Vehicle vehicle) {
        if (vehicleCount < rentedVehicles.length) {
            if (!vehicle.getIsRented()) {
                vehicle.rentVehicle();
                rentedVehicles[vehicleCount] = vehicle;
                vehicleCount++;
            } else {
                System.out.println(vehicle.getName() + " is already rented by someone else.");
            }
        } else {
            System.out.println("You cannot rent more than " + rentedVehicles.length + " vehicles.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        for (int i = 0; i < vehicleCount; i++) {
            if (rentedVehicles[i] == vehicle) {
                vehicle.returnVehicle();
                rentedVehicles[i] = null;
                // Shift the array elements to remove gaps.
                for (int j = i; j < vehicleCount - 1; j++) {
                    rentedVehicles[j] = rentedVehicles[j + 1];
                }
                rentedVehicles[vehicleCount - 1] = null;
                vehicleCount--;
                return;
            }
        }
        System.out.println("You haven't rented " + vehicle.getName());
    }

    public void viewRentedVehicles() {
        System.out.println("Rented Vehicles by " + name + ":");
        if (vehicleCount == 0) {
            System.out.println("No vehicles rented.");
        } else {
            for (int i = 0; i < vehicleCount; i++) {
                System.out.println(rentedVehicles[i].getName());
            }
        }
    }
}


