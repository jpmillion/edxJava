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
		fail("Not yet implemented");
	}

	@Test
	public void testContainsSubsequence() {
		fail("Not yet implemented");
	}

}
