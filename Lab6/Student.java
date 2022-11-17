//Student Name: Tomas Smitas
//Date:17/11/2022
//Purpose:Test understanding of classes and inheritance
package Lab6;

public class Student extends Person
{
   // Variables
	
   private int[] grades;
   private String[] courses;
   private int numCourses;
   // Constructors
   public Student(String name, String address, String[] courses,int[] grades)
   {
	   super(name,address);
	   setCourses(courses);
	   setGrades(grades);
	   numCourses=0;
   }
   public Student(String name, String address)
   {
	   super(name,address);
	   courses= new String[10];
	   grades= new int[10];
	   numCourses=0;
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
   public void setGrades(int[] grades) 
   {
      this.grades = grades;
   }
   public void addCourseGrade(String course,int grade)
   {
	   courses[numCourses]=course;
	   grades[numCourses]=grade;
	   
	   numCourses++; 
   }
   public void printGrades()
   {
	   System.out.print("Student: " + super.getName()+"("+ super.getAddress()+")");
	   for(int i = 0; i<numCourses;i++)
	   {
		   System.out.print(" "+courses[i]+":"+grades[i]);
	   }
	   System.out.println();
   }
   public double getAverageGrade()
   {
	   double average =0;
	   int i=0;
	   if(numCourses == 0) 
	   {
		   return -1;
	   }
	   else
	   {
		   for(i = 0; i<numCourses;i++)
		   {
			   average += grades[i];
		   }
		average= average/i;
		return average;
	   }
   }
   //toString
   public String toString() 
   {
      return ("Student: " + super.getName()+"("+ super.getAddress()+") "+ courses[0]+":"+grades[0]+courses[1]+":"+grades[1]);
   }
}