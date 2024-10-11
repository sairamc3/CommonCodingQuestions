import java.util.*;

/**
 * Print pyramid with number increasing from left to right and then decreasing till the end
 */
public class Pyramid5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows:");

		int rows = scanner.nextInt();

		System.out.println("Printing the pyramid2");

		printPyramid5(rows);
	}

	private static void printPyramid5(int rows) {

		for(int i=1; i<=rows; i++) {

			// the white spaces should increase here 
			// to give space for the decrementing elements
			int whitespaces = (rows - i) * 2;

			printString(whitespaces, " ");

			for(int j=rows-i+1; j<=rows; j++) System.out.print(j + " ");

			for(int k=rows-1; k>=rows-i+1; k--) System.out.print(k + " ");

			System.out.println();
		}
	}

	private static void printString(int count, String pattern) {

		for(int i=0; i<count; i++) System.out.print(pattern);
	}
}
