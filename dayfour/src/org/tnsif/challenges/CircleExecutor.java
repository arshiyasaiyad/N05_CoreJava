/*There are n people standing in a circle waiting to be executed.
 * The counting out begins at some point in a circle and proceeds around the circle
 * in a fixed direction. In each state a certain number of people are skipped and 
 * the next person is executed. * The Elimination proceeds around the circle 
 * (Which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains, who is given freedom. */
/*Given the total number of person n and a number k which indicates k-1 person are skipped
 * and kth person is killed in the circle .The task is to choose the person in 
 * the initial circle survives.*/
//n=5 k=2 using recursion
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleExecutor {
	
      static int survive(int n,int k)
	{
		if (n==1)
			return 1;
		else 
			return (survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		
	}
 
}
