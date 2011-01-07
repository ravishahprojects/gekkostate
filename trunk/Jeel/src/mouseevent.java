import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class mouseevent extends JFrame {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//variables will go here
		private JPanel mousepanel;
		private JLabel statusbar;
		//JPanel layout is here
		public mouseevent(){
			super("Mouse Event");
			mousepanel = new JPanel();
			mousepanel.setBackground(Color.WHITE);
			add(mousepanel, BorderLayout.CENTER);
			
			statusbar = new JLabel("Default");
			add(statusbar, BorderLayout.SOUTH);
			//Mouse Events handling below//
			HandlerClass handler = new HandlerClass();
			mousepanel.addMouseListener(handler);
			mousepanel.addMouseMotionListener(handler);
		}// Mouse Event Handling is below-----------------
		private class HandlerClass implements MouseListener, MouseMotionListener {
			public void mouseClicked(MouseEvent event){
				statusbar.setText(String.format("Clicked at %d,%d",event.getX(),event.getY()));
			}
			public void mousePressed(MouseEvent event){
				statusbar.setText("you pressed down the mouse");
			}
			public void mouseReleased(MouseEvent event){
				statusbar.setText("you released the mouse");
			}
			public void mouseEntered(MouseEvent event) {
				statusbar.setText("you entered the area");
				mousepanel.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent event) {
				statusbar.setText("the mouse has left the building");
				mousepanel.setBackground(Color.WHITE);
			}
			// for mouse motion
			public void mouseDragged(MouseEvent event) {
				statusbar.setText("you are dragging the mouse");
			}
			public void mouseMoved(MouseEvent event){
				statusbar.setText("your moving your mouse");
			}
			
		}
}
