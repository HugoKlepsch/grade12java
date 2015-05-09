package unitOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class U1A7CalcInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Title: Calculate interest compounds 
		 * Programmer: Hugo Klepsch Date of
		 * creation: 2015/03.30 
		 * Description: program to calculate the
		 * accumulated interest compounding monthly the slow but readable way
		 * I could make a formula for compund interest, but I forgot. 
		 */
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); // making input stream reader
																						// object
		DecimalFormat coinage = new DecimalFormat("#0.00"); // as per the online tut, this formats a number to have only
															// two decimal places, and at least one leading zero
		String output;
		double balance, interestRate;
		int deltaMonths = 0;
		System.out.println("Enter balance: ");
		balance = Double.parseDouble(inStream.readLine());
		System.out.println("Enter interest rate: ");
		interestRate = Double.parseDouble(inStream.readLine());
		System.out.println("Enter months to compund: ");
		deltaMonths = Integer.parseInt(inStream.readLine());

		for (int i = 0; i < deltaMonths; i++) {
			balance = compound(balance, interestRate);
		}
		output = coinage.format(balance); //formatting to the aforementione spec
		System.out.println("Final balance is: " + output);
	}

	static double compound(double balance, double interest) {
		return (balance * (interest + 1));
	}

}
