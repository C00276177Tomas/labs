package Lab7;

public class AnimalTest
{
	public static void main (String args[])
	{
		Vet john = new Vet("John");
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		if (dog instanceof Dog)
		{
		((Dog) dog).wagtail();
		}
		john.vaccinate(dog);

		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();
		if (cat instanceof Cat)
		{
		((Cat) cat).catchMouse();
		}
		john.vaccinate(cat);

		System.out.println();

		Animal cow = new Cow("Daisy", 3, 'F');
		System.out.println(cow);
		cow.eat();
		cow.sleep();
		cow.makeSound();

		}
}