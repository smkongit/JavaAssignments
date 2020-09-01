package com.java.assessments.inheritance;

public class Text extends File{
	String size;
	String fileType;
	
	public Text(String fileName, String size, String fileType) {
		super(fileName);
		this.size = size;
		this.fileType = fileType;
	}
	@Override
	public void display() {
		System.out.println("Inside derived class - Text");
		super.display();
		System.out.println("File Type: "+fileType);
		System.out.println("Size: "+size);
	}
	public static void main(String[] args) {
		File binary= new Binary("Binary file", ".bin");
		File text= new Text("Text file", "150 kb", ".txt");
		binary.display();
		text.display();
	}
	
}
