//Student Name: Tomas Smitas
//Date:22/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab7;

public class Animal 
{
	private String typeOfAnimal;
	private int age;
	private char gender;
	
	
	public Animal(String typeOfAnimal, int age, char gender)
	{
		setTypeOfAnimal(typeOfAnimal);
		setAge(age);
		setGender(gender);
	}
	public void setTypeOfAnimal(String typeOfAnimal)
	{
		this.typeOfAnimal = typeOfAnimal;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public String getType()
	{
		return typeOfAnimal;
	}
	public int getAge()
	{
		return age;
	}
	public char getGender()
	{
		return gender;
	}
	public void eat()
	{
		System.out.println(typeOfAnimal +" is eating");
	}
	public void sleep()
	{
		System.out.println(typeOfAnimal +" is sleeping");
	}
	public void makeSound()
	{
		System.out.println(typeOfAnimal +" dosn't make any sound");
	}
	public String toString()
	{
		return ("Type: " + typeOfAnimal + ", Age: " + age + ", Gender: " + gender);
	}
	

}
