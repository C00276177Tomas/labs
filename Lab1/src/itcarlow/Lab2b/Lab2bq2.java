package itcarlow.Lab2b;

public class Lab2bq2 
{

	public static void main(String[] args) 
	{
		{
			
			Rectangle rectangleA = new Rectangle();		
			rectangleA.setRecLength(10);
			rectangleA.setRecWidth(10);
			System.out.println(rectangleA.toString());
			System.out.println("The area is = " + rectangleA.getArea() + ". The perimeter is = " + rectangleA.getPerimeter());	
		}
	}
}