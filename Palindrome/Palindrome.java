import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		String palindrome = "kitik";

		System.out.println("Is " + palindrome + " a palindrome? -> " + isPalindrome(palindrome));
	}

	private static boolean isPalindrome(String given) {

		char[] givenArray = given.toCharArray();

		for(int i=0; i< givenArray.length/2; i++) 

			if(givenArray[i] != givenArray[givenArray.length - 1 - i]) 
				return false;
		
		return true;
	}
}

