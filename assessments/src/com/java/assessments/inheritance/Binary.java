package com.java.assessments.inheritance;

public class Binary extends File{
	String fileType;

	public Binary(String fileName, String fileType) {
		super(fileName);
		this.fileType = fileType;
	}

	@Override
	public void display() {
		System.out.println("Inside derived class - Binary");
		super.display();
		System.out.println("FileType"+ fileType);
	}
	
	
}
