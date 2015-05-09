package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A5MicrowaveMadness {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 Title: Microwave Madness
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output time required for different numbers of food items
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		int numFood, seconds;
		System.out.println("Enter the number of food items: ");
		numFood = Integer.parseInt(inStream.readLine());
		System.out.println("Enter the number of seconds to cook one item: ");
		seconds = Integer.parseInt(inStream.readLine());
		if(numFood > 0 && numFood <= 3){
			System.out.println("The number of seconds to cook the item is: " + seconds * ((numFood * 0.5) + 0.5));
		} else {
			System.out.println("Cooking " + numFood + " items is not recomended, but the theoretical time to cook is: " + seconds * ((numFood * 0.5) + 0.5));
		}
	}

}
