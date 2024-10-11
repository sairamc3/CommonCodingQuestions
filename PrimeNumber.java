import java.util.*;

/**
 * Write a program to check if the given number is a prime
 * or not
 */
public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(" is 17 prime? -> " + isPrime(17));
		System.out.println(" is 32 prime? -> " + isPrime(32));
		System.out.println(" is 17 prime with efficient method? -> " + isPrimeEfficientWay(17));
		System.out.println(" is 32 prime with efficient method? -> " + isPrimeEfficientWay(32));
	}

	/**
	 * This is regular way of implementing the solution for finding
	 * if a given number is prime.
	 *
	 * A prime number is the one which is divisible by 1 and it's own.
	 */
	private static boolean isPrime(int given) {

		// 0 and 1 are not prime numbers
		if(given == 0 || given ==1) return false;

		// 2 is a prime number
		if(given == 2) return true;

		// Iterate through the numbers, 
		// starting from 2 until the half of the given number
		// find if it is divisible by any of those numbers.  
		for(int i=2; i<=given/2; i++) {
			if(given % i == 0) return false;
		}

		return true;
	}

	/**
	 * Efficient way
	 * Instead of validating using each element we can narrow down the no of calculations.
	 * 1. we can check if the number is divisible by 2 or 3
	 * 2. Then we need not check for the multiples of both 2 or 3. Like 4,6,8,9,10,12...
	 * Those are all the multiples of either 2 or 3
	 * There are some other elements that we need to check with are not the multiples of 2 or 3
	 * Ex: 5,7,11,13,17,19,23,25,29,31,35,37,41,43..
	 * The common pattern here is 6k+-1
	 * So if we validate these numbers until the square root of the given number
	 * that would save lot of computation
	 */
	private static boolean isPrimeEfficientWay(int given) {

		//0 and 1 are not prime
		if(given <= 0) return false;

		// 2 and 3 are prime numbers
		if(given == 2 || given == 3) return true;

		// check the combination if the given number is 
		// divisible by 2 and 3 
		if(given % 2 == 0 || given % 3 == 0) return false;

		// Since we have covered the cases of multiples of 2 and 3 
		// we need to start from 5, since 4 is already a multiple of 2
		// Now it will not increment by 1
		// it will increment by the formula of 6k+-1
		// Ex: 5,7,11,13,17,19
		for(int i=5; i*i <= given; i+=6) {
			if(given % i ==0 || given % (i+2) == 0) return false;
		}
		return true;
	}
}
