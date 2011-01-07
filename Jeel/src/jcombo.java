import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jcombo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename = {"SOLVED.jpg","SCRAMBLED.jpg"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0]))};
	private Icon[] pics1 = {new ImageIcon(getClass().getResource(filename[1]))};
	
	public jcombo() {
		super("JCombo");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener(){
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED)
							picture.setIcon(pics[box.getSelectedIndex()]);
					}	
				}	
		);
		add(box);
		picture = new JLabel(pics[0]);
		picture = new JLabel(pics1[1]);
		add(picture);
	}

}
