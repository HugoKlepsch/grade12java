/*
		 Title: U2PracticeMain.java
		 Programmer: hugo
		 Date of creation: Apr 8, 2015
		 Description: 
*/


package u2Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * @author hugo
 *
 */
public class U2PracticeMain {

	static JLabel label;
	static JButton btnClick;
	/*
			Programmer: hugo
			Date of creation: Apr 8, 2015
			Parameters: 
			Returns: 		
			Description: 
	*/

	public static void guiApp(){
		JFrame frame = new JFrame("simple window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		label = new JLabel("Text me!");
		btnClick = new JButton("example button");
		
		
		ButtonHandler onCLick = new ButtonHandler();
		btnClick.addActionListener(onCLick);
		
		panel1.add(btnClick);
		panel1.add(label);
		
		frame.add(panel1);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}
	
	private static class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			label.setText(e.toString());
		}
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				guiApp();
			}
		});
	}

}
