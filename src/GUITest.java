import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");
		JButton dontPushMe = new JButton("my finger is on button");
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop staring!");	
			}			
		});
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(dontPushMe);
		
		frame.pack();
		
		frame.setVisible(true);

	}

}
