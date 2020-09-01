package com.java.assessments.shapehierarchy;

public class Circle extends TwoDimensionalShape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(getRadius(),2);
	}

	@Override
	public String toString() {
		return "Class=" + getClass().getSimpleName();
	}
	
	

}
