package Lab4;

import java.util.Scanner;

public class Address 
{
	// Variables
	
	private String street;
	private String townCity;
	private String county;
	// Constructor
	
	public Address(String street, String townCity, String county)
	{
		
		setStreet(street);
		setTownCity(townCity);
		setCounty(county);
	}
	// Setters and Getters
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	public void setTownCity(String townCity)
	{
		this.townCity = townCity;
	}
	public void setCounty(String county)
	{
		this.county = county;
	}
	public String getStreet()
	{
		return street;
	}
	public String getTownCity()
	{
		return townCity;
	}
	public String getCounty()
	{
		return county;
	}
	public String toString()
	{
		return (street + ", " + townCity + ", " + county + ".");
	}
}
