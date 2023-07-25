/*Program to demonstrate on Default and Parameterized Constructor*/
package org.tnsif.classandobjects;

public class Citizen {
	//data members
	String citizenType;
	long aadharNo;
	String gender;
	String city;

	public Citizen()
	{
		System.out.println("Demonstaration on default constructor");
	}
//Parameterized constructor
	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
		
	}
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
	

}
