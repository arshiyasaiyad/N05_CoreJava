//Program to demonstrate on Access Specifier
package org.tnsif.accessspecifier;

public class Bank {
	
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=3456778901234L;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Bank Name is: "+bankName);
	}
	
	//private method
	private void displayPrivate()
	{
		System.out.println("Pin Number is"+pinNo);
	}
	
	//default method
	void displayDefault()
	{
		System.out.println("Account Number is"+accountNo);
	}
	
}
