import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
 * 
 * 
 * */
public class GUIWJFRAME extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel item1;
	
	public GUIWJFRAME() {
		super ("The title bar");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,100);
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is going to show up on hover");
		add(item1);
		
	}
	public static void main(String[]args){
		new GUIWJFRAME();
	}
}
