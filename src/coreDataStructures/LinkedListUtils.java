package coreDataStructures;


import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {
	
	public static void insertSorted(LinkedList<Integer> list, int value) {

		/* IMPLEMENT THIS METHOD! */
		if (list == null) return;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > value) {
				list.add(i, value);
				break;
			}
		}

	}
	

	public static void removeMaximumValues(LinkedList<String> list, int N) {

		/* IMPLEMENT THIS METHOD! */
		list.sort(null);
		int i = 0;
		while (i < N - 1) {
			list.removeLast();
			i++;
		}
		
		String value = list.removeLast();
		
		while (list.peekLast().compareTo(value) == 0) list.removeLast();
	}
	
	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		/* IMPLEMENT THIS METHOD! */
		
		return true; // this line is here only so this code will compile if you don't modify it
	}
}
