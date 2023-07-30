
/*Pratik is so much intrested in gardening and hence he plants more plants in his garden.
 * he plants trees in rectangular with the order of rows and coloumns and numbers 
 * the trees in row wise order.He planted the mango 
 * tree in the first row first column and the last column.
 * So, the given the tree number and rows and column,
 * The task is to find out the given tree is mango tree or not */
//n=5(column & rows) t=11
package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {

	static void isMangoTree(int n, int t)
	{
		if (t%n==0 ||t%n==1 || t<=n ) 
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n & t:");
		int n=s.nextInt();
		int t=s.nextInt();
		
		isMangoTree(n,t);
	}

}
