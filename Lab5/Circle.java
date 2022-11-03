// Author : Tomas Smitas
// Date : 03/11/2022
// Purpose : Point/Circle inheritance
package Lab5;

public class Circle extends Point
{
	private double radius;
	
	public Circle()
	{
		this(0, 0, 0);
	}
	public Circle(double pointX, double pointY, double r)
	{
		super(pointX, pointY);
		setRadius(r);
	}
	public void setRadius(double rad)
	{
		radius=rad;
	}
	public double getRadius()
	{
		return radius;
	}
	public String toString()
	{
		return (super.getPointX() + ", " + super.getPointY() + ", " +  radius);
	}
}
