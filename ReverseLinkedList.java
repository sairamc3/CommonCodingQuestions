import java.util.*;

/**
 * Reverse a linked list in java
 */
public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> given = new LinkedList<>();
		given.add(1);
		given.add(2);
		given.add(3);

		System.out.println("The given Linked List is " + given);

		LinkedList<Integer> reversed = new LinkedList<>();

		given.descendingIterator().forEachRemaining(reversed::add);


		System.out.println("The Reversed Linked List is " + reversed);
	}
}
