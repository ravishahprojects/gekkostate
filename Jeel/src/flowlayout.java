import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class flowlayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public flowlayout() {
		super("The Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		//Left stuff goes here
		lb = new JButton("Left Button");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							layout.setAlignment(FlowLayout.LEFT);
							layout.layoutContainer(container);
						}
				}
		);
		//Left stuff goes here
		cb = new JButton("Center Button");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							layout.setAlignment(FlowLayout.CENTER);
							layout.layoutContainer(container);
						}
				}
		);
		//Right stuff goes here
		rb = new JButton("right Button");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							layout.setAlignment(FlowLayout.RIGHT);
							layout.layoutContainer(container);
						}
				}
		);
		
	}
	
}
