//Student Name: Tomas Smitas
//Date:12/01/2023
//Purpose:Tests your understanding of the concept of windows programming
package Lab11;

import java.awt.Button;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		fahrenField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double fahrenTemp=Integer.parseInt(fahrenField.getText());
				double celcius = ((fahrenTemp - 32) * 0.55555); 
				celsiusField.setText(celcius + "");
			}
		});

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		celsiusField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double celciusTemp=Integer.parseInt(celsiusField.getText());
				double fahren = ((celciusTemp * 1.8) + 32); 
				fahrenField.setText(fahren + "");
			}
		});
		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor


	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

}//end class