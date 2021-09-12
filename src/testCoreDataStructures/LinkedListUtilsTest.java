package testCoreDataStructures;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import coreDataStructures.LinkedListUtils;

public class LinkedListUtilsTest {

	@Test
	public void testInsertSorted() {
		LinkedList<Integer> actual = new LinkedList<Integer>();
		for (int i = 0; i < 100; i += 10) actual.add(i);
		
		LinkedList<Integer> expected = new LinkedList<Integer>();
		for (int i = 0; i < 50; i += 10) expected.add(i);
		expected.add(45);
		for (int i = 50; i < 100; i += 10) expected.add(i);
		
		LinkedListUtils.insertSorted(actual, 45);
		
		assertEquals("The two list should be equal", expected, actual);
	}

	@Test
	public void testRemoveMaximumValues() {
		LinkedList<String> expected = new LinkedList<String>();
		for (int i = 0; i < 5; i++) {
			expected.add(Integer.toString(i));
		}
		
		LinkedList<String> actual = new LinkedList<String>();
		for (int i = 0, j = 9; i < 10; i++) {
			if (i % 2 == 0) {
				actual.add(Integer.toString(9-j));
			} else {
				actual.add(Integer.toString(j));
				j = 9 - i;
			}
		}
		
		LinkedListUtils.removeMaximumValues(actual, 5);
		assertEquals("The lists should be equal", expected, actual);
		
		LinkedList<String> actual2 = new LinkedList<String>();
		for (int i = 0, j = 9; i < 10; i++) {
			if (i % 2 == 0) {
				actual2.add(Integer.toString(9-j));
				if (9 - j == 5) {
					for (int k = 0; k < 10; k++) {
						actual2.add(Integer.toString(9-j));
					}
				}
			} else {
				actual2.add(Integer.toString(j));
				j = 9 - i;
			}
		}
		
		LinkedListUtils.removeMaximumValues(actual2, 5);
		assertEquals("The lists should be equal", expected, actual2);
	}

	@Test
	public void testContainsSubsequence() {
		fail("Not yet implemented");
	}

}
