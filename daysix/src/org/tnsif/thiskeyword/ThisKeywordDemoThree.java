package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {

	void print(ThisKeywordDemoThree t)
	{
		System.out.println("Hey There,I am using'this'"+"keyword");
	}
	void display()
	{
		/*When you call parameterized method inside non-perameterized method,then
		 * we get an error,to overcome that we have to use 
		 * this keyword as an argument in the method call*/
		print(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemoThree t=new ThisKeywordDemoThree();
		t.display();

	}

}
