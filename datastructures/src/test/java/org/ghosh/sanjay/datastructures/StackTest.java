package org.ghosh.sanjay.datastructures;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

/**
 * Unit test for Stacks.
 * 
 */

public class StackTest {

	private static final Logger LOG = getLogger(lookup().lookupClass());


	/**
	 * Test Stack upto 10 elements
	 */
	@Test
	public void testStack() {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 10; count++) {
			list.add(count);
			stack.push(count);
		}
		Collections.reverse(list);
		for (Integer element : list)
			assertEquals(element, stack.pop(), " Element Not equal ");
	}

	/**
	 * Test a stack that has been popped out and then again pushed in
	 */
	@Test
	public void testStack2() {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 10; count++) {
			list.add(count);
			stack.push(count);
		}
		stack.pop();
		stack.pop();
		list.remove(new Integer(8));
		list.remove(new Integer(9));
		for (int count = 8; count < 29; count++) {
			list.add(count, count);
			stack.push(count);
		}
		Collections.reverse(list);
		for (Integer element : list)
			assertEquals(element, stack.pop(), " Element Not equal ");
	}

	/**
	 * 
	 * Test the stack for large number of elements [ 1 million ]
	 * 
	 */
	@Test
	public void testStack3() {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 1000000; count++) {
			list.add(count);
			stack.push(count);
		}
		Collections.reverse(list);
		for (Integer element : list)
			assertEquals(element, stack.pop(), " Element Not equal ");
	}
}