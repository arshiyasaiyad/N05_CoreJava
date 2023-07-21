//Program to demonstrate on Ternary Operator
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		String res=(num%2==0)?"Even":"Odd";
		System.out.println("Result is:"+res);
		s.close();
	}

}
