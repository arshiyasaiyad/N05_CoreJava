//Program to demonstrate on left angle tringle using for loop
package org.tnsif.homework;

import java.util.Scanner;

public class LeftAngleTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0;i<num;i++)   
		{   
			for(int j=0; j<=i; j++)   
		{   
				System.out.print("*");   
		}   
				System.out.println();   
		}
	}

}
