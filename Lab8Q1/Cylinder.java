//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public class Cylinder extends ThreeDShape
{
	private double radius;
	private double height;
	public Cylinder(String name, String color, double radius, double height)
	{
		super (name,color);
		setRadius(radius);
		setHeight(height);
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double volume()
	{
		return (3.14*(radius*2))*height;
	}
	public double area() 
	{
		return (22*radius*(radius+height))/7;
	}

}