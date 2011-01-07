import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextTest extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel mainpanel = new JPanel();
	JTextField first;
	JTextField second;
	JButton submit;
	public TextTest(){
		super("Awesome");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,480);
		
		mainpanel.setLayout(new FlowLayout());
		
		JTextField first = new JTextField(30);
		JTextField second = new JTextField(30);
		JButton submit = new JButton("Submit!");
		mainpanel.add(first);
		mainpanel.add(second);
		mainpanel.add(submit);
		
		add(mainpanel);
		
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals(submit)){
			String text = first.getText();
			second.setText(text);
		}
	}
	public static void main(String[]args){
		new TextTest();
	}
}
