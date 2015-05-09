/*
		 Title: U2A5ReverseWord.java
		 Programmer: hugo
		 Date of creation: Apr 8, 2015
		 Description: class with methods to reverse letters in a given string
 */

package u2Practice;

/**
 * @author hugo
 *
 */
public class U2A5ReverseWord {

	/**
	 * Static implementation of the reverse word funciton. Reverses a given String word and returns it as a String.
	 */
	public static String reverse(String word) {
		int len = word.length();
		StringBuffer newWord = new StringBuffer("");
		for (int i = (len - 1); i >= 0; i--) {
			newWord.append(word.charAt(i));
		}

		return newWord.toString();
	}

	public U2A5ReverseWord() {
	}

	public String reverseS(String word) {
		int len = word.length();
		StringBuffer newWord = new StringBuffer("");
		for (int i = (len - 1); i >= 0; i--) {
			newWord.append(word.charAt(i));
		}

		return newWord.toString();
	}

}
