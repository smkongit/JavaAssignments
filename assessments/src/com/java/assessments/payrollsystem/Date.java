package com.java.assessments.payrollsystem;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int month, int day, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		if (month>0 && month <=12) return month;
			return 0;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month,day,year);
	}
}
