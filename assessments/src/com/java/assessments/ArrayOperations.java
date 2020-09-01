package com.java.assessments;

/*Arrays and ArrayLists
 * 1) Write statements that perform the following one-dimensional-array operations: 
 * a) Set the 10 elements of integer array counts to zero. 
 * b) Add one to each of the 15 elements of integer array bonus. 
 * c) Display the five values of integer array bestScores in column format.
*/
public class ArrayOperations {
	public static void main(String[] args) {
		int i,j;
		
		@SuppressWarnings("unused")
		int integerArray[] = {0,0,0,0,0,0,0,0,0,0};
		
		int bonusArray[]= new int[15];
		for(i=0;i<15;i++) {
			bonusArray[i]=bonusArray[i]+1;
		}
		
		int bestScoresArray[]= {50,60,70,80,90,100};
		for (j=0;j<5;j++) {
			System.out.printf("%d\t", bestScoresArray[j]);
		}
	}
}
