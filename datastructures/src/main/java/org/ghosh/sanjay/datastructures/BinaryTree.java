package org.ghosh.sanjay.datastructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * Binary Tree
 *
 **/
public class BinaryTree<T extends Comparable<T>> extends Tree<T> {	
	
	protected BinaryTreeNode<T> root;
	
	public BinaryTree(BinaryTreeNode<T> root) {
		super();
		this.root = root;
	}
	
	public BinaryTreeNode delete(BinaryTreeNode<T> node) {
		if(root == null) return null;
		else {
			return node;
		}
	}
	
	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode<T> search(BinaryTreeNode<T> node) {
		if(root == null) return null;
		else {
			BinaryTreeNode<T> search = null;
			BinaryTreeNode<T> current = root;
			while(search == null && current != null) {
				if(current.isEqualTo(node)) {
					search = current;
				}
				else if(current.isGreaterThan(node)) {
					current = current.getRight();
				}
				else {
					current = current.getLeft();
				}
			}
			return search;	
		}
	}
	
	/**
	 *
	 * Adds a node to the correct part of the tree
	 *
	 **/
	public BinaryTreeNode add(BinaryTreeNode<T> node) {
		if(root == null) root = node;
        else {
			BinaryTreeNode<T> current = root;
			while(current != null) {				
				if(current.isLessThan(node)) {
					if(current.getLeft() == null) {
						current.setLeft(node);
					    break;
					}
					else {
					    current = current.getLeft();
					}
				}				
				if(current.isGreaterThan(node)) {
					if(current.getRight() == null) { 
					    current.setRight(node);
					    break;
					}
					else {
				        current = current.getRight();	
					}
				}
								
			}
		}		
		return root;
	}
	
	
	public BinaryTreeNode<T> getRoot() {
		return root;
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void inOrder(BinaryTreeNode<T> node, List<? super T> list) {
		if(node != null) {
			inOrder(node.getLeft(), list);
			list.add(node.getData());
			inOrder(node.getRight(), list);
		}		
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void inOrder(BinaryTreeNode<T> node) {
		if(node != null) {
			inOrder(node.getLeft());
			System.out.println(node);
			inOrder(node.getRight());
		}		
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void preOrder(BinaryTreeNode<T> node, List<? super T> list) {
		if(node != null) {
			list.add(node.getData());
			preOrder(node.getLeft(), list);			
			preOrder(node.getRight(), list);
		}		
	}

	/**
	 *
	 *
	 *
	 **/
	public void preOrder(BinaryTreeNode<T> node) {
		if(node != null) {
			System.out.println(node);
			preOrder(node.getLeft());			
			preOrder(node.getRight());
		}		
	}
	
	/**
	 *
	 *
	 *
	 **/
	public void postOrder(BinaryTreeNode<T> node, List<? super T> list) {
		if(node != null) {
			postOrder(node.getLeft(), list);			
			postOrder(node.getRight(), list);
			list.add(node.getData());
		}		
	}

	/**
	 *
	 * 
	 *
	 *
	 **/
	public void postOrder(BinaryTreeNode<T> node) {
		if(node != null) {			
			inOrder(node.getLeft());			
			inOrder(node.getRight());
			System.out.println(node);
		}		
	}	
} 