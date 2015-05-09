/*
		 Title: U2Dog.java
		 Programmer: hugo
		 Date of creation: Apr 8, 2015
		 Description: 
 */

package u2Practice;

/**
 * @author hugo
 *@Dongers Poopshartanus
 */
public class U2Dog {
	int hunger = 3;

	String dogBread;
	int age = 6;
	String dogName;
	int aggression = 3;

	public U2Dog(String dongName, String bread, int hungry, int age, int aggro) {
		this.hunger = hungry;
		this.dogName = dongName;
		this.dogBread = bread;
		this.age = age;
		this.aggression = aggro;
	}

	public U2Dog(String dongName, String bread) {
		this.hunger = 0;
		this.dogName = dongName;
		this.dogBread = bread;
		this.age = 0;
		this.aggression = 0;
	}

	public void setHunger(int factor) {
		this.hunger = factor;
	}

	public String getBread() {
		return dogBread;
	}

	public String getName() {
		return dogName;
	}

	public int getAggression() {
		return aggression;
	}

	public int getHunger() {
		return hunger;
	}

	public void barkFrindly() {
		System.out.println("ARf Arf Arf!");
	}

	public void barkAggro() {
		System.out.println("Donger DONGERS DONGERS OH YEAH DONGERS");
	}

	public String toString() {
		return "Name: " + dogName + " Bread: " + dogBread + "\n" + "Aggro: " + aggression + "\n" + "Hunger: " + hunger
				+ " age: " + age + "\n";
	}

	/**
			Programmer: hugo
			Date of creation: Apr 10, 2015
			Parameters: 
			Returns: 		
			Description: 
	*/

	public static void dong() {
		System.out.println("                    ;;; \n 		   ;;;;; \n		  ;;;;;;; \n		   ;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n 		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n	     ;;   ;;;;;;;   ;; \n	    ;;;;;;;;;;;;;;;;;;; \n           ;;;;;;;;;;;;;;;;;;;;; \n           ;;;;;;;;;;;;;;;;;;;;; \n            ;;;;;;;;;;;;;;;;;;; \n              ;;;;       ;;;;");
	}
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: dongers
		 */
	public static void dong2() {
		System.out.println("                    ;;; \n 		   ;;;;; \n		  ;;;;;;; \n		   ;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		 ;;;;;;;;; \n 		  ;;;;;;; \n		 ;;;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n		  ;;;;;;; \n	     ;;   ;;;;;;;   ;; \n	    ;;;;;;;;;;;;;;;;;;; \n           ;;;;;;;;;;;;;;;;;;;;; \n           ;;;;;;;;;;;;;;;;;;;;; \n            ;;;;;;;;;;;;;;;;;;; \n              ;;;;       ;;;;");
	}
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: dongers
		 */
	public static void clear() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}

	}
}
