package com.java.assessments;

/*
 * Control Statements Part-II 
 * 1)  Factorials are used frequently in probability problems.
 * The factorial of a positive integer n (written n! and pronounced “n factorial”)
 * is equal to the product of the positive integers from 1 to n. 
 * Write an application that calculates the factorials of 1 through 20. 
 * Use type long. 
 * Display the results in tabular format. 
 * What difficulty might prevent you from calculating the factorial of 100?(Factorials)
 */

public class Factorials {
	 static long factorial(long number) { 
        if (number == 0) {
        	return 1; 
        } else {
        	return number*factorial(number-1); 	
        }        
    } 
      
    public static void main(String[] args)  { 
    	System.out.println("=======================================");
    	System.out.println("Number\t\tFactorial");
    	System.out.println("=======================================");
    	for (int i=1;i<=20;i++) {
    		System.out.println(i +"\t\t"+ factorial(i)); 	
    		System.out.println("=======================================");
    	}
    	// the size of long prevents calculating factorial. Using BigInteger for Long will resolve this Overflow
    } 
} 