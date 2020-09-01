package com.java.assessments;

public class VariableLengthArgsList {
	public static void main(String args[]) {
		
		System.out.println("Result for four args: "+ product(1,10,20,30));
		System.out.println("Result for eight args: "+ product(5,10,10,0,290,123,123,89));
		System.out.println("Result for three args: "+ product(1,4,5));
		System.out.println("Result for two args: "+ product(100,189));
	}
	public static int product(int... argsList) {
		
		int product=1;
		int i;
		for (i=0; i<argsList.length;i++) {
			product=product*argsList[i];
		}
		return product;
	}
}
