package com.java.assessments.generic.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*3)(Duplicate Elimination) Write a program that reads in a series of first names 
and eliminates duplicates by storing them in a Set. 
Allow the user to search for a first name*/
public class DuplicateElimination {
	public static void removeDuplicates(Collection<String> names) {
		Set<String> uniqueNames = new HashSet<String>(names);
		System.out.println(uniqueNames);
	}
	public static boolean searchForName(Collection<String> names, String findName) 
	{
	    Set<String> findNameSet= new HashSet<String>(names);
	    return findNameSet.contains(findName);
	}
	
	public static void main(String[] args) {
		String findName="";
	
		Scanner scanner = new Scanner(System.in);
		
		String[] firstNames=new String[5];
		System.out.println("Enter the firstnames you wish to add: ");
		for (int i=0;i<firstNames.length;i++){
			firstNames[i] = scanner.nextLine();
			//System.out.println(firstNames[i]);
		} 
				
		List<String> list = Arrays.asList(firstNames);
		removeDuplicates(list);
		System.out.println("Enter the name you want to search: ");
		findName=scanner.next();
		scanner.close();
		if(!searchForName(list,findName)) System.out.println("The FirstName '" +findName+ "' entered is not found!!");
		else System.out.println("The FirstName '" +findName+ "' entered is found!!");
	}
}