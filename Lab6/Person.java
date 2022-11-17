//Student Name: Tomas Smitas
//Date:17/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab6;

public class Person 
{
   // Variables
   public String name;
   public String address;
   
   // Constructors
   public Person(String name, String address) 
   {
      setName(name);
      setAddress(address);
   }
   
   // Getters & Setters
   public void setName(String name) 
   {
      this.name=name;
   }
   public void setAddress(String address) 
   {
      this.address = address;
   }
  
   public String getName() 
   {
      return name;
   }
   public String getAddress() 
   {
      return address;
   }
   //toString
   public String toString() 
   {
      return name + "(" + address + ")";
   }
}