//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q2;

public abstract class Person
{
	private String name;
	
	public Person(String name)
  	{ 
  		this.name = name;
  	} 
  	
  	public String toString()
  	{
  		return ("Person Name = " + this.name);
  	}
  	
  	public String getName()
  	{
  		return name;
  	}
  	public abstract String getDescription();
}