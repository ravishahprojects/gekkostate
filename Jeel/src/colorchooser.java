import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class colorchooser extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public colorchooser() {
		super("Color Chooser");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a background color");
		b.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				color = JColorChooser.showDialog(null, "Pick your color", color);
				if(color==null)
					color=(Color.WHITE);
				
				panel.setBackground(color);
			}
		}		
		
		
		); 
		add(panel, BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		setSize(450,150);
		setVisible(true);
	}
}
