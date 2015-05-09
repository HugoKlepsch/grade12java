package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A6DiceGame {

	public static void main(String[] args) throws IOException {
		/*
		 Title: Dice Game
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program repeatedly generate a number between 1-6 inclusive and then repeatedly try and "guess" that number
		*/
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		System.out.println("Welcome to dice game. ");
		String userIn = null;
		do {
			int targetNum;
			int count = 0;
			targetNum = (int) ((Math.random() * 6) + 1);
			System.out.println("Target number is: " + targetNum);
			int guessNum;
			do {
				guessNum = (int) ((Math.random() * 6) + 1);
				++count;
				System.out.println("Computer guessed: " + guessNum);
			} while (guessNum != targetNum);
			System.out.println("The computer took " + count + " tries to guess correctly. ");
			System.out.println("Go again? ");
			userIn = inStream.readLine();			
		} while (userIn.equalsIgnoreCase("y"));
	}

}
