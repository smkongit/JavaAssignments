package com.java.assessments;

import java.util.Scanner;

/*Methods
 * 1)	Write a method qualityPoints that inputs a student’s average 
 * and returns 4 if it’s 90–100, 3 if 80–89, 2 if 70–79, 1 if 60–69 
 * and 0 if lower than 60. 
 * Incorporate the method into an application that 
 * reads a value from the user and displays the result.
*/
public class StudentsScore {
	public static int qualityPoints(int resultAverage) {
		int result=0;
		if ((resultAverage >= 90)&&(resultAverage<=100)) result= 4;
		else if ((resultAverage >=80)&&(resultAverage<=89)) result= 3;
		else if ((resultAverage >=70)&&(resultAverage<=79)) result= 2;
		else if ((resultAverage >=60)&&(resultAverage<=69)) result= 1;
		else if (resultAverage <60) result=0;
		return result;
	}
	public static void main(String[] args) {
		int inputAverage=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the student's average:");
		inputAverage=scanner.nextInt();
		
		if(inputAverage> 100 || inputAverage<0) System.out.println("Student's average must be between 0 and 100");
		else System.out.println("The student's result is: " +qualityPoints(inputAverage));
		scanner.close();
	}
}