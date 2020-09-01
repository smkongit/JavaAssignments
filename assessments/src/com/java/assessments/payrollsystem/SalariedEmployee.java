package com.java.assessments.payrollsystem;

public class SalariedEmployee extends Employee{
	private double monthlySalary;

	public SalariedEmployee(String firstName, String lastName, String employeeId, Date birthDate,
			double monthlySalary) {
		super(firstName, lastName, employeeId, birthDate);
		this.monthlySalary = monthlySalary;
	}
	
	
	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	@Override
	public double monthlySalary() {
		// TODO Auto-generated method stub
		return getMonthlySalary();
	}


	@Override
	public String toString() {
		return String.format( "Salaried Employee: %s%s: $%,.2f",
		         super.toString(), "Monthly Salary", getMonthlySalary() );
	}
}
