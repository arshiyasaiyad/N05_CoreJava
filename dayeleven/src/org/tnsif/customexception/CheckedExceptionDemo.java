package org.tnsif.customexception;
//Program to demonstrate on Checked Exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f= new FileInputStream("C:\\Users\\hp\\Desktop\\hello.txt");
		System.out.println("File has found");
		}
		catch(FileNotFoundException e)
		{
		System.out.println("File is not exist: "+e);	
		}
	}

}
