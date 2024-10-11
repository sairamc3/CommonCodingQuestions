import java.util.*;
import java.util.stream.*;

/**
 * Write a java program to check if two arrays contain the same elements
 */
public class TwoArrayComparision {

	public static void main(String[] args) {

		int[] i1 = {1,2,3,2,1};
		int[] i2 = {1,2,3};
		int[] i3 = {1,2,3,4};

		System.out.println("i1 -> " + Arrays.toString(i1));
		System.out.println("i2 -> " + Arrays.toString(i2));
		System.out.println("i3 -> " + Arrays.toString(i3));

		System.out.println("comparision between i1 and i2 -> " + sameElements(i1, i2));
		System.out.println("Comparision between i1 and i3 -> " + sameElements(i1, i3));

	}

	private static boolean sameElements(int[] a1, int[] a2) {
	
		//Find the unique elments in the arrays
		//You can do it by creating Set from the arrays
		
		Set<Integer> set1 = new HashSet<>();
		Arrays.stream(a1).forEach(set1::add);

		Set<Integer> set2 = new HashSet<>();
		Arrays.stream(a2).forEach(set2::add);

		if(set1.size() != set2.size()){

			System.out.println("Because size is not same. set1 -> " + set1.size() + ", set2 -> " + set2.size());
			return false;
		}

		for(Integer element: set1) {

			if(! set2.contains(element)){
				System.out.println("Because the element does not exist in set2 - " + element.toString());
				return false;
			}
		}

		return true;
	}
}

