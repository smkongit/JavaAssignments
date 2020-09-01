package com.java.assessments.shapehierarchy;

public class Cube extends ThreeDimensionalShape{
	double lengthOfEdge;

	public Cube(double lengthOfEdge) {
		super();
		this.lengthOfEdge = lengthOfEdge;
	}

	public double getLengthOfEdge() {
		return lengthOfEdge;
	}

	public void setLengthOfEdge(double lengthOfEdge) {
		this.lengthOfEdge = lengthOfEdge;
	}

	@Override
	public double getArea() {
		//A=6a2
		return 6*Math.pow(getLengthOfEdge(), 2);
	}

	@Override
	public double getVolume() {
		//Volume=a3
		return Math.pow(getLengthOfEdge(), 3);
	}

	@Override
	public String toString() {
		return "Class=" + getClass().getSimpleName();
	}

	
}
