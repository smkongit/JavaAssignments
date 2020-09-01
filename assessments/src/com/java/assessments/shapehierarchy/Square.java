package com.java.assessments.shapehierarchy;

public class Square extends TwoDimensionalShape{
	double length;

	public Square(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		
		return Math.pow(getLength(), 2);
	}

	@Override
	public String toString() {
		return "Class=" + getClass().getSimpleName();
	}
	
	
}
