package org.ghosh.sanjay.datastructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Binary Tree Node 
 *
 **/
public class BinaryTreeNode<T extends Comparable<T>> {
	
	private T object;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	

	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode(T object) {
		this.object = object;
		this.left = null;
		this.right = null;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode(T object, BinaryTreeNode left, BinaryTreeNode right) {
		this.object = object;
		this.left = left;
		this.right = right;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode getLeft() {
		return this.left;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void setLeft(BinaryTreeNode<T> node) {
		this.left = node;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode getRight() {
		return this.right;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void setRight(BinaryTreeNode<T> node) {
		this.right = node;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public T getData() {
		return this.object;
	}
	
	public boolean isEqualTo(BinaryTreeNode<T> other) {
		if(other == null) return false;
		return this.object.compareTo((T)other.object) == 0;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public boolean isGreaterThan(BinaryTreeNode<T> other) {
		return this.object.compareTo((T)other.object) > 0;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public boolean isLessThan(BinaryTreeNode<T> other) {
		return this.object.compareTo((T)other.object) < 0;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public boolean equals(Object o) {
		if(o instanceof  BinaryTreeNode) return isEqualTo((BinaryTreeNode)o);
		else return false;
	}
	
	/**
	 *
	 *
	 **/
	public String toString() {
		String internal = " [ " + " object: " + object.toString() + " ] ";
		return internal;
	}
}