/*Ask the user for their birth year encoded as 2 digit(like "62")and for the current year ,
 * also encoded as 2 digit(like"99").
 * Write a program to find the user's current age in years.*/

package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalcuator {
	static void ageCalCalculator(int by, int cy)
	{
		if (cy>by) 
		{
			System.out.println(cy-by);
		}
		else
		{
			System.out.println((100-by)+cy);
		}
	}
	

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of birthyear and"+"current y+9+9+ear");
		int cy=s.nextInt();
		int by=s.nextInt();
		ageCalCalculator(cy,by);

	}

}
