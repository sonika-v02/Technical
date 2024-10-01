package com.hexaware.crs;

	abstract class Vehicle {
	    private String name;
	    private double rentalPrice;
	    private boolean isRented;

	    public Vehicle(String name, double rentalPrice) {
	        this.name = name;
	        this.rentalPrice = rentalPrice;
	        this.isRented = false;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public double getRentalPrice() {
	        return rentalPrice;
	    }

	    public boolean getIsRented() {
	        return isRented;
	    }

	    public void setIsRented(boolean isRented) {
	        this.isRented = isRented;
	    }

	   
	    public abstract void rentVehicle();
	    public abstract void returnVehicle();
	}


