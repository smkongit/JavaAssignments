package com.java.assessments.inheritance;

public class Car extends Vehicle{
	String brandName;
	
	public Car (String registrationNumber, int modelNumber, String brandName ){
		super(registrationNumber, modelNumber);
		this.brandName=brandName;
	}
	public void display() {
		System.out.println("Car class");
		super.display();
		System.out.println("Brand Name: "+ brandName);
	}
}
