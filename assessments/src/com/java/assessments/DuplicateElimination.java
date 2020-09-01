package com.java.assessments;

import java.util.Scanner;

/*3) (Duplicate Elimination) Use a one-dimensional array to solve 
the following problem: 
	Write an application that inputs five numbers, 
	each between 10 and 100, inclusive. 
	As each number is read, 
	display it only if it’s not a duplicate of a number already read. 
	Provide for the “worst case,” 
	in which all five numbers are different. 
	Use the smallest possible array to solve this problem. 
	Display the complete set of unique values input
	after the user enters each new value
*/
public class DuplicateElimination {
	public static void main(String[] args) {
		int i=0,j;
		int number;
		int arrayNumbers[]=new int[5];
		System.out.println("Enter the numbers: ");
		Scanner scanner=new Scanner(System.in);
		do{
			number=scanner.nextInt();
			if(!(isNumberDuplicated(arrayNumbers, number))){
				arrayNumbers[i]=number;
				i++;
			}	else System.out.println("Number is duplicated. Enter different number!");
		}while(i<5);
		scanner.close();	
		System.out.println("The final array is: ");
		for (j=0;j<arrayNumbers.length;j++) {
			System.out.println(arrayNumbers[j]);	
		}
	}
	private static boolean isNumberDuplicated(int arrayNumbers[], int number) {
		for (int i = 0; i < arrayNumbers.length; i++) {
			if(arrayNumbers[i]==number) {
				return true;
			}	
		} 
		return false;
	}
}