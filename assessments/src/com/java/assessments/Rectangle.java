package com.java.assessments;

import java.util.Scanner;

/*2)(Rectangle Class) Create a class Rectangle with attributes length and width,
 * each of which defaults to 1. 
 * Provide methods that calculate the rectangle’s perimeter and area. 
 * It has set and get methods for both length and width. 
 * The set methods should verify that length and width are 
 * each floating-point numbers larger than
 * 0.0 and less than 20.0. Write a program to test class Rectangle.*/

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
		
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length>0.0 && length <20.0) this.length = length;
		else  throw new IllegalArgumentException("Length expected between 0 and 20");
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(width>0.0 && width<20.0) {
			this.width = width;
		} else {
			 throw new IllegalArgumentException("width expected between 0 and 20");
			
		}
	}
	
	public float calculateRectanglePerimeter() {
		return 2*(length+width);
	}
	
	public float calculateRectangleArea() {
		return length*width;
	}
	
	public static void main(String[] args) {
		
		float length,width;

		Rectangle rectangleOne=new Rectangle();
		Rectangle rectangleTwo = new Rectangle();
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length=scanner.nextFloat();
		rectangleTwo.setLength(length);
	
		System.out.println("Enter the width of rectangle");
		width=scanner.nextFloat();
		rectangleTwo.setWidth(width);
		
		scanner.close();
		Rectangle rectangleThree = new Rectangle(length,width);
		
		System.out.println("Area of Rectangle - default: "+rectangleOne.calculateRectangleArea() +"\n" 
		+ "Perimeter of Rectangle - default: "+rectangleOne.calculateRectanglePerimeter());
		System.out.println("Area of Rectangle - set: "+rectangleTwo.calculateRectangleArea() + 
				"\n" + "Perimeter of Rectangle - set: "+rectangleTwo.calculateRectanglePerimeter());
		System.out.println("Area of Rectangle - parameter: "+rectangleThree.calculateRectangleArea() + 
				"\n" + "Perimeter of Rectangle - parameter: "+rectangleThree.calculateRectanglePerimeter());
	}
}
