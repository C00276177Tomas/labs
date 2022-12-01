//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour);
  		
  	}
 
  	public abstract double area();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}