package numericarrays;

import java.util.Scanner;

public class EvenOddCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter count of numbers : ");
		int count = input.nextInt();
		Integer[] inputArray = new Integer[count];
		System.out.println("Please enter numbers now , ");
		for(int i=1 ; i<=count ; i++) {
			inputArray[i-1]=input.nextInt();
		}
		int evenCount = countEvenNumbers(inputArray);
		int oddCount = count - evenCount;
		input.close();
		System.out.println("Even Numbers : "+evenCount);
		System.out.println("Odd Numbers : "+oddCount);
	}
	
	public static Integer countEvenNumbers(Integer[] inputArray) {
		int evenCount = 0 ;
		for(Integer number:inputArray) {
			if(number % 2 ==0 ) {
				++evenCount;
			}
		}
		return evenCount;
	}

}
