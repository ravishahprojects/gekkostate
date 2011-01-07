import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Jbutton extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton reg;
	private JButton custom;
	
	public Jbutton() {
		super("Jbutton");
		setLayout(new FlowLayout());
		
		reg = new JButton("Regular Button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("eiffel-tower-picture.png"));
		Icon x = new ImageIcon(getClass().getResource("1st Motion Picture Unit.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	
	}
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null,String.format("%s", event.getActionCommand()));
		}
	} 
}
