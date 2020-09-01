package com.java.assessments.generic.classes;

/*3)Overloading Generic Methods) How can generic methods be overloaded? 
*/
public class GenericMethodOverloading {
	
	public static < E > void displayArray( E[] genericArray ){
		 for ( E element : genericArray ) 
			System.out.printf( "%s\n", element );
	}
	//can be overloaded with different parameters
	public static <E> void displayArray(E[] genericArray, E genericVariable) {
	 for ( E element : genericArray ) {
		System.out.printf( "first param: %s\n", element );
	 }
		System.out.printf("second param: %s\n", genericVariable);
	}
	public static void main( String args[] ){
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		String[] stringArray = {"Sample","String","Array","Testing"};
		
		int intInput = intArray.length;
		String strInput = "Character";
		double doubleInput = 4.0;
		
		System.out.println( "characterArray " );
		displayArray( charArray ); 
		System.out.println( "Overloaded method for Integer");
		displayArray(intArray,intInput);
		System.out.println( "Overloaded method for String");
		displayArray(stringArray,doubleInput);
		System.out.println( "Overloaded method for charcter");
		displayArray(charArray,strInput);		
		}
}
