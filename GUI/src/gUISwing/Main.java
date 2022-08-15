package gUISwing;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		JFrame frame = new JFrame();	//creates a frame
		frame.setTitle("JFrame title goes here"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit  out of application
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //will not exit
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420, 420); //sets size of frame
		frame.setVisible(true); //makes frame visible
		
		ImageIcon image = new ImageIcon("src/gUISwing/LOGO.png"); //will create an image icon
		frame.setIconImage(image.getImage()); //change icon of frame
		frame.getContentPane().setBackground(new Color(0x123456)); //change colour of background - simple colour: "Color.GREEN", RGB:"new Color(160,220,80)"
		*/
		
		@SuppressWarnings("unused")
		MyFrame myFrame = new MyFrame();
		//new MyFrame(); //if I don't need a name for the object than this works as well
		
	}

}
