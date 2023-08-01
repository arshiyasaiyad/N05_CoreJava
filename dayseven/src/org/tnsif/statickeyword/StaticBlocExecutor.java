package org.tnsif.statickeyword;

public class StaticBlocExecutor {
	static float salary;
	String companyName;
	
	/*Static block is used to initalize the staic variable
	 * we can't assign a value for any non-static variable inside
	 * the static block*/
	static {
		//companyname="Accenture";
		salary=57576.90f;
	}
	//static method
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		print();
	}

}
