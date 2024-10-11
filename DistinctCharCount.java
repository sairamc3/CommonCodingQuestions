import java.util.*;

public class DistinctCharCount {

	public static void main(String[] args) {

		String given = "asdf;lhmnopqljsdynasljdmlafhla;adh";

		System.out.println("Given String is -> " + given);

		System.out.println(findDistinctCharCount(given));
	}

	private static Map<Character, Integer> findDistinctCharCount(String given) {

		Map<Character, Integer> distinctChar = new HashMap<>();

		char[] characters = given.toCharArray();

		for(char c: characters) {

			if(distinctChar.containsKey(c)) 
				distinctChar.put(c, distinctChar.get(c) + 1);
			else distinctChar.put(c, 1);
		}
		return distinctChar;
	}
}
