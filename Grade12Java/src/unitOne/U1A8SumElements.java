package unitOne;

public class U1A8SumElements {

	public static void main(String[] args) {
		final int length = 5000;
		/*
		 Title: Sum the elements
		 Programmer: Hugo Klepsch
		 Date of creation: 2015/03.30
		 Description: program to sum each element in an array, each even element, and each odd element
		*/
		int numberArray[] = new int[length];
		for (int i = 1; i <= length; i++){
//			numberArray[i] = (int) (Math.random() * 1000);
			numberArray[i - 1] = i;
		}
		int sum = 0, evenSum = 0, oddSum = 0, tempNum = 0;
		for (int i = 0; i < length; i ++){
			tempNum = numberArray[i];
			sum += tempNum;
			if (tempNum % 2 == 0){
				evenSum += tempNum;
			} else {
				oddSum += tempNum;
			}
		}
		System.out.println("Sum is:      " + sum);
		System.out.println("Even sum is: " + evenSum);
		System.out.println("Odd sum is:  " + oddSum);
	}

}
