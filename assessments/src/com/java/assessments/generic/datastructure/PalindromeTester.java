package com.java.assessments.generic.datastructure;

import java.util.Scanner;
import java.util.Stack;

/*3)(Palindrome Tester) Write a program that uses a stack 
 * to determine whether a string is a palindrome 
 * (i.e., the string is spelled identically backward and forward). 
 * The program should ignore spaces and punctuation.
*/
public class PalindromeTester {
	public static void main(String[] args) {
		String inputString ="";
        String reverseString = "";
		System.out.print("Enter the string: ");
        Scanner scanner=new Scanner(System.in);
        inputString= scanner.nextLine();
    	inputString = inputString.replace(" ","").replaceAll("\\p{Punct}",""); 
    	scanner.close();
        
    	Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equalsIgnoreCase(reverseString))
            System.out.println("The string "+inputString+ " is a palindrome.");
        else
            System.out.println("The string "+inputString+ " is not a palindrome.");
	}
}
