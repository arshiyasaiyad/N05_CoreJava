package org.tnsif.instanceofdemo;

//Program to demonstrate on instance of operator
//parent class
class Flower
{
	String name="Rose";
}
//child class
class Rose extends Flower
{
	String color="Red";
}

public class InstanceOfExecutor {

	public static void main(String[] args) {
		Rose r=new Rose();
		boolean res=r instanceof Flower;
		System.out.println(r instanceof Flower);
	
	}

}
