package com.java.assessments;

import java.util.Scanner;

/*
 * Introduction:Classes,Objects,Methods and Strings
	
1)	Create a class called Employee that includes three instance variables—
a first name (type String),
a last name (type String) and 
a monthly salary (double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value.
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */
public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	 
	public Employee() {
		firstName = null;
		lastName = null;
		monthlySalary = 0.0;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public static void main(String[] args) {
		String fName=null;
		String lName=null;
		Double monSalary=0.0;
		
		Employee employeeOne = new Employee();
		Employee employeeTwo = new Employee();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First Name of the First Employee: ");
		fName= scanner.next();
		employeeOne.setFirstName(fName);
		
		System.out.println("Enter the Last Name of the First Employee: ");
		lName= scanner.next();
		employeeOne.setLastName(lName);
		
		System.out.println("Enter the Salary of the First Employee: ");
		monSalary= scanner.nextDouble();
		if (monSalary>0) employeeOne.setMonthlySalary(monSalary);
		
		System.out.println("Enter the First Name of the Second Employee: ");
		fName= scanner.next();
		employeeTwo.setFirstName(fName);
		
		System.out.println("Enter the Last Name of the Second Employee: ");
		lName= scanner.next();
		employeeTwo.setLastName(lName);
		
		System.out.println("Enter the Salary of the Second Employee: ");
		monSalary= scanner.nextDouble();
		if (monSalary>0) employeeTwo.setMonthlySalary(monSalary);
		
		System.out.println("Employees Initial Salary \n");
		System.out.println("First Name\tLast Name\tAnnual Salary\n ");
		System.out.println("==============================================");
		
		System.out.println(employeeOne.getFirstName()+"\t\t"+employeeOne.getLastName()+"\t\t"+Math.round(employeeOne.getMonthlySalary()*12) +"\n");
		System.out.println(employeeTwo.getFirstName()+"\t\t"+employeeTwo.getLastName()+"\t\t"+Math.round(employeeTwo.getMonthlySalary()*12) +"\n");
		
		System.out.println("Employees salary after 10% raise\n");
		System.out.println("First Name\tLast Name\tAnnual Salary\n ");
		System.out.println("==============================================");

		System.out.println(employeeOne.getFirstName()+"\t\t"+employeeOne.getLastName()+"\t\t"+Math.round(employeeOne.getMonthlySalary()*1.1*12) +"\n");
		System.out.println(employeeTwo.getFirstName()+"\t\t"+employeeTwo.getLastName()+"\t\t"+Math.round(employeeTwo.getMonthlySalary()*1.1*12) +"\n");
		
		scanner.close();
	}

}
