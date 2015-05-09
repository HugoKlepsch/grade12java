package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A5ManyMovieTickets {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 Title: Many Movie tickets
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output price of tickets based on age
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		int userAge;
		do {
			System.out.println("Please enter you age(999 to exit): ");
			userAge = Integer.parseInt(inStream.readLine());
			if (userAge != 999) {
				if (userAge <= 12 && userAge >= 0){
					System.out.println("The cost of the movie is: $6.00");
				} else if (userAge > 12 && userAge < 65){
					System.out.println("The cost of the movie is: $11.00");
				} else if (userAge >= 65 && userAge < 140){
					System.out.println("The cost of the movie is: $8.00");
				} else {
					System.out.println(userAge + " is not a valid age. ");
				}
			}
		} while(userAge != 999);
		System.out.println("Goodbye");
	}

}
