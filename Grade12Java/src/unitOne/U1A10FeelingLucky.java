/*
		 Title: U1A10FeelingLucky.java
		 Programmer: hugo
		 Date of creation: Mar 31, 2015
		 Description: Practicing with the java file IO programs, 
		 	program to make 100 dice rolls, write each to a new line in a file, 
		 	read that file, and count the times a number has appeared
*/



package unitOne;
import java.io.*;

/**
 * @author hugo
 *
 */

public class U1A10FeelingLucky {

	/*
			Programmer: hugo
			Date of creation: Mar 31, 2015
			Parameters: 
			Returns: 		
			Description: 
	*/
	
	public static void main(String[] args) throws IOException{
		String pathIn  = "randOut.txt";
		String pathOut = "randOut.txt";
		final int arrayLen = 100;
		
		PrintWriter fileOut = new PrintWriter(new FileWriter(pathOut));
		for (int i = 0; i < arrayLen; i++){
			fileOut.println(((int) (Math.random() * 6)) + 1);
		}
		fileOut.close();
		
		BufferedReader fileIn = new BufferedReader(new FileReader(pathIn));
		String line;
		int[] diceCount = new int[6];
		do {
			line = fileIn.readLine();
			if (line != null) {

				int value = Integer.parseInt(line);
				diceCount[value - 1] += 1;
			}
		} while(line != null);
		for (int i = 0; i < diceCount.length; i++) {
			System.out.println("The number " + (i + 1) + " rolled " + diceCount[i] + " times.");
		}
		fileIn.close();
	}

}
