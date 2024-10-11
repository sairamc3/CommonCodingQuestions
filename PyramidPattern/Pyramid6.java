import java.util.*;

/**
 * Print pyramid pattern 3, pyramid of characters
 */
public class Pyramid6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the no of rows of the pyramid:");
		
		int rows = scanner.nextInt();

		scanner.close();

		System.out.println("Printing Pattern1");

		printPattern6(rows);
	}

	private static void printPattern6(int rows) {

		for(int i=rows; i>=1; i--) {

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

