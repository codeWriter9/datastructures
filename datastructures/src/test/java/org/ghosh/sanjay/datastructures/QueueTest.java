package org.ghosh.sanjay.datastructures;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;


/**
 * Unit test for Queue.
 */
@RunWith(JUnit4.class)
public class QueueTest {

	private static final Logger LOG = getLogger(lookup().lookupClass());	

	/**
	 * 
	 * Basic test to check if it can handle upto 10 elements
	 * 
	 */
	@Test
	public void testQueue() {
		Queue<Integer> queue = new Queue<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 10; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		for (Integer element : list)
			assertEquals(element, queue.dequeue());
	}

	/**
	 * 
	 * Basic test to check if it can handle upto 100 elements
	 * 
	 */
	@Test
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
			assertEquals(element, queue.dequeue());
	}

	/**
	 * 
	 * Basic test to check if it can handle upto 1 M elements
	 * 
	 */
	@Test
	public void testQueue3() {
		Queue<Integer> queue = new Queue<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int count = 0; count < 1000000; count++) {
			list.add(count);
			queue.enqueue(count);
		}
		for (Integer element : list)
			assertEquals(element, queue.dequeue());
	}
}