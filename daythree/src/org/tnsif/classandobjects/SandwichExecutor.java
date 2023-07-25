//Driver Class
/*Program to demonstrate class and objects*/
package org.tnsif.classandobjects;

public class SandwichExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object creation
		Sandwich s=new Sandwich();
		s.breadType="Brown Bread";
		s.noOfSlice=4;
		//method call
		s.display();
	}

}
