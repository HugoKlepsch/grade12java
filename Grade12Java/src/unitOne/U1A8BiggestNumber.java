/*
 * Title: U1A8BiggestNumber.java Programmer: hugo Date of creation: Mar 31, 2015 Description:
 */

package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hugo
 *
 */
public class U1A8BiggestNumber {

	/*
			Programmer: hugo
			Date of creation: Mar 31, 2015
			Parameters: 
			Returns: 		
			Description: 
	*/
	final static int arrayLen = 5;

	public static void main(String[] args) throws IOException {
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); // making input stream reader
																						// object
		double numArray[] = new double[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			String userIn = new String();
			System.out.println("Please enter number #" + (i + 1) + ".");
			userIn = inStream.readLine();
			numArray[i] = Double.parseDouble(userIn);
		}
		double biggest = numArray[0];
		for (int i = 0; i < arrayLen; i++){
			if (biggest < numArray[i]){
				biggest = numArray[i];
			}
		}
		System.out.println("The biggest number in the series is: " + biggest + ". ");
	}

}
