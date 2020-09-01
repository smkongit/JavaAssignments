package com.java.assessments.payrollsystem;
/*1)	(Payroll System Modification) 
Create the payroll system to include private instance variable birthDate 
in class Employee. Use class Date to represent an employee’s birthday.
Add get methods to class Date. 
Assume that payroll is processed once per month. 
Create an array of Employee variables to store references 
to the various employee objects. 
In a loop, calculate the payroll for each Employee (polymorphically), 
and add a $100.00 bonus to the person’s payroll amount 
if the current month is the one in which the Employee’s birthday occurs.
*/
public class PayRollSystemModification {
	public static void main(String args[]) {
		Date currentDate = new Date(8,31,2020);
		System.out.printf("Current Date: %s\n", currentDate.toString());		
		
		SalariedEmployee permanent = new SalariedEmployee("Ram","Kannan","E001", new Date(8,21,1989),10000.0);
		ContractEmployee temporary = new ContractEmployee("Vinoth", "Krishnan","T001",new Date(9,1,1990),20.0,34.0);

		Employee employee[] = new Employee[2];
		employee[0]= permanent;
		employee[1]= temporary;
		
		for (Employee currentEmployee: employee) {
			System.out.println(currentEmployee);
			if (currentDate.getMonth()==currentEmployee.getBirthDate().getMonth()) {
				System.out.printf("%s: $%,.2f", "Salary with bonus added",currentEmployee.monthlySalary()+100.00);
			}	else {
				System.out.printf("%s: $%,.2f", "Salary", currentEmployee.monthlySalary());
			}
		}
	}
}
