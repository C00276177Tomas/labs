package Lab7;

public class Cat extends Animal
{
	public Cat(String typeOfAnimal, int age, char gender)
	{
		super (typeOfAnimal,age,gender);
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}
	public void makeSound()
	{
		System.out.println("prrrrrrrr");
	}
	public void catchMouse()
	{
		System.out.println("Cat cought a mouse");
	}
}
