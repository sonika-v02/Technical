package com.hexaware.crs;

class Bike extends Vehicle {
    public Bike(String name, double rentalPrice) {
        super(name, rentalPrice);
    }

    @Override
    public void rentVehicle() {
        if (!getIsRented()) {
            setIsRented(true);
            System.out.println(getName() + " has been rented for $" + getRentalPrice() + " per day.");
        } else {
            System.out.println(getName() + " is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (getIsRented()) {
            setIsRented(false);
            System.out.println(getName() + " has been returned.");
        } else {
            System.out.println(getName() + " was not rented.");
        }
    }
}