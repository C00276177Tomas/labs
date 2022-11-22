//Student Name: Tomas Smitas
//Date:17/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab7;

public class Vet 
{
	private String name;
	
	public Vet(String name)
	{
		setName(name);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void vaccinate(Animal myAnimal)
	{
		System.out.println(name+" is vaccinating");
		if (myAnimal instanceof Dog)
		{
		System.out.println("Dog has been vaccinated: ");
		System.out.println(myAnimal);
		}
		if (myAnimal instanceof Cat)
		{
		System.out.println("Cat has been vaccinated: ");
		System.out.println(myAnimal);
		}
	}
	
}
