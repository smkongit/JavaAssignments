package com.java.assessments;

import java.util.Scanner;

/* Control Statements - Part 1
 * 1)	 Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available: 
a) account number 
b) balance at the beginning of the month 
c) total of all items charged by the customer this month 
d) total of all credits applied to the customer’s account this month 
e) allowed credit limit. 

The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits), display the new balance and determine whether the new balance exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".(Credit Limit Calculator)
*/

public class CreditLimitCalculator {
	
	int accountNumber;
	int initialBalance;
	int totalCharge;
	int totalCredit;
	int creditLimitAllowed;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public int getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(int totalCharge) {
		this.totalCharge = totalCharge;
	}
	public int getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}
	public int getCreditLimitAllowed() {
		return creditLimitAllowed;
	}
	public void setCreditLimitAllowed(int creditLimitAllowed) {
		this.creditLimitAllowed = creditLimitAllowed;
	}
	
	public int getNewBalance(){
        return getInitialBalance() + getTotalCharge() -getTotalCredit();
    }
    public boolean validateCreditLimit(){
        return (getNewBalance() > getCreditLimitAllowed()) ? false : true;
    }
    
    public static void main(String[] args) {
    	
    	int accountNumber;
    	int initialBalance;
    	int totalCharge;
    	int totalCredit;
    	int creditLimitAllowed;
    	
    	String loop="yes";
    	
    	CreditLimitCalculator creditLimit = new CreditLimitCalculator();
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	while(!(loop.equalsIgnoreCase("no"))) {
    		System.out.println("Enter Account Number: \n");
    		accountNumber= scanner.nextInt();
    		creditLimit.setAccountNumber(accountNumber);
 
    		System.out.println("Enter Initial Balance: \n");
    		initialBalance= scanner.nextInt();
    		creditLimit.setInitialBalance(initialBalance);
    		
       		System.out.println("Enter Total Charges: \n");
    		totalCharge= scanner.nextInt();
    		creditLimit.setTotalCharge(totalCharge);
 
    		System.out.println("Enter Total Credits: \n");
    		totalCredit= scanner.nextInt();
    		creditLimit.setTotalCredit(totalCredit);
    		
    		System.out.println("Enter Credit Limit Allowed: \n");
    		creditLimitAllowed= scanner.nextInt();
    		creditLimit.setCreditLimitAllowed(creditLimitAllowed);
        	
    		//System.out.println("New balance: " +creditLimit.getNewBalance());
        	
        	if(!(creditLimit.validateCreditLimit())) {
        		System.out.println("Credit limit exceeded.");
        	}  
        	
        	System.out.println("Would you like check for another customer? yes/ no \n");
        	loop=scanner.next();
        	if (!((loop.equalsIgnoreCase("yes"))||(loop.equalsIgnoreCase("no")))) {
        		System.out.println("input is invalid! Exiting application");
        		break;
        	}
        	
    	}
    	scanner.close();
    	
    }
}
