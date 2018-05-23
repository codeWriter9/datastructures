package org.ghosh.sanjay.datastructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class Stack<T> {
	
	private List<T> array;
	private int top;
	
	public Stack() {
		top = -1;
		array = new ArrayList<T>(0);
	}
	
	/**
	 *
	 *
	 *
	 **/
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	/**
	 *
	 *
	 *
	 **/
	public T pop() {
		return array.get(top--);
	}
	
	/**
	 *
	 *
	 *
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
	 *
	 **/
	public String toString() {
		return array.toString();	
	}
}