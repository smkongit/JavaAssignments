package com.java.assessments.exceptionalhandling;
/*
 * 1)	(Exceptional Conditions) List the various exceptional conditions 
 * that have occurred in programs throughout this text so far.
 *  List as many additional exceptional conditions as you can. 
 *  For each of these, describe briefly how a program typically 
 *  would handle the exception by using the exception-handling techniques 
 *  discussed in this chapter. 
 * Typical exceptions include division by zero and array index out of bounds
 */
public class ExceptionalConditions {
	public static void arrayIndexOutOfBoundsException() {
		int numberArray[]= {1,2,3,4,5};
		try {
			for (int i=0; i<=numberArray.length;i++) 
				System.out.println(numberArray[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	public static void divisionByZero() {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		arrayIndexOutOfBoundsException();
		divisionByZero();
	}
}
