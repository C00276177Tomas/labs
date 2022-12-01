//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public class Triangle extends TwoDShape
{
	private double base;
	private double height;
	public Triangle(String name, String color, double base, double height)
	{
		super (name,color);
		setBase(base);
		setHeight(height);
	}
	public void setBase(double base)
	{
		this.base = base;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double area()
	{
		return (base*height)/2;
	}

}
