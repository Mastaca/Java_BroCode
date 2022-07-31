import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	JButton myButton = new JButton("MY BUTTON 1");
	JButton myButton2 = new JButton("MY BUTTON 2");
	
	MyFrame() {
		myButton.setBounds(100, 75, 200, 100);
		myButton.addActionListener(
			(e) -> System.out.println("You clicked button 1!")
			);
		
		myButton2.setBounds(100, 225, 200, 100);
		myButton2.addActionListener(
			(e) -> System.out.println("You clicked button 2!")
			);
		
		/*
		myButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked the button!");
				
			}			
		});
		*/
		
		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}

}
