/*
		 Title: U1A11CulminatingTask.java
		 Programmer: hugo
		 Date of creation: Apr 1, 2015
		 Description: Program to generate 25 random marks between 40 and 100%
		 	The list will be written to disk. 
		 	The data will then be read from disk, sorted using bubblesort, 
		 	then output to stdout in order H->L. 
		 	The median and mean will also be calculated and output. 
*/

package u1culminatingTask;

import java.io.IOException;

public class U1A11CulminatingTask {

	/*
			Programmer: hugo
			Date of creation: Apr 1, 2015
			Parameters: string args - not used
			Returns: void - it is main
			Description: Used to execute the functions of the program
	*/

	public static void main(String[] args) throws IOException {
		String pathIn = "marks.txts"; // path of file to read
		String pathOut = "marks.txts"; // path of file to write
		final int numStudents = 25; // number of students to generate marks

		GenMarks.genMarks(numStudents, pathOut);

		int[] marksArray = new int[numStudents];
		readParse marksReader = new readParse(marksArray);
		marksArray = marksReader.readMarks(numStudents, pathIn);
		int count = marksReader.getCount();

		marksArray = bubbleSort(marksArray); // sort using a bubblesort method, returns back to the same
												// memory location.

		int sum = 0; // used later to calculate mean

		System.out.println("Student Marks: "); // start outputting data
		for (int i = 0; i < count; i++) {
			int value = marksArray[i];
			sum += value; // add it to the sum to be used later to calculate mean

			System.out.println(value);  // output each marks in decending order.
		}
		printAverages(sum, count, marksArray);

	}

	public static double calcMean(int sum, int numStudents) {
		return sum / numStudents;
	}

	public static double calcMedian(int[] markArray, int count) {
		if (count % 2 == 0) {
			return ((markArray[(count / 2)] + markArray[(count / 2) - 1]) / 2);
		} else {
			return markArray[count / 2];
		}
	}

	public static int[] bubbleSort(int[] markArray) { // function to sort a give integer array using bubblesort
		/*
		Programmer: hugo
		Date of creation: Apr 1, 2015
		Parameters: the integer array to sort
		Returns: the sorted int[] array. 
		Description: Used to sort the integer array in a simple manner. Bubble is often quicker in small sample sets. 
		 */// technique
		boolean keepGoing = false; // by default assume it's sorted
		int arrayLen = markArray.length; // if we store the length here, it doesn't need to be accessed every time the
											// for loop runs
		do {
			keepGoing = false; // default it to think it's sorted
			for (int i = 1; i < arrayLen; i++) { // start at one so that you don't access index (zero - one)
				int a = markArray[i]; // values to compare against each other. index i vs the index previous
				int b = markArray[i - 1];
				if (a > b) { // if it's not sorted (should be descending order
					int temp = b; // swap the variables
					markArray[i - 1] = a;
					markArray[i] = temp;
					keepGoing = true; // make it run it again
				}
			}
		} while (keepGoing); // do while becuase slightly less conditional checks, therefore more efficient. I never
								// used do while loops before yesterday, but now I realise that they're great!
		return markArray; // once it's sorted, return the array back to the whatever called it.
	}

	public static void printAverages(int sum, int numStudents, int[] marksArray) {
		double median; // init variables
		double mean = 0; // holds the aforementioned mean
		mean = calcMean(sum, numStudents);
		median = calcMedian(marksArray, numStudents);
		System.out.println("Mean mark: " + mean); // output both of them
		System.out.println("Median mark: " + median);
	}
}
