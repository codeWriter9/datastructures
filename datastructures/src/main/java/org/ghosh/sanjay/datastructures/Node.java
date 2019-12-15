package org.ghosh.sanjay.datastructures;

/**
 *
 * Node
 *
 **/
public class Node<T> {
	T object;
	Node next;

	/**
	 *
	 *
	 *
	 **/
	public Node(T object) {
		this.object = object;
		this.next = null;
	}

	/**
	 *
	 *
	 *
	 **/
	public Node(T object, Node next) {
		this.object = object;
		this.next = next;
	}

	/**
	 *
	 *
	 *
	 **/
	public Node getNext() {
		return this.next;
	}

	/**
	 *
	 *
	 *
	 **/
	public T getData() {
		return this.object;
	}
}