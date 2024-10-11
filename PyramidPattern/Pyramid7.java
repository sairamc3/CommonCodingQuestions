import java.util.*;

/**
 * Print pyramid pattern 1
 */
public class Pyramid7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the no of rows of the pyramid:");
		
		int rows = scanner.nextInt();

		scanner.close();

		System.out.println("Printing Pattern1");

		printPattern1(rows);
	}

	private static void printPattern1(int rows) {

		for(int i=rows; i>=1; i--) {

			int whiteSpaces = rows - i;

			printString(whiteSpaces, " ");

			printString(i, i + " ");

			System.out.println("");
		}
	}

	private static void printString(int length, String pattern){

		for(int i=0; i<length; i++) System.out.print(pattern);
	}
}

