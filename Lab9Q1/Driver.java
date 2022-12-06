package Lab9Q1;


public class Driver {

	public static void main(String[] args) 
	{
		LibraryItem[] items = {new Book(), new CD()};
		
		items[0].calculatePrice();
		
		items[1].calculatePrice();

	}

}
