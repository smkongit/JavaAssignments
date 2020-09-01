package com.java.assessments.payrollsystem;

public abstract class Employee {
	String firstName;
	String lastName;
	String employeeId;
	private Date birthDate;
	
	public Employee(String firstName, String lastName, String employeeId, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.birthDate = birthDate;
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public abstract double monthlySalary();

	@Override
	public String toString() {
		return String.format("%s %s \nEmployeeID: %s\nBirth Date: %s\n", getFirstName(),getLastName(),getEmployeeId(),getBirthDate());
	}
}
