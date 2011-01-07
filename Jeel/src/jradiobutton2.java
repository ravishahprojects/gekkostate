import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jradiobutton2 extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public jradiobutton2() {
		super("Radio Button");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Jeel is the best",16);
		add(tf);
		
		pb = new JRadioButton("Plain",true);
		bb = new JRadioButton("Bold",false);
		ib = new JRadioButton("Italic",false);
		bib = new JRadioButton("Bold and Italic");
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN,14);
		bf = new Font("Serif", Font.BOLD,14);
		itf = new Font("Serif", Font.ITALIC,14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC,14);
		tf.setFont(pf);
		
		// wait for event to happen, pass in font object to constructor
		pb.addItemListener(new HandlerClass(pf));
		pb.addItemListener(new HandlerClass(bf));
		pb.addItemListener(new HandlerClass(itf));
		pb.addItemListener(new HandlerClass(bif));
	
		
		
		
			
	}

	private class HandlerClass implements ItemListener{ 
		private Font font; 
		// The font object get variable font
		public HandlerClass(Font f){
			font = f;
		
			}
		//sets the font to the font object that was passed in
		 	public void itemStateChanged(ItemEvent event) {
		 		tf.setFont(font);
		 	}
		}
		
}
