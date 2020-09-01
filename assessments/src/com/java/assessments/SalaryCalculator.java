package com.java.assessments;

import java.util.Scanner;

/*
 * Develop a Java application that determines the gross pay for each of three employees. 
 * The company pays straight time for the first 40 hours worked by each employee and time 
 * and a half for all hours worked in excess of 40. 
 * You’re given a list of the employees, their number of hours worked last week and 
 * their hourly rates. 
 * Your program should input this information for each employee, 
 * then determine and display the employee’s gross pay. Use class Scanner to input the data(Salary Calculator) 
 */
public class SalaryCalculator {
	
	public double hourlyPay;
	public double weeklyHours;
	
	public void setWeeklyHours(double weeklyHours) {
		this.weeklyHours=weeklyHours;
	}
	
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay=hourlyPay;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public double getWeeklyHours() {
		return weeklyHours;
	}
	
	public double employeeGrossPay() {
		double employeeGrossPay=0.0;
		if(weeklyHours > 40) {
			employeeGrossPay = (hourlyPay * 40) + (weeklyHours-40)* (hourlyPay * 1.5);
		} else {
			employeeGrossPay = weeklyHours * hourlyPay;
		}
		return employeeGrossPay;
	}
	
	public static void main(String[] args) {

		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter employee's weekly hours\n");
			salaryCalculator.setWeeklyHours(scanner.nextDouble());
			
			System.out.println("Enter employee's hourly rate:\n");
			salaryCalculator.setHourlyPay(scanner.nextDouble());
			
			System.out.println("Employee's Gross Pay: Rs. " + salaryCalculator.employeeGrossPay());
		}
		scanner.close();
	}
}
