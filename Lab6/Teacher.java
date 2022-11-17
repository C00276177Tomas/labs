//Student Name: Tomas Smitas
//Date:17/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab6;

public class Teacher extends Person
{
   // Variables
	private String[] courses;
	private int numCourses;
   // Constructors
   public Teacher(String name, String address, String[] courses) 
   {
	  super(name,address);
	  setCourses(courses);
	  numCourses = 0;
   }
   public Teacher(String name, String address) 
   {
	  super(name,address);
	  courses= new String[10];
	  numCourses = 0;
   }
   
   // Getters & Setters
   public void setNumCourses(int numCourses) 
   {
      this.numCourses=numCourses;
   }
   public void setCourses(String[] courses) 
   {
      this.courses = courses;
   }
   public boolean addCourse(String course)
   { 
	   if(numCourses > 10) // if more than 10 then the array is full
	   {
		   return false;
	   }
	   else
	   {
		   courses[numCourses]=course;
		   
		   numCourses++;
		   return true;
	   }
   }
   public boolean removeCourse(String course)
   { 
	   if(numCourses == 0) // can't delete if there are no courses
	   {
		   return false;
	   }
	   else
	   {
		   courses[numCourses]=" ";
		   
		   numCourses--;
		   return true;
	   }
   }
   //toString
   public String toString() 
   {
      return ("Teacher: "+super.getName()+"("+ super.getAddress()+")");
   }
}