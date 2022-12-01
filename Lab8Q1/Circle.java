//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public class Circle extends TwoDShape
{
	private double radius;
	public Circle(String name, String color, double radius)
	{
		super (name,color);
		setRadius(radius);
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius(double radius)
	{
		return radius;
	}
	public double area()
	{
		return 3.14*(radius*2);
	}

}
