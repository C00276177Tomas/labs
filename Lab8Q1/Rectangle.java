//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public class Rectangle extends TwoDShape
{
	private double length;
	private double breadth;
	public Rectangle(String name, String color, double length, double breadth)
	{
		super (name,color);
		setLength(length);
		setBreadth(breadth);
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}

}
