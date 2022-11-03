package Lab4;

public class Office 
{
	public static int roomNum = 100;
	private int roomNumber;
	private boolean roomFull = false;
	private int currentOccNum;
	private int employee1 = 0;
	private int employee2 = 0;
	
	public Office(int employee1, int employee2)
	{
		setEmployee1(employee1);
		setEmployee2(employee2);
		currentOccNum = 0;
		roomFull = false;
		roomNumber = roomNum;
		roomNum++;
	}
	public void setEmployee1(int employee1)
	{
		if(roomFull != true)
		{
			this.employee1 = employee1;
			currentOccNum++;
		}
		else
		{
			System.out.println("Room is full, try the next one");
		}
	}
	public void setEmployee2(int employee2)
	{
		if(roomFull != true)
		{
			this.employee2 = employee2;
			currentOccNum++;
			roomFull = true;
		}
		else
		{
			System.out.println("Room is full, try the next one");
		}
		
	}
	public int getEmployee1()
	{
		return employee1;
	}
	public int getEmployee2()
	{
		return employee2;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public int getCurrentOccupationNumber()
	{
		return currentOccNum;
	}
	public boolean getRoomFullness()
	{
		return roomFull;
	}
	
	public String toString()
	{
		return ("Current number of occupants is " + currentOccNum + ". They are employee: " + employee1 + " and employee " + employee2 + ".");
	}
	
	
}
