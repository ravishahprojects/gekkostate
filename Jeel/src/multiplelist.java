import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * import javax.swing.event.*;
 * */

public class multiplelist extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] food = {"apples","oranges","grapes","moreapples"};

	public multiplelist() {
		super("Fruits");
		setLayout (new FlowLayout());
		
		leftlist = new JList(food);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton ("Move -->");
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
		);
		add(movebutton);
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		}
}