// Author : Tomas Smitas
// Date : 03/11/2022
// Purpose : Point/Circle inheritance
package Lab5;

public class Point 
{
	private double pointX;
	private double pointY;
	
	public Point()
	{
		this(0, 0);
	}
	public Point(double pointX, double pointY)
	{
		setPointX(pointX);
		setPointY(pointY);
	}
	public void setPointX(double X)
	{
		pointX = X;
	}
	public void setPointY(double Y)
	{
		pointY = Y;
	}
	public double getPointX()
	{
		return pointX;
	}
	public double getPointY()
	{
		return pointY;
	}
	public String toString()
	{
		return (pointX + ", " + pointY);
	}
}
