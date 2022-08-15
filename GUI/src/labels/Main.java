package labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		//JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("src/labels/LOGO.png");
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JLabel label = new JLabel(); //create a label  //JLabel label = new JLabel("Bro, do you even code?");
		label.setText("Bro, do you even code?"); //set text to label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);  //set text LEFT, CENTER or RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER or BOTTOM of imageicon
		label.setForeground(Color.blue); //set text colour of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
		label.setIconTextGap(25); //set gap of text to image
		label.setBackground(Color.gray); //set background color
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 50, 250, 250); //set x,y position within frame as well as dimensions
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500, 500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}

}
