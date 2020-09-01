package com.java.assessments.shapehierarchy;
/* 2)(Project: Shape Hierarchy) 
 * Implement the Shape hierarchy.
 * Each TwoDimensionalShape should contain method getArea 
 * to calculate the area of the two-dimensional shape. 
 * Each ThreeDimensionalShape should have methods getArea and getVolume 
 * to calculate the surface area and volume, respectively, 
 * of the three-dimensional shape. 
 * Create a program that uses an array of Shape references 
 * to objects of each concrete class in the hierarchy. 
 * The program should print a text description of the object to 
 * which each array element refers. Also, in the loop that processes 
 * all the shapes in the array, determine whether each shape is a 
 * TwoDimensionalShape or a ThreeDimensionalShape. 
 * If it’s a TwoDimensionalShape, display its area. 
 * If it’s a ThreeDimensionalShape, display its area and volume.*/

public class Shape {

	@Override
	public String toString() {
		return "Shape [getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Shape shape[] = new Shape[4];
		shape[0]= new Circle(5.0);
		shape[1]= new Square(2.0);
		shape[2]= new Sphere(10.0);
		shape[3]= new Cube(6.0);
		
		for(Shape currentShape: shape) {
		    if (currentShape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) currentShape;

                System.out.printf("%s\nArea: %.2f\n\n", twoDimensionalShape.toString(), twoDimensionalShape.getArea());

            } else if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) currentShape;
                System.out.printf("%s\nArea: %.2f\n", threeDimensionalShape.toString(), threeDimensionalShape.getArea());
                System.out.printf("%s\nVolume: %.2f\n\n", threeDimensionalShape.toString(), threeDimensionalShape.getVolume());
            }
		}
		
	}
}
