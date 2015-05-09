/*
		 Title: SwingTest.java
		 Programmer: hugo
		 Date of creation: Apr 5, 2015
		 Description: 
*/


package swingTests;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.*;


/**
 * @author hugo
 *
 */
public class SwingTest {
	static JFrame root;
	static Dimension dim;

	/*
			Programmer: hugo
			Date of creation: Apr 5, 2015
			Parameters: 
			Returns: 		
			Description: 
	*/

	public static void main(String[] args) {
		root = new JFrame("dankstorage");
		JLabel label1 = new JLabel("Hey guise");
		JButton butt1 = new JButton("rando location");
		Toolkit tk = Toolkit.getDefaultToolkit();
		dim = tk.getScreenSize();
		
		ButtonHandler onClick = new ButtonHandler();
		butt1.addActionListener(onClick);
		
		root.setSize(400, 400);
		
		root.setLocation(100, 100);
		
		root.setDefaultCloseOperation(root.EXIT_ON_CLOSE);
		
		root.setLayout(new FlowLayout());
		
		root.add(label1);
		
		root.add(butt1);
		
		root.pack();
		
		root.setVisible(true);
		
	}
	
	private static class ButtonHandler implements ActionListener{

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			double paneH = dim.getHeight();
			double paneW = dim.getWidth();
			root.setLocation((int) (Math.random() * paneW), (int) (Math.random() * paneH));
			
		}
		
	}
	
//	@Override
//	public void run(){
//		
//	}

}
