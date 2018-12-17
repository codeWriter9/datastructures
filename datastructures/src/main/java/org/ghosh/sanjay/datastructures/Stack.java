package org.ghosh.sanjay.datastructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * 
 * Generic implementation of Stack
 * 
 * @author Sanjay Ghosh
 *
 * @param <T>
 */
public class Stack<T> {
	
	private List<T> array;
	private int top;
	
	/**
	 * 
	 * public constructor
	 * 
	 */
	public Stack() {
		top = -1;
		array = new ArrayList<T>(0);
	}
	
	/**
	 *
	 * Checks the empty-ness of the Stack
	 *
	 * @return boolean : true if Stack is empty else returns false
	 **/
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	/**
	 *
	 * Returns the element at the top of the stack.
	 * 
	 *@return T element
	 **/
	public T pop() {
		return array.get(top--);
	}
	
	/**
	 *
	 *
	 * This pushes the element to the top of the Stack
	 *
	 *@param T element to be pushed
	 **/
	public void push(T element) {
		if(array.size() > top) {
			array.add(++top, element);
		}
		else {
			array.add(element);
		    top++;
		}
		
	}	
	
	
	/**
	 * 
	 * Returns the String representation of this stack
	 * 
	 * @return String
	 */
	public String toString() {
		return array.toString();	
	}
}