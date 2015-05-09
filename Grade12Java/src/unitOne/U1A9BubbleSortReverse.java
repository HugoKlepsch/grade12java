/*
 * Title: U1A9BubbleSortReverse.java 
 * Programmer: hugo 
 * Date of creation: Mar 31, 2015 
 * Description: a basic sort algorithm with auto array generations, sorts array backwards. Includes variable array length
 */

package unitOne;

/**
 * @author hugo
 *
 */
public class U1A9BubbleSortReverse {

	/*
			Programmer: hugo
			Date of creation: Mar 31, 2015
			Parameters: none
			Returns: none (is main)
			Description: main
	*/
	final static int arrayLen = 15000;
	public static void main(String[] args) {
		int[] randoArray = genArray(arrayLen, 1000000);
		boolean keepGoing = false;
		do {
			keepGoing = false;
			for(int i = 1; i < arrayLen; i ++){
				int a = randoArray[i];
				int b = randoArray[i - 1];
				if (a > b){
					int temp = b;
					randoArray[i - 1] = a;
					randoArray[i] = temp;
					keepGoing = true;
				}
				
			}
		} while(keepGoing);
		for (int i = 0; i < arrayLen; i ++){
			System.out.println("Sorted: " + randoArray[i]);
		}

	}
	
	public static int[] genArray(int length, int max){
		int randoArray[] = new int[length];
		for (int i = 0; i < length; i ++){
			randoArray[i] = (int) (Math.random() * max);
		}
		return randoArray;
		
	}

}
