

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;

import javax.swing.*;
import java.awt.geom.*;

public class MoveObject extends JPanel implements ActionListener, KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double x = 0;
	double y = 0;
	double velx = 3;
	double vely = 3;
	
	Timer t = new Timer(5, this);
	public MoveObject() {
		t.start();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
		g2.fill(circle);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// wall collision
		if(x < 0 || x > 560) {
			velx = -velx;
		}
		if(y < 0 || y > 360) {
			vely = -vely;
		}
		repaint();
		x += velx;
		y += vely;
	}

	
	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
		
	}


	public void keyTyped(KeyEvent e) {
	
		
	}

}
