package com.java.assessments;

import java.util.Scanner;
/*
 * 
 * 2) (Calculating Sales) An online retailer sells five products whose retail prices 
 * are as follows: 
 * Product 1, $2.98;
 * product 2, $4.50;
 * product 3, $9.98; 
 * product 4, $4.49 and 
 * product 5, $6.87. 
 * Write an application that reads a series of pairs of numbers as follows: 
 * a) product number
 * b) quantity sold 
 * Your program should use a switch statement to determine the retail price 
 * for each product. It should calculate and display the total retail value 
 * of all products sold. Use a sentinel-controlled loop to determine 
 * when the program should stop looping and display the final results.
 */
public class CalculatingSales {
	public static void main(String[] args) {
		
		double totalRetailPrice=0.0;
		int productNumber=0;
		int quantity=0;
		String loop="yes";
		
		Scanner scanner = new Scanner(System.in);
		
    	while(!(loop.equalsIgnoreCase("no"))) {
    		
    		System.out.println("Product #\tPrice");
    		System.out.println("================");
    		System.out.println("1\t$2.98");
    		System.out.println("2\t$4.50");
    		System.out.println("3\t$9.98");
    		System.out.println("4\t$4.49");
    		System.out.println("5\t$6.97");
    		
    		System.out.println("Enter the product number you wish to add to cart");
    		productNumber=scanner.nextInt();
    		if (productNumber < 1 || productNumber > 5) {
    			System.out.println("The product number must be between 1 & 5");
    			break;
    		}
    		
    		System.out.println("Enter the number of quantity");
    		quantity=scanner.nextInt();
    		if (quantity < 1) {
    			System.out.println("please select at least 1 quantity!");
    			break;
    		}
    		
    		switch(productNumber) {
    		case 1:
    			totalRetailPrice += 2.98*quantity;
    			break;
    			
    		case 2:
    			totalRetailPrice += 4.50*quantity;
    			break;
    			
    		case 3:
    			totalRetailPrice += 9.98*quantity;
    			break;
    			
    		case 4:
    			totalRetailPrice += 4.49*quantity;
    			break;
    			
    		case 5:
    			totalRetailPrice += 6.87*quantity;
    			break;
    			
    		}
    		System.out.println("Do you wish to add more items to cart? yes/ no");
    		loop=scanner.next();
    		if (!((loop.equalsIgnoreCase("yes"))||(loop.equalsIgnoreCase("no")))) {
    			System.out.println("input is invalid! Exiting application");
    			break;
    		}
    	}
    	scanner.close();
    	System.out.println("Total retail prices of products added to cart: $ "+ Math.round(totalRetailPrice*100.0)/100.0);
	}
}
