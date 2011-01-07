import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBox2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables***********************************************
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	//layout**************************************************
	
	public JCheckBox2() {
		super("My sentence");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is awesome sentence ",20);
		tf.setFont(new Font("Serif",Font.PLAIN,14)); 
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");
		add (boldbox);
		add (italicbox);
		
		HandlerClass handler = new HandlerClass(); 
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
		
		
		
	// Handles and Font Handlers*********************************	
	}
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			Font font = null; 
			
			if(boldbox.isSelected() && italicbox.isSelected())
				font = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
			
			else if (boldbox.isSelected())
				font = new Font("Serif",Font.BOLD,14);
			
			else if (italicbox.isSelected())
				font = new Font ("Serif",Font.ITALIC,14);
			else 
				font = new Font("Serif",Font.PLAIN,14);
			
			tf.setFont(font);
		}
	}
	
}
