package org.tnsif.thiskeyword;
//this can be passed as argument in constructor class
public class ThisKeyWordDemoTwo {

	//default Variable
	int  x,y;
	
	
	public ThisKeyWordDemoTwo(int x, int y)
	{
		
		this.x=x;
		this.y=y;
	}
		void display() {
		System.out.println(x+" "+y);
	}
	
		public static void main(String[] args) {
		ThisKeyWordDemoTwo t=new ThisKeyWordDemoTwo(2,3);
		t.display();
	}

}
