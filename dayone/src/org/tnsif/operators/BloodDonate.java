//Eligble or not to donate blood
package org.tnsif.operators;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("Enter your weight:");
		int weight=s.nextInt();

		if(age>=18 && weight>=50)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		
	}

}
