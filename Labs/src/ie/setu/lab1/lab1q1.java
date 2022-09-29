package ie.setu.lab1;

public class lab1q1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Hello");
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		
		Thermometer thermB = new Thermometer(10);		// Create an instance of our Thermometer class
		
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
	}

}
