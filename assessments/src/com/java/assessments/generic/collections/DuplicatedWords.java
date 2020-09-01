package com.java.assessments.generic.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 
public class DuplicatedWords {
    public static void main(String[] args) {
    	String inputString="";
    	System.out.println("Enter the sentence for which duplicate words has to be calculated:");
    	Scanner scanner=new Scanner(System.in);
    	inputString=scanner.nextLine();
    	scanner.close();
    	inputString = inputString.replaceAll("\\p{Punct}",""); 

        List<String> list = Arrays.asList(inputString.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        Set<String> duplicateWords=new HashSet<String>();
        for (String word : uniqueWords) {
        	if(Collections.frequency(list, word)>1) {
        		duplicateWords.add(word);
        	}
        }
        System.out.println(duplicateWords);
    }
}
 