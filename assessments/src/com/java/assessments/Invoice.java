package com.java.assessments;
/*
2)	(Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—
a part number (type String), 
a part description (type String), 
a quantity of the item being purchased (type int) and
 a price per item (double). 
Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the Making a Difference 101 quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
*/

public class Invoice{
	
	String number;
	String description;
	int quantity;
	double pricePerItem;

	public Invoice(String number, String description, int quantity, double pricePerItem) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity =0;
		}
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		} else {
			this.pricePerItem=0.0;
		}
	}
	
	public double getInvoiceAmount () {
		return quantity * pricePerItem;
	}
	
	public static void main(String[] args) {
		double invoiceTotal =0.0;
		
		Invoice invoiceOne   = new Invoice("I1","2 inch coupling",0,10.0);
		Invoice invoiceTwo   = new Invoice("I2","18 inch Towel rod",2,120.0);
		Invoice invoiceThree = new Invoice("I3","3 metres gate fence",1,0.0);
		Invoice invoiceFour  = new Invoice("I4","3 inch centering nails",50,1.0);

		System.out.println("===========================================================");
		System.out.println("Harware Store Invoice for Customer");
		System.out.println("===========================================================");
		
		System.out.println(invoiceOne.getNumber()+"\t"+invoiceOne.getDescription()+"\t\t"+invoiceOne.getQuantity()+"\t"+invoiceOne.getPricePerItem()+"\t"+invoiceOne.getInvoiceAmount()+"\n");
		System.out.println(invoiceTwo.getNumber()+"\t"+invoiceTwo.getDescription()+"\t"+invoiceTwo.getQuantity()+"\t"+invoiceTwo.getPricePerItem()+"\t"+invoiceTwo.getInvoiceAmount()+"\n");
		System.out.println(invoiceThree.getNumber()+"\t"+invoiceThree.getDescription()+"\t"+invoiceThree.getQuantity()+"\t"+invoiceThree.getPricePerItem()+"\t"+invoiceThree.getInvoiceAmount()+"\n");
		System.out.println(invoiceFour.getNumber()+"\t"+invoiceFour.getDescription()+"\t"+invoiceFour.getQuantity()+"\t"+invoiceFour.getPricePerItem()+"\t"+invoiceFour.getInvoiceAmount()+"\n");
		
		invoiceTotal = invoiceOne.getInvoiceAmount()+invoiceTwo.getInvoiceAmount()+invoiceThree.getInvoiceAmount()+invoiceFour.getInvoiceAmount();
		System.out.println("===========================================================");
		System.out.println("Total "+invoiceTotal);
		System.out.println("===========================================================");
	}
}


	
	
	