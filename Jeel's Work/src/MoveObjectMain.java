import javax.swing.*;

public class MoveObjectMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MoveObjectMain() {
		JFrame f = new JFrame();
		MoveObject mo = new MoveObject();
		f.add(mo);
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new MoveObjectMain();

	}

}
