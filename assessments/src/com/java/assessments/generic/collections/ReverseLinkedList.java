package com.java.assessments.generic.collections;

/*(Copying and Reversing LinkedLists) Write a program that 
creates a LinkedList object of 10 characters, 
then creates a second 
LinkedList object containing a 
copy of the first list, but in reverse order
*/

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<Character>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');
		list.add('i');
		list.add('j');
		
		System.out.println("LinkedList: "+list);
		
		LinkedList<Character> reverseList = new LinkedList<Character>();
		Iterator<Character> reverseIterator = list.descendingIterator();

		while(reverseIterator.hasNext()) {
			reverseList.add(reverseIterator.next());
		} 
		System.out.println("Reverse Linked List: "+reverseList);
	}
}
