package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1A3BankInterest {

	public static void main(String[] args) throws IOException {
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
		System.out.println(userName + ", you have accrued $" + interest + " over " + deltaMonths + " months, from your original balance of " + balance + ". Your new balance is " + (balance + interest) + "."); //output to user interest and new balance
		
	}

}
