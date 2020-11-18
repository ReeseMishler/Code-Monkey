import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	public static void main(String[] args) {
		// so far, all of our programs were sequential
		// and they reached the END - finito, " long silence" - jk
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null); //Nothing it will be relative to
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");
		
		

	}

}
