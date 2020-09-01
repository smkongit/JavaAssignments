package com.java.assessments.inheritance;

/*
 * 1)	create base class vehicle and extends it to car,two-wheeler.
*/
public class Vehicle {
	String registrationNumber;
	int modelNumber;
	public Vehicle(String registrationNumber, int modelNumber) {
		super();
		this.registrationNumber = registrationNumber;
		this.modelNumber = modelNumber;
	}
	
	public void display() {
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Model Number: "+ modelNumber);
	}

}
