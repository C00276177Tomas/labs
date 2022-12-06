package Lab9Q2;

public class Driver {

	public static void main(String[] args) 
	{
		RoadVehicle[] vehicles = {new Car(), new HVG()};
		
		vehicles[0].calculateDuty();
		
		vehicles[1].calculateDuty();

	}

}
