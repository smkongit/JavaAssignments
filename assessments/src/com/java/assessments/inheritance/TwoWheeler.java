package com.java.assessments.inheritance;

public class TwoWheeler extends Vehicle{
	int noOfWheels;
	
	public TwoWheeler(String registrationNumber, int modelNumber, int noOfWheels) {
		super(registrationNumber,modelNumber);
		this.noOfWheels=noOfWheels;
	}
	
	public void display() {
		System.out.println("Two-wheeler class");
		super.display();
		System.out.println("No of wheels: "+ noOfWheels);
	}
	public static void main(String[] args) {
		Car car = new Car("TN 01 A 1384",1920,"Ford");
		TwoWheeler twoWheeler = new TwoWheeler("TN 02 AB 1004", 1920, 2);
		car.display();
		twoWheeler.display();
	}
}
