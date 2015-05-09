/*
		 Title: GenMarks.java
		 Programmer: hugo
		 Date of creation: Apr 2, 2015
		 Description: 
*/

package u1culminatingTask;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author hugo
 *
 */
public class GenMarks {

	public static void genMarks(int numStudents, String pathOut) throws IOException {
		PrintWriter fileout = new PrintWriter(new FileWriter(pathOut)); // constructing the object used to write out the
		// marks
		for (int i = 0; i < numStudents; i++) { // generate a mark for each student
			fileout.println(((int) (Math.random() * 60)) + 40); // generate a random number and write it to a new line
			// in the file
		}
		fileout.close(); // once we're done writing, we tell the os that we're done with the file.
	}
}
