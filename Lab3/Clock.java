package itcarlow.Lab3q1;
import  java.util.Calendar;
public class Clock {
	
	public static void main(String[] args) 
	{
		int currentTime = (int) System.currentTimeMillis();
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		for(int i = currentTime;i<currentTime+60000;i=i+1000)
		{
			while (currentTime+1000 >= (int) System.currentTimeMillis() )
			{
			}
			t.tick();
			System.out.println(t.toString());
		}
	}

}
