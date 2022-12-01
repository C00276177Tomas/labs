//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q1;

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}