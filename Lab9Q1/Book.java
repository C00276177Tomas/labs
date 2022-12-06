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
