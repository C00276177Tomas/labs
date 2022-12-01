//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance

package Lab8Q2;

public class Employee extends Person
{
	private double annualSalary;
	
	public Employee(String name, double annualSalary)
  	{ 
  		super(name); 
  		setAnnualSalary(annualSalary);
  	}
	public void setAnnualSalary(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}
	public String getDescription()
	{
		return "An employee with a salary of " + annualSalary;
	}
}
