package org.tnsif.finalkeyword;

public class Circle extends Shape {

	final float area=34.6f;
	//final method 
	//Cannot override the final method from Shape
	/*void printShapeType()
	{
		System.out.println(shapename);
	}
	*/
	public void printShapeType(float area) 
	{
	System.out.println(area+"sq.cm");
	}
}
