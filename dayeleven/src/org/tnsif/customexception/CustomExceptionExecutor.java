package org.tnsif.customexception;
import java.util.Scanner;

//Program to demonstrate on User-Defined exception
//Driver Class
public class CustomExceptionExecutor extends Exception {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email id and password:");
		String email=s.nextLine();
		String password=s.nextLine();
		try {
			if(email.equals("asaiyad@tnsif.org") && password.equals("Pass@123"))
			{
			System.out.println("Credential Matched");
			}
			else
			{
			throw new LoginCrdentials("Invalid Crdentials");
			}
		
		}
		catch(LoginCrdentials e)
		{
			System.out.println(e);
		}
	}
}
