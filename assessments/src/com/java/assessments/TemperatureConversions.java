package com.java.assessments;

import java.util.Scanner;

/*2)	(Temperature Conversions) Implement the following integer methods: 
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, 
using the calculation celsius = 5.0 / 9.0 * ( fahrenheit - 32 ); 
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, 
using the calculation fahrenheit = 9.0 / 5.0 * celsius + 32; c) 
Use the methods from parts (a) and (b) to write an application 
that enables the user either to enter a Fahrenheit temperature 
and display the Celsius equivalent 
or to enter a Celsius temperature and display the Fahrenheit equivalent.
*/
public class TemperatureConversions {
	
	public static int celsius(int fahrenheitTemperature) {
		return (int) (5.0 / 9.0 * (fahrenheitTemperature - 32));
	}
	
	public static int fahrenheit(int celsiusTemperature) {
		return (int) (9.0 / 5.0 * (celsiusTemperature + 32));
	}
	
	public static void main(String[] args) {
		int option;
		int temperature;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter \"1\" for Fahrenheit to Celsius conversion "
				+ "\nEnter \"2\" for Celsius to Fahrenheit Conversion");
		option=scanner.nextInt();
		
		System.out.println("Enter the temperature");
		temperature=scanner.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("The temperature converted from Fahrenheit to Celsius is: " + celsius(temperature)+" degrees");
			break;
			
		case 2:
			System.out.println("The temperature converted from Celsius to Fahrenheit is: " + fahrenheit(temperature)+" F");
			break;
		
		default:
			System.out.println("The specified option is invalid. Please select 1 or 2 ");
			break;
		}
		scanner.close();
	}	
}
