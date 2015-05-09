package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A4WordLength {

	public static void main(String[] args) throws IOException {
		/*
		 Title: Start And End
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output a string n times where n is the length of the string
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		String userIn;
		System.out.println("Enter your string: ");
		userIn = inStream.readLine();
		for (int i = 0; i < userIn.length(); i++){
			System.out.println(userIn);
		}
	}

}
