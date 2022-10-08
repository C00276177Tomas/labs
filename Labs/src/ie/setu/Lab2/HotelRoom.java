package ie.lab2;

public class HotelRoom 
{ // begin HotelRoom
	private int roomNumber;
	private String roomType;
	private int roomVacancy;
	private double roomRate;
	
	public HotelRoom()			// constructor methods #1
	{
		setRoomNumber(0);	
		setRoomType("");
		setRoomVacancy(0);
		setRoomRate(0);
	}
	public HotelRoom(int roomNumber, String roomType, int roomVacancy, double roomRate)	
	{
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setRoomVacancy(roomVacancy);
		setRoomRate(roomRate);
	}
		
	public HotelRoom(int roomNum)	
	{
		setRoomNumber(roomNumber);
	}
	public HotelRoom(String roomTy)
	{
		setRoomType(roomType);
	}
	public void HotelRoom1(int roomVac)	
	{
		setRoomVacancy(roomVacancy);
	}
	public HotelRoom(double roomRat)	
	{
		setRoomRate(roomRate);
	}
	

	public void setRoomNumber(int roomNum)
	{
		roomNumber = roomNum;		
	}
	public void setRoomType(String roomTy)
	{
		roomType = roomTy;		
	}
	public void setRoomVacancy(int roomVac)
	{
		roomVacancy = roomVac;		
	}
	public void setRoomRate(double roomRat)
	{
		roomRate = roomRat;		
	}

	public int getRoomNumber()
	{
		return roomNumber;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public int getRoomVacancy()
	{
		return roomVacancy;
	}
	public double getRoomRate()
	{
		return roomRate;
	}
} // end class HotelRoom
