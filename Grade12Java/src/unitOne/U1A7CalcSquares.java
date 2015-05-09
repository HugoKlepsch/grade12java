package unitOne;


public class U1A7CalcSquares {

	public static void main(String[] args) {
		/*
		 Title: Calculating Squares
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to generate squares of numbers 1-12 inclusive 
		*/
		System.out.println("Squares of number 1-12: ");
		System.out.println("Number     Square");
		for (int number = 1; number <= 12; number++){
			System.out.println(number + "           " + Square(number));
		}
	}
	
	static int Square(int number){
		return number * number;
	}
}
