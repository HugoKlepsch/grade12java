/*
		 Title: U2Puppy.java
		 Programmer: hugo
		 Date of creation: Apr 10, 2015
		 Description: 
*/


package u2Practice;

/**
 * @author hugo
 *
 */
public class U2Puppy extends U2Dog{
	
	/**
	 * 
	 * @param puppyName
	 * @param bread
	 */
	public U2Puppy(String puppyName, String bread){
		super(puppyName, bread);
		this.age = (int) (Math.random() * 2) + 1;
	}
}
