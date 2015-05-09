package unitOne;

import java.io.*;

/*
 Title: Assignement selector
 Programmer: Hugo Klepsch
 Created: 2015/03.30
 Description: used to run different assignments
 */
public class Assignments {
	public static void main(String[] args) throws IOException {
		int a = 3;
		int b = 4;
		double avg;
		avg = (double) a /b;
		System.out.println(avg);
//		U1A6DiceGame();
	}

	static void U1A3BankInterest() throws IOException {
		/*
		 Title: Bank Interest
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to calculate accumulated interest on given balance at a given rate over a given number of months
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		String userIn, userName; //init variables used to hold balance, interest rate etc.
		double balance, interestRate, interest;
		int deltaMonths; //number of months that have elapsed
		System.out.println("Please enter your balance: "); //user prompt
		userIn = inStream.readLine(); //reading user input and assigning it to each variable
		balance = Double.parseDouble(userIn);
		System.out.println("Please enter the monthly interest rate (4% as 0.04): ");
		userIn = inStream.readLine();
		interestRate = Double.parseDouble(userIn);
		System.out.println("Please enter the number of months to accrue interest (today is 0 months): ");
		userIn = inStream.readLine();
		deltaMonths = Integer.parseInt(userIn);
		interest = balance * interestRate * deltaMonths;
		System.out.println("Please enter your name: ");
		userIn = inStream.readLine();
		userName = userIn;
		System.out.println(userName + ", you have accrued $" + interest + " over " + deltaMonths
				+ " months, from your original balance of " + balance + ". Your new balance is "
				+ (balance + interest) + "."); //output to user interest and new balance

	}

	static void U1A4StartAndEnd() throws IOException {
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
		for (int i = numberOne; i <= numberTwo; i++) {
			System.out.println(i);
		}

	}

	static void U1A4WordLength() throws IOException {
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
		for (int i = 0; i < userIn.length(); i++) {
			System.out.println(userIn);
		}
	}

	static void U1A5MicrowaveMadness() throws NumberFormatException, IOException {
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
		if (numFood > 0 && numFood <= 3) {
			System.out.println("The number of seconds to cook the item is: " + seconds * ((numFood * 0.5) + 0.5));
		} else {
			System.out.println("Cooking " + numFood
					+ " items is not recomended, but the theoretical time to cook is: " + seconds
					* ((numFood * 0.5) + 0.5));
		}
	}

	static void U1A5ManyMovieTickets() throws NumberFormatException, IOException {
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
				if (userAge <= 12 && userAge >= 0) {
					System.out.println("The cost of the movie is: $6.00");
				} else if (userAge > 12 && userAge < 65) {
					System.out.println("The cost of the movie is: $11.00");
				} else if (userAge >= 65 && userAge < 140) {
					System.out.println("The cost of the movie is: $8.00");
				} else {
					System.out.println(userAge + " is not a valid age. ");
				}
			}
		} while (userAge != 999);
		System.out.println("Goodbye");
	}

	static void U1A6RandomInt() throws IOException {
		/*
		 Title: Random Int
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output ten random integers between 0-10 inclusive or 20-30 inclusive
		*/
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		System.out.println("1 for (0-10), or 2 for (20-30)");
		if (Integer.parseInt(inStream.readLine()) == 1) {
			for (int i = 0; i <= 10; i++) {
				System.out.println((int) (Math.random() * 11));
			}
		} else {
			for (int i = 0; i <= 10; i++) {
				System.out.println((int) (Math.random() * 11) + 20);
			}
		}
	}

	static void U1A6RandomReal() throws IOException {
		/*
		 Title: Random Real
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to output ten random real numbers between 0-10 inclusive or 20-30 inclusive
		*/
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); //making input stream reader object
		System.out.println("1 for (0-10), or 2 for (20-30)");
		if (Integer.parseInt(inStream.readLine()) == 1) {
			for (int i = 0; i <= 10; i++) {
				System.out.println((Math.random() * 10));
			}
		} else {
			for (int i = 0; i <= 10; i++) {
				System.out.println((Math.random() * 10) + 20);
			}
		}
	}

	static void U1A6DiceGame() throws IOException {
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
