package com.java.assessments.generic.datastructure;

import java.util.Scanner;
import java.util.Stack;

/*2)	(Printing a Sentence in Reverse Using a Stack) Write a program that inputs
a line of text and uses a stack to display the words of the line in reverse order.
*/
public class StackReverseString {
	public static void reverseWords(String inputString) {
        Stack <String> stack = new Stack <> ();
        String[] tokens = inputString.split(" ");

        for (int i= 0; i < tokens.length; i++) {
            stack.push(tokens[i]);
        }
        while (!stack.empty()) {
        	System.out.printf("%s ", stack.peek()+" ");
            stack.pop();
        } //System.out.printf("Reverse sentence:%s ", appendString);
    }

    public static void main(String[] args) {
        String sentence = "";
        System.out.print("Enter the sentence: ");
        Scanner scanner= new Scanner(System.in);
        sentence=scanner.nextLine();
        scanner.close();
        reverseWords(sentence);
    }
}