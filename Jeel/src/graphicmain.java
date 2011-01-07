import javax.swing.*;
public class graphicmain {
	public static void main(String[]args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphic go = new graphic();
		f.add(go);
		f.setSize(400,500);
		f.setVisible(true);
		
	}
}
