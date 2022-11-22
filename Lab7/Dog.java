//Student Name: Tomas Smitas
//Date:22/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab7;

public class Dog extends Animal
{
	public Dog(String typeOfAnimal, int age, char gender)
	{
		super (typeOfAnimal,age,gender);
	}
	public void makeSound()
	{
		System.out.println("woof woof");
	}
	public void wagtail ()
	{
		System.out.println("Tail is wagging");
	}
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}

	
}
