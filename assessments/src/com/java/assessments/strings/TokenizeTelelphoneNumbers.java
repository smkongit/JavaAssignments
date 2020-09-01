package com.java.assessments.strings;

import java.util.Scanner;

/*1)	(Tokenizing Telephone Numbers) 
Write an application that inputs a telephone number as a string in the form 
(555) 555-5555. 
The application should String method split to extract the area code as a token, 
the first three digits of the phone number as a token and the last four digits 
of the phone number as a token. 
The seven digits of the phone number should be concatenated into one string. 
Both the area code and the phone number should be printed. 
Remember that you’ll have to change delimiter characters 
during the tokenization process.*/

public class TokenizeTelelphoneNumbers {
	public static void main(String[] args) {
		String inputPhoneNumber=null;
		String tokenOne[]=null;
		String tokenTwo[]=null;
		String areaCode=null;
		String phoneNumber=null;
		
		System.out.println("Enter the phone number in (555) 555-5555 format");
		
		Scanner scanner = new Scanner(System.in);
		inputPhoneNumber=scanner.nextLine();
		scanner.close();
		
		tokenOne=inputPhoneNumber.split(" ");
		areaCode=tokenOne[0].replace("(", "").replace(")","");

		tokenTwo=tokenOne[1].split("-");
		phoneNumber=tokenTwo[0]+tokenTwo[1];
		
		System.out.printf("AreaCode: %s \t PhoneNumber:%s", areaCode,phoneNumber);	
		
	}	
}
