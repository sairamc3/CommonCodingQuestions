import java.util.*;
import java.io.*;

/**
 * Find a string in a text file
 */
public class FindStringInTextFile {

	public static void main(String[] args) {

		String given = "something";

		String filePath = "new.txt";

		boolean doesStringExist = findStringInFile(filePath, given);

		System.out.println("String " + given + " exist in the file new.txt -> " + doesStringExist);

	}

	private static boolean findStringInFile(String filePath, String given) {

		File file = new File(filePath);

		try(Scanner scanner = new Scanner(file);) {

			while(scanner.hasNextLine()) {

				String line = scanner.nextLine();

				if(line.contains(given)) return true;
			}
		} catch(FileNotFoundException ex) {

			System.out.println("FileNotFound");
		}
		return false;
	}
}

