package com.java.assessments.payrollsystem;

public class ContractEmployee extends Employee{
	private double ratePerHour;
	private double weeklyHours;
	
	public ContractEmployee(String firstName, String lastName, String employeeId, Date birthDate, double ratePerHour,
			double weeklyHours) {
		super(firstName, lastName, employeeId, birthDate);
		this.ratePerHour = ratePerHour;
		this.weeklyHours = weeklyHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public double getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(double weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	@Override
	public double monthlySalary() {
		if (getWeeklyHours()<=40) {
			return getWeeklyHours()*getRatePerHour()*4;
		} else {
			return ((getRatePerHour() * 40) + (getWeeklyHours()-40)* (getRatePerHour() * 1.5)*4);
		}
	}

	@Override
	public String toString() {
		return String.format("\n\nContract Employee: %s%s: $%,.2f\n%s: %,.2f", super.toString(), "Hourly Rate", getRatePerHour(),"Weekly Hours", getWeeklyHours());
	}
}
