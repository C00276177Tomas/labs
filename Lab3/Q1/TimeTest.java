package itcarlow.Lab3q1;

//Driver program to test the Time class.
public class TimeTest
{
	public static void main (String args[])
	{
		Time t = new Time (17, 59, 59);
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		t.tick();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
	}
}
