import java.awt.*;// this is our 2nd class
import javax.swing.*;
public class mango extends JFrame {   //it needs to extend JFrame which means that is inheirts everything from JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		// variables 
		private JButton jb;
	
		public mango() {
			super("The Tile");// This is for the Title
			setLayout(new FlowLayout());// set your layout
			
			jb = new JButton("Button"); // we are declaring the button now
			add(jb);// we have added the button now 
		}	
		
}
