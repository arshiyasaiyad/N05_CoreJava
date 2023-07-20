//Program to demonstrate User Input
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num:");
		int num=s.nextInt();
		System.out.println("The value of the num is:"+num);
		
		System.out.println("Enter the value of floatnum:");
		float num1=s.nextFloat();
		System.out.println("The value of the num is:"+num1);
		
		System.out.println("Enter the character:");
		char c=s.next().charAt(0);
		System.out.println("Character is: "+c);
		
		System.out.println("Enter the string:"+str1);
		String str1=s.next();
		System.out.println("String is:");
		
		System.out.println("Enter the string:"+str2);
		String str2=s.nextLine();
		s.next();
		System.out.println("String is:");
	}

}
