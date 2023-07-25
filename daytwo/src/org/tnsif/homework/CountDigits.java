package org.tnsif.homework;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	 	      int count = 0;
		      System.out.println("Enter a number :");
		      int num = s.nextInt();
		      while(num!=0){
		         num = num/10;
		         count++;
		      }
		      System.out.println("Number of digits in the entered integer are : "+count);
	}

}
