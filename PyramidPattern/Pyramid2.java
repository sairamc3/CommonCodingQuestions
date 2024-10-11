import java.util.*;

/**
 * Print pyramid with number increasing from left to right
 */
public class Pyramid2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows:");

		int rows = scanner.nextInt();

		System.out.println("Printing the pyramid2");

		printPyramid2(rows);
	}

	private static void printPyramid2(int rows) {

		for(int i=1; i<=rows; i++) {

			int whitespaces = rows - i;

			printString(whitespaces, " ");

			for(int j=1; j<=i; j++) System.out.print(j + " ");

			System.out.println();
		}
	}

	private static void printString(int count, String pattern) {

		for(int i=0; i<count; i++) System.out.print(pattern);
	}
}
