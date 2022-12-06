//Student Name: Tomas Smitas
//Date:06/12/2022
//Purpose:Test understanding of interfaces in Java.
package Lab10;

import javax.swing.JFrame;

public class ChangeColourDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(200, 200);
		changeColour.setVisible(true);

	}//end main

}//end class