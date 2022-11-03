package Lab4;

import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) 
	{
		int employeesCreated = 0;
		
		Employee[] employeeList= new Employee[5];
		Office[] officeList= new Office[3];
		for(int i = 0 ; i < 3; i++)
		{
			Office office = new Office(0,0);
			officeList[i] = office;
		}
		while(employeesCreated != -1)
		{
			Scanner myObj = new Scanner(System.in);
			System.out.println("Press 1 to list all Offices");
			System.out.println("Press 2 to add new employee");
			System.out.println("Press 3 to list all employees");
			int choice=myObj.nextInt();
			if(choice == 1)
			{
				for(int i = 0 ; i < 3; i++)
				{
					System.out.println(officeList[i]);
				}
			}
			else if (choice == 2)
			{
				Scanner myStreet = new Scanner(System.in);
				System.out.println("Enter street for employee " + Employee.employeeID + " here:");
				String street=myStreet.nextLine();
				
				Scanner myTownCity = new Scanner(System.in);
				System.out.println("Enter town/city for employee " + Employee.employeeID + " here:");
				String townCity=myTownCity.nextLine();
				
				Scanner myCounty = new Scanner(System.in);
				System.out.println("Enter county for employee " + Employee.employeeID + " here:");
				String county=myCounty.nextLine();
				
				Address address = new Address(street, townCity, county);
				employeeList[employeesCreated] = new Employee(address);
				employeesCreated++;

				if(officeList[0].getRoomFullness() == false)
				{
					if (officeList[0].getCurrentOccupationNumber() == 0)
					{
						officeList[0].setEmployee1(Employee.employeeID);
					}
					else
					{
						officeList[0].setEmployee2(Employee.employeeID);
					}
				}
				else if (officeList[1].getRoomFullness() == false)
				{
					if (officeList[1].getCurrentOccupationNumber() == 0)
					{
						officeList[1].setEmployee1(Employee.employeeID);
					}
					else
					{
						officeList[1].setEmployee2(Employee.employeeID);
					}
				}
				else
				{
					if (officeList[2].getCurrentOccupationNumber() == 0)
					{
						officeList[2].setEmployee1(Employee.employeeID);
					}
					else
					{
						officeList[2].setEmployee2(Employee.employeeID);
					}
				}
			}
			else if (choice == 3)
			{
					if(employeesCreated == 1)
					{
						System.out.println(employeeList[employeesCreated-1].toString());
					}
					else if (employeesCreated == 2)
					{
						System.out.println(employeeList[employeesCreated-2].toString());
						System.out.println(employeeList[employeesCreated-1].toString());
					}
					else if (employeesCreated == 3)
					{
						System.out.println(employeeList[employeesCreated-3].toString());
						System.out.println(employeeList[employeesCreated-2].toString());
						System.out.println(employeeList[employeesCreated-1].toString());
					}
					else if (employeesCreated == 4)
					{
						System.out.println(employeeList[employeesCreated-4].toString());
						System.out.println(employeeList[employeesCreated-3].toString());
						System.out.println(employeeList[employeesCreated-2].toString());
						System.out.println(employeeList[employeesCreated-1].toString());
					}
					else if (employeesCreated == 5)
					{
						System.out.println(employeeList[employeesCreated-5].toString());
						System.out.println(employeeList[employeesCreated-4].toString());
						System.out.println(employeeList[employeesCreated-3].toString());
						System.out.println(employeeList[employeesCreated-2].toString());
						System.out.println(employeeList[employeesCreated-1].toString());
					}
					else
					{
						System.out.println("Error");
					}
			}
			else
			{
				System.out.println("Error, you need to enter a number between 1 and 3");
			}
		
		
		}
	}
}
