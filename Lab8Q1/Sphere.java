//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public class Sphere extends ThreeDShape
{
	private double radius;
	public Sphere(String name, String color, double radius)
	{
		super (name,color);
		setRadius(radius);
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double volume()
	{
		return (4.0/3.0)*3.14*(radius*radius*radius);
	}
	public double area() 
	{
		return 4*3.14*(radius*radius);
	}

}