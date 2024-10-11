import java.util.*;

/**
 * Find factorial of the given number
 */
public class Factorial {

	public static void main(String[] args) {

		System.out.println("Factorial for the given number 10 is " + findFactorial(10));

	}

	private static int findFactorial(int given){

		if(given <= 0) return 1;
		
		return given * findFactorial(given-1);
	}
}

