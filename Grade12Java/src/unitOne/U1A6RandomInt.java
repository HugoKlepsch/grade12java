package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A6RandomInt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 Title: Random Int
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output ten random integers between 0-10 inclusive or 20-30 inclusive
		*/
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		System.out.println("1 for (0-10), or 2 for (20-30)");
		if(Integer.parseInt(inStream.readLine()) == 1){
			for (int i = 0; i <= 10; i++){
				System.out.println((int) (Math.random() * 11));
			}
		} else {
			for (int i = 0; i <= 10; i++){
				System.out.println((int) (Math.random() * 11) + 20);
			}
		}
	}

}
