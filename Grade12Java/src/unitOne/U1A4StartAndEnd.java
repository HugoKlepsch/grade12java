package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A4StartAndEnd {

	public static void main(String[] args) throws IOException {
		/*
		 Title: Start And End
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output all integers inclusive between two numbers
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		String userIn;
		int numberOne, numberTwo;
		System.out.print("enter Start: ");
		userIn = inStream.readLine();
		numberOne = Integer.parseInt(userIn);
		System.out.print("enter End: ");
		userIn = inStream.readLine();
		numberTwo = Integer.parseInt(userIn);
		for (int i = numberOne; i <= numberTwo; i++){
			System.out.println(i);
		}
	}

}
