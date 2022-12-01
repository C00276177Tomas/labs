//Student Name: Tomas Smitas
//Date:01/12/2022
//Purpose:Test understanding of abstract classes and inheritance
package Lab8Q2;

public class TestPerson {

	public static void main(String[] args) 
	{
		Person[] people = {new Student("Tom", "Programming"), new Employee("Jim", 2000000)};

		System.out.println(people[0].getName());
		System.out.println(people[0].getDescription());
		
		System.out.println(people[1].getName());
		System.out.println(people[1].getDescription());
	}

}
