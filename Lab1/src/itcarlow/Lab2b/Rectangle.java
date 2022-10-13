package itcarlow.Lab2b;

public class Rectangle 
	{ // begin Rectangle Class
		private double recLength;
		private double recWidth;
		
		public Rectangle()			// constructor method setting both to 1
		{
			setRecLength(1);	
			setRecWidth(1);
		}
		public Rectangle(double recLen ,double recWid)	
		{
			setRecLength(recLen);
			setRecWidth(recWid);
		}
		public void setRecLength(double recLen)
		{
			if(recLen <= 40.0 && recLen >0.0)
			{
				recLength = recLen;	
			}
			else
			{
				System.out.println("Length has to be greater than 0 and less than or equal to 40");
			}
		}
		public void setRecWidth(double recWid)
		{
			if(recWid <= 40.0 && recWid >0.0)
			{
				recWidth = recWid;	
			}
			else
			{
				System.out.println("Width has to be greater than 0 and less than or equal to 40");
			}		
		}
		
		public double getRecLength()
		{
			return recLength;
		}
		public double getRecWidth()
		{
			return recWidth;
		}
		public String toString()// this method turns our desired output to string
		{
		 return ("Length = " + getRecLength() +", Width = " + getRecWidth());		
		}
		public double getArea()// this method gets the area
		{
		 double area;
		 area = getRecLength()*getRecWidth();// length by width to get area
		 return area;
		}
		public double getPerimeter()// this method gets the perimeter
		{
		 double perimeter;
		 perimeter = (getRecLength()*2)+(getRecWidth()*2);// multiply length by 2 then width by 2 and add them together for parimeter
		 return perimeter;
		}
		public void printRectangle()
		{
			int length = (int) getRecLength();
			int width = (int) getRecWidth();
			if (length>=1)// length has to be more than or equal to 1 to make any valid square
			{
				for (int i=0; i<width; i++)//first loop for the top stars
				{
					System.out.print("*");
				}
			System.out.println();
			}
			if (length>=2)// if length is more than 2 then the next loops run, anything less than 2 is not valid
			{
				for (int i=0; i<length-2; i++)
				{
					System.out.print("*");
					for (int i2=0;i2<width-2;i2++)
					{
						System.out.print(" ");
					}
					System.out.println("*");
				}
				for (int i=0; i<width; i++)// prints the last stars at the bottom
				{
					System.out.print("*");
				}
			}
		}
	} // end class Rectangle
