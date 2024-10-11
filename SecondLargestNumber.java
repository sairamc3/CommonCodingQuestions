import java.util.*;

/**
 * Find the second largest number in an array
 */
public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] given = {1, 2, 3, 9, 21, 32, 0, -1, -32};

		System.out.println("Given array -> " + Arrays.toString(given));

		System.out.println("Second Largest Number -> " + secondLargestNumber(given));
	}

	private static int secondLargestNumber(int[] given) {

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for(int num: given) {
			
			if(num > largestNumber){
				secondLargestNumber=largestNumber;
				largestNumber=num;
			}
			else if(num > secondLargestNumber) secondLargestNumber=num;
		}

		return secondLargestNumber;
	}
}

