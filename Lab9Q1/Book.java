//Student Name: Tomas Smitas
//Date:06/12/2022
//Purpose:Test understanding of interfaces and inheritance in Java.
package Lab9Q1;

public class Book extends LibraryItem
{
	String author;
	String title;
	int numPages;
	
	public void calculatePrice()
	{
		System.out.println("1.10 per page");
	}
}
