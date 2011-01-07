import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class adapter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String details;
	private JLabel statusbar;
		
		public adapter() {
			super("Adpater");
			
			statusbar = new JLabel("This is default");
			add(statusbar,BorderLayout.SOUTH);
			addMouseListener(new MouseClass());
		}
		
		private class MouseClass extends MouseAdapter{
			public void mouseClicked(MouseEvent event) {
				details = String.format("You clicked %d",event.getClickCount());
				
				if(event.isMetaDown()) 
						details += " with right mouse button";
					else if (event.isAltDown())
						details += " with center mouse button";
					else 
						details += " with left mouse button";
				
						statusbar.setText(details);
			}
		}
}

