package com.java.assessments.strings;

import java.util.Scanner;

/*2)(Comparing Strings) Write an application that uses 
String method compareTo to compare two strings input by the user. 
Output whether the first string is less than, 
equal to or greater than the second.*/

public class CompareStrings {
	public static void main(String[] args) {
		String inputOne=null;
		String inputTwo=null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string: ");
		inputOne= scanner.nextLine();
		System.out.println("Enter second string to compare");
		inputTwo= scanner.nextLine();
		scanner.close();
		//System.out.println(inputOne.compareTo(inputTwo));
		if (inputOne.compareTo(inputTwo)<0) System.out.println(inputOne + " is lesser than "+ inputTwo);
			else if (inputOne.compareTo(inputTwo)>0) System.out.println(inputOne+ " is greater than "+ inputTwo);
			else System.out.println(inputOne + "is equal to " +inputTwo);
	}
}
