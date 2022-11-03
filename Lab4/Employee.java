package Lab4;

import java.util.Scanner;

public class Employee 
{
	static int employeeID = 1000;
	private int employeeNum;
	private Address address;
	private String status = "Staff";
	private String carType = "N/A";
	private int officeNum;
	
	
	public Employee(Address address)
	{
			
		setAddress(address);
		officeNum = 0;
		status = "Staff";
		carType = "N/A";
		employeeNum = employeeID;
		employeeID++;
	}
	public void setAddress(Address address)
	{
		this.address = address; 
	}
	public String getAddress()
	{
		return address.toString();
	}
	public int getEmplyeeNum()
	{
		return employeeNum;
	}
	public String getStatus()
	{
		return status;
	}
	public String getCarType()
	{
		return carType;
	}
	public int getOfficeNumber()
	{
		return officeNum;
	}
	public void changeStatusToManager()
	{
		status = "Manager";
		System.out.println("Congratulations on the promotion, you have been assigned a Tesla Model 3");
		carType= "Tesla Model 3";
	}
	public void changeStatusToStaff()
	{
		status = "Staff";
	}
	public String toString()
	{
		return (employeeNum + ", " + status);
	}
}
