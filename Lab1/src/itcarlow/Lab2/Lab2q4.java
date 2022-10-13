package itcarlow.Lab2;

public class Lab2q4 {

	public static void main(String[] args) 
	{
		
		HotelRoom roomA = new HotelRoom();		// Create an instance of our HotelRoom class
		
		roomA.setRoomType("Single");
		roomA.setRoomNumber(200);
		roomA.setRoomVacancy(1);
		roomA.setRoomRate(100);
		System.out.println("Hotel room A number is " + roomA.getRoomNumber() + ". Type of room is " + roomA.getRoomType() + ". Room vacancy is " + roomA.getRoomVacancy() + ". Room Rate is " + roomA.getRoomRate() + ".");
		
		
		HotelRoom roomB = new HotelRoom();		// Create an instance of our HotelRoom class
		
		roomB.setRoomType("Double");
		roomB.setRoomNumber(201);
		roomB.setRoomVacancy(0);
		roomB.setRoomRate(80);
		System.out.println("Hotel room B number is " + roomB.getRoomNumber() + ". Type of room is " + roomB.getRoomType() + ". Room vacancy is " + roomB.getRoomVacancy() + ". Room Rate is " + roomB.getRoomRate() + ".");
		
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		System.out.println("Hotel room C number is " + roomC.getRoomNumber() + ". Type of room is " + roomC.getRoomType() + ". Room vacancy is " + roomC.getRoomVacancy() + ". Room Rate is " + roomC.getRoomRate() + ".");
		
	}

}