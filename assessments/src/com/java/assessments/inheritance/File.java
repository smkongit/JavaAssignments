package com.java.assessments.inheritance;

/*
 * 1)	create base class File and extends it to binary,text.
*/
public class File {
	String fileName;

	public File(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void display() {
		System.out.println("Base Class File");
		System.out.println("File Name: "+ fileName);
	}
}
