package com.java.assessments.generic.classes;

import java.util.Scanner;

/*1)(Generic isEqualTo Method) 
Write a simple generic version of method isEqualTo that 
compares its two arguments with the equals method 
and returns true if they’re equal and false otherwise. 
Use this generic method in a program that calls isEqualTo
with a variety of built-in types, such as Object or Integer. 
What result do you get when you attempt to run this program?*/
public class CompareWithIsEqualTo {
	public static <E> boolean isEqualTo (E inputOne, E inputTwo) {
		if (inputOne.equals(inputTwo)) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Integer integerOne,integerTwo;
		Double doubleOne, doubleTwo;
		String stringOne, stringTwo;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two integers");
		System.out.print("Enter first integer: ");
		integerOne=scanner.nextInt();
		System.out.print("Enter second integer: ");
		integerTwo=scanner.nextInt();
		
		if(isEqualTo(integerOne,integerTwo)) System.out.println(integerOne+" and "+integerTwo+ " are equal\n");
		else System.out.println(integerOne+" and "+integerTwo+ " are not equal\n");
		
		System.out.println("Enter two double values");
		System.out.print("Enter first double: ");
		doubleOne=scanner.nextDouble();
		System.out.print("Enter second double: ");
		doubleTwo=scanner.nextDouble();
		
		if(isEqualTo(doubleOne,integerTwo)) System.out.println(doubleOne+" and "+doubleTwo+ " are equal\n");
		else System.out.println(doubleOne+" and "+doubleTwo+ " are not equal\n");
		
		System.out.println("Enter two string values");
		System.out.print("Enter first string: ");
		stringOne=scanner.next();
		System.out.print("Enter second string: ");
		stringTwo=scanner.next();
		scanner.close();
		
		if(isEqualTo(stringOne,stringTwo)) System.out.println(stringOne+" and "+stringTwo+ " are equal\n");
		else System.out.println(stringOne+" and "+stringTwo+ " are not equal\n");
		
		System.out.println("Check if objects are equals");
		Object objectOne = new Object();
		Object objectTwo = new Object();

		if(isEqualTo(objectOne,objectTwo)) System.out.println(objectOne+" and "+objectTwo+ " are equal");
		else System.out.println(objectOne+" and "+objectTwo+ "are not equal\n");
		
		CompareWithIsEqualTo compareOne = new CompareWithIsEqualTo();
		CompareWithIsEqualTo compareTwo = new CompareWithIsEqualTo();
		
		if(isEqualTo(compareOne,compareOne)) System.out.println(compareOne+" and "+compareTwo+ " are equal");
		else System.out.println(compareOne+" and "+compareTwo+ "are not equal");
	}
}
