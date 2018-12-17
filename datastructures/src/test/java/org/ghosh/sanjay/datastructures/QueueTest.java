package org.ghosh.sanjay.datastructures;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Queue.
 */
public class QueueTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public QueueTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(QueueTest.class);
	}

	/**
	 * 
	 * Basic test to check if it can handle upto 10 elements
	 * 
	 */
	public void testQueue() {
		Queue<Integer> queue = new Queue<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 10; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		for (Integer element : list)
			assertTrue(element.equals(queue.dequeue()));
	}

	/**
	 * 
	 * Basic test to check if it can handle upto 100 elements
	 * 
	 */
	public void testQueue2() {
		Queue<Integer> queue = new Queue<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 10; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		queue.dequeue();
		queue.dequeue();
		list.remove(new Integer(0));
		list.remove(new Integer(1));
		for (int count = 11; count < 100; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		for (Integer element : list)
			assertTrue(element.equals(queue.dequeue()));
	}

	/**
	 * 
	 * Basic test to check if it can handle upto 1 M elements
	 * 
	 */
	public void testQueue3() {
		Queue<Integer> queue = new Queue<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 1000000; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		for (Integer element : list)
			assertTrue(element.equals(queue.dequeue()));
	}
}