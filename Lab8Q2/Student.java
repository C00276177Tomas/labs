//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q2;

public class Student extends Person
{
	private String course;
	
	public Student(String name, String course)
  	{ 
  		super(name); 
  		setCourse(course);
  	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public String getDescription()
	{
		return "A student studying " + course;
	}
}
