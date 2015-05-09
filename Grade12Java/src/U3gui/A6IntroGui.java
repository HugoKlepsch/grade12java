/*
		 Title: A6IntroGui.java
		 Programmer: hugo
		 Date of creation: Apr 16, 2015
		 Description: 
*/


package U3gui;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * @author hugo
 *
 */
public class A6IntroGui {
	static resizeWindow resizeThread = new resizeWindow(5000);
	public static JFrame root;
	static JPanel mainPanel;
	static JLabel leftLangLable, rightLangLable, leftOutLable, rightOutLable;
	static JButton leftButt, rightButt, swapButt, lolButt;
	static Language french, english, spanish, mandarin, currentLeft, currentRight;
	

	public static void guiMethod(){
		
		french = new Language("French", "Bonjour");
		english = new Language("English", "Hello");
		spanish = new Language("Spanish", "Hola");
		mandarin = new Language("Mandarin", "Ni Hao");
		
		root = new JFrame("Main Window");
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setLocation((1366 / 2), (768 / 2));
		root.setSize(300, 300);
		
		ButtonHandler onCLick = new ButtonHandler();
		
		mainPanel = new JPanel(new GridLayout(0, 2));
		
		currentLeft = english;
		currentRight = french;
		
		leftLangLable = new JLabel(currentLeft.getTitle());
		rightLangLable = new JLabel(currentRight.getTitle());
		
		leftButt = new JButton(english.getTitle());
		leftButt.setActionCommand("leftButt");
		leftButt.addActionListener(onCLick);
		leftButt.setBackground(new Color(0xcc8899));
		rightButt = new JButton(french.getTitle());
		rightButt.setActionCommand("rightButt");
		rightButt.addActionListener(onCLick);
		rightButt.setBackground(new Color(0xcc8899));
		swapButt = new JButton("swap set");
		swapButt.addActionListener(onCLick);
		
		lolButt = new JButton("LOL");
		lolButt.addActionListener(onCLick);
		
		leftOutLable = new JLabel(currentLeft.getText());
		rightOutLable = new JLabel(currentRight.getText());
		
		
		
		
		//Gridding
		
		root.add(mainPanel);
		mainPanel.add(leftLangLable);
		mainPanel.add(rightLangLable);
		mainPanel.add(leftButt);
		mainPanel.add(rightButt);
		mainPanel.add(leftOutLable);
		mainPanel.add(rightOutLable);
		mainPanel.add(swapButt);
		mainPanel.add(lolButt);
		
		root.setVisible(true);
		
		
	}
	
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static void updatelables() {
		leftLangLable.setText(currentLeft.getTitle());
		leftButt.setText(currentLeft.getTitle());
		leftOutLable.setText("");
		rightLangLable.setText(currentRight.getTitle());
		rightButt.setText(currentRight.getTitle());
		rightOutLable.setText("");
	}
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				guiMethod();
				
			}
		});
		
		
	}



	private static class ButtonHandler implements ActionListener{

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == leftButt) {
				leftOutLable.setText(currentLeft.getText());
			} else if (e.getSource() == rightButt) {
				rightOutLable.setText(currentRight.getText());
			} else if (e.getSource() == swapButt) {
				if (currentLeft == english) {
					currentLeft = spanish;
					currentRight = mandarin;
					updatelables();
				} else {
					currentLeft = english;
					currentRight = french;
					updatelables();
				}
			} else if (e.getSource() == lolButt) {
				resizeThread.start();
			}
			
		}
		
	}



}



class Language{
	String title;
	
	/**
	 * @param title
	 * @param text
	 */
	public Language(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}
	String text;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
}

class resizeWindow extends Thread{
	int minX;
	int maxX;
	int minY;
	int maxY;
	int timeMilis;
	int delay = 30;
	Dimension dm;
	public resizeWindow(int milis){
		this.timeMilis = milis;
	}
	
	public void run(){
		dm = new Dimension(A6IntroGui.root.getSize());
		for (int i = 0; i < (timeMilis / delay); i++) {
			
			double dank = (Math.sin(deg2Rad(i))) * 500;
			A6IntroGui.root.setSize((int) (dank + 200), (int) (dank + 200));
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		A6IntroGui.root.setSize(dm);
		dm = null;
	}
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static double deg2Rad(double deg) {
		return deg * 180 / Math.PI;
	}
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static double rad2Deg(double rad) {
		return rad * Math.PI / 180;
	}
}






