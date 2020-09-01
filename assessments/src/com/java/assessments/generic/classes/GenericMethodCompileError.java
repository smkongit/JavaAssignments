package com.java.assessments.generic.classes;

public class GenericMethodCompileError {

	public static < E > void displayArray( E[] genericArray ){
		 for ( E element : genericArray ) 
			System.out.printf( "%s\n", element );
	}

	/* Commented out as the error pops up on a project. please uncomment when you wish to run
	 * public static < E > void displayArray( E[] genericArray ){
		 for ( E element : genericArray ) 
			System.out.printf( "%s\n", element );
	}*/
	
	public static void main( String args[] ){
		String[] stringArray = {"Sample","String","Array","Testing"};
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		displayArray(stringArray);
		displayArray(intArray);
	}
}
