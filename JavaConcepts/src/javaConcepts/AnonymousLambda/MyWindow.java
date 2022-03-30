package javaConcepts.AnonymousLambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		//window: object frame
		JFrame frame = new JFrame("My Window");
		
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		
		//Create button and add jframe
		JButton button = new JButton("Click Me!!");
		/*
		//Using Anonymous class 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Click");
				JOptionPane.showMessageDialog(null, "Button Clicked");
				
			}
		});
		*/
		
		//We can use Lambda also as ActionListener is functional Interface which is having only one abstract method
		
		button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button Clicked"));
		
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
