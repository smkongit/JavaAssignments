package com.java.assessments.generic.datastructure;

import java.util.LinkedList;

/*1)	(Concatenating Lists) Write a program that concatenates two linked list objects 
of characters. Class ListConcatenate should include a static method concatenate that 
takes references to both list objects as arguments and concatenates the 
second list to the first list*/

public class ListConcatenate {
    public static void concatenateList(LinkedList < Character > list1,
            LinkedList < Character > list2) {
            list1.addAll(list2);
            System.out.println("Concatenation of Lists: " + list1);
    }
    
    public static void main(String[] args) {
    	LinkedList < Character > listOne = new LinkedList < Character > ();
        listOne.add('F');
        listOne.add('i');
        listOne.add('r');
        listOne.add('s');
        listOne.add('t');
        System.out.println("First linked list: " + listOne);
        LinkedList < Character > listTwo = new LinkedList < Character > ();
        listTwo.add('S');
        listTwo.add('e');
        listTwo.add('c');
        listTwo.add('o');
        listTwo.add('n');
        listTwo.add('d');
        System.out.println("Second linked list: " + listTwo);
        concatenateList(listOne, listTwo);
    }
}

