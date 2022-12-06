//Student Name: Tomas Smitas
//Date:06/12/2022
//Purpose:Test understanding of interfaces and inheritance in Java.
package Lab9Q1;

public class CD extends LibraryItem
{
	String band;
	String title;
	int numTracks;
	
	public void calculatePrice()
	{
		System.out.println( "1.20 per track");
	}
}
