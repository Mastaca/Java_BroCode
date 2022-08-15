package gUISwing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MyFrame() {
		this.setTitle("Jthis title goes here"); //sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit  out of application
		//this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE); //will not exit
		this.setResizable(false); //prevent frame from being resized
		this.setSize(420, 420); //sets size of frame
		this.setVisible(true); //makes frame visible
		
		ImageIcon image = new ImageIcon("src/gUISwing/LOGO.png"); //will create an image icon
		this.setIconImage(image.getImage()); //change icon of frame
		this.getContentPane().setBackground(new Color(0x123456)); //change colour of background - simple colour: "Color.GREEN", RGB:"new Color(160,220,80)"
	}

}
