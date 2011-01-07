import java.awt.FlowLayout; 
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class eventlistener extends JFrame {

		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public eventlistener () {
		super("Username&Password confirmation");
		setLayout(new FlowLayout());
		
		item1 = new JTextField("Enter your Username here",10);
		item1.setEditable(true);
		add(item1);
		
		item2 = new JTextField("Enter Display Name here",10);
		item2.setEditable(true);
		add (item2);
		
		item3 = new JTextField("Your Password Here", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("00000");
		add(passwordField);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			
			if(event.getSource()==item1)
					string=String.format("Username: %s",event.getActionCommand());
			else if(event.getSource()==item2)
				string=String.format("Display Name: %s",event.getActionCommand());
			else if(event.getSource()==item3)
				string=String.format("Your Password is: %s",event.getActionCommand());
			else if(event.getSource()==passwordField)
				string=String.format("password is : %s",event.getActionCommand());
			
			JOptionPane.showMessageDialog(null,string );
		}
	}
	
}
