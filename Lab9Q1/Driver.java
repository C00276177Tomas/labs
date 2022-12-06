//Student Name: Tomas Smitas
//Date:06/12/2022
//Purpose:Test understanding of interfaces and inheritance in Java.
package Lab9Q1;


public class Driver {

	public static void main(String[] args) 
	{
		LibraryItem[] items = {new Book(), new CD()};
		
		items[0].calculatePrice();
		
		items[1].calculatePrice();

	}

}
