import java.util.*;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String given = "somt  thing not working is working something";

		System.out.println("Given String -> " + given);
		System.out.println("Output after removing whitespaces -> " + removeWhiteSpaces(given));
	}

	private static String removeWhiteSpaces(String given){

		StringBuilder output = new StringBuilder();

		char[] givenChar = given.toCharArray();

		for(char c: givenChar) {

			if(!Character.isWhitespace(c)) output.append(c);
		}
		return output.toString();
	}
}

