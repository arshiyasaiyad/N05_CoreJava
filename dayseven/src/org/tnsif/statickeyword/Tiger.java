package org.tnsif.statickeyword;

//child class
public class Tiger extends Animal {

	void eat()
	{
		System.out.println("eating:Child");
	}
	static void run()
	{
		/*We cannot override static method*/
		//super.run();
		System.out.println("running:Child");
	}
}
