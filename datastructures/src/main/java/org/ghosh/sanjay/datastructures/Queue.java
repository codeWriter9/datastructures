package org.ghosh.sanjay.datastructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * Queue
 *
 *
 *
 **/
public class Queue<T> {
	
	private List<T> array;
	private int start;
	private int end;

	/**
	 *
	 * Queue
	 * 
	 ***/
	public Queue() {
		array = new ArrayList<T>();
		start = -1;
		end = -1;
	}
	
	/**
	 * 
	 * Returns the emptiness of the Queue
	 * 
	 * @return boolean : True if the Queue is empty else False
	 */
	public boolean isEmpty() {
		return start > end || start == -1;
	}
	
	/**
	 *
	 * Dequeues The Element in the queue
	 *
	 *
	 *@return T element
	 **/
	public T dequeue() {
		T t = array.get(start++);	
		if(start > end) {
			end = -1;
		}
		return t;
	}
	
	/**
	 *
	 * Enqueues the element in the Queue
	 *
	 *@param T element
	 **/
	public void enqueue(T element) {		
		if(array.size() > end) {
			array.add(++end, element);
		}
		else {
			array.add(element);
			++end;
		}
		if(start == -1) start++;
	}
	
	/**
	 *
	 * Returns the String representation of this Queue
	 *
	 *
	 *@return String
	 *
	 **/
	public String toString() {
		return array.toString();	
	}
}