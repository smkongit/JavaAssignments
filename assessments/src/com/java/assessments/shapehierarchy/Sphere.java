package com.java.assessments.shapehierarchy;

public class Sphere extends ThreeDimensionalShape {
	double radius;

	public Sphere(double radius) {
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
		return 4*Math.PI*Math.pow(getRadius(), 2);
	}

	@Override
	public double getVolume() {
		return 1.34*Math.PI*Math.pow(getRadius(), 3);
	}

	@Override
	public String toString() {
		return "Class=" + getClass().getSimpleName();
	}
	
	
}
