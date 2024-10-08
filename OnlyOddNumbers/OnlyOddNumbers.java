import java.util.*;
import java.util.stream.*;

public class OnlyOddNumbers {

	public static void main(String[] args) {

		List<Integer> mixedNumbers = Arrays.asList(1,2,3,4,5);
		List<Integer> oddNumbers = Arrays.asList(1,3,5,7);

		System.out.println("MixedNumbers ->" + areOnlyOddNumbers(mixedNumbers));
		System.out.println("OddNumbers ->" + areOnlyOddNumbers(oddNumbers));
	}

	private static boolean areOnlyOddNumbers(List<Integer> numbers) {

		return ! numbers.parallelStream()
			.anyMatch(number -> number % 2 == 0);
	}
}
