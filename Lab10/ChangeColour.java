//Student Name: Tomas Smitas
//Date:06/12/2022
//Purpose:Test understanding of interfaces in Java.
package Lab10;
//Displays a frame containing two buttons. Pressing the
//"Lighter" button lightens the background of the frame.
//Pressing the "Darker" button darkens the background.

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColour extends JFrame{

		public ChangeColour(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // Add "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // Add "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);
		    
		    // Add "Green" button to frame and attach listener
		    JButton g = new JButton("Green");
		    add(g);
		    g.addActionListener(listener);
		    
		    // Add "Blue" button to frame and attach listener
		    JButton x = new JButton("Blue");
		    add(x);
		    x.addActionListener(listener);
		    
		    // Add "Red" button to frame and attach listener
		    JButton r = new JButton("Red");
		    add(r);
		    r.addActionListener(listener);
		
		    // Attach window listener
		    addWindowListener(new WindowCloser());
		}//end constructor
		
		// Listener for both buttons
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				Color currentBackground =  getContentPane().getBackground();
		 		String buttonLabel = evt.getActionCommand();
	
		 		// Test label on button and change background colour
					if (buttonLabel.equals("Lighter"))
						 getContentPane().setBackground(currentBackground.brighter());
					else if(buttonLabel.equals("Green"))
					{
						getContentPane().setBackground(currentBackground.green);
					}
					else if(buttonLabel.equals("Blue"))
					{
						getContentPane().setBackground(currentBackground.blue);
					}
					else if(buttonLabel.equals("Red"))
					{
						getContentPane().setBackground(currentBackground.red);
					}
				    else
				    	 getContentPane().setBackground(currentBackground.darker());
				}
		}

		// Listener for window
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}

}//end class
