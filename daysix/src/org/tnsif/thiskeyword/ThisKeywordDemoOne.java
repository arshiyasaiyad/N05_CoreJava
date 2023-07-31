//It can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {

	//default Variable
	int  x,y;
	void setData(int x,int y)
	{
		//We can change the parameter variable
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {

		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setData(2,3);
		t.display();
	}

}
