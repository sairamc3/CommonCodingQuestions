import java.util.*;

/**
 * Print pyramid pattern 3, pyramid of characters
 */
public class Pyramid3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the no of rows of the pyramid:");
		
		int rows = scanner.nextInt();

		scanner.close();

		System.out.println("Printing Pattern1");

		printPattern1(rows);
	}

	private static void printPattern1(int rows) {

		for(int i=1; i<=rows; i++) {

			int whiteSpaces = rows - i;

			printString(whiteSpaces, " ");

			printString(i,  "* ");

			System.out.println("");
		}
	}

	private static void printString(int length, String pattern){

		for(int i=0; i<length; i++) System.out.print(pattern);
	}
}

