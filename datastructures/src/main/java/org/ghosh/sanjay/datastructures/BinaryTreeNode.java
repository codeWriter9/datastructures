package org.ghosh.sanjay.datastructures;

/**
 *
 * Binary Tree Node
 *
 **/
public class BinaryTreeNode<T extends Comparable<T>> {

	private T object;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;

	/**
	 *
	 *
	 *
	 **/
	BinaryTreeNode(T object) {
		this.object = object;
		this.left = null;
		this.right = null;
	}

	/**
	 *
	 *
	 *
	 **/
	BinaryTreeNode(T object, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
		this(object);
		this.left = left;
		this.right = right;
	}
	
	/**
	 * 
	 * 
	 * @param object
	 * @param left
	 * @param right
	 * @return BinaryTreeNode<T>
	 */
	public static <T extends Comparable<T>> BinaryTreeNode<T> binaryTreeNode(T object, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
		return new BinaryTreeNode<T>(object, left, right); 
	}

	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode<T> getLeft() {
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
	public BinaryTreeNode<T> getRight() {
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
	 * @return T
	 */
	public T getData() {
		return this.object;
	}
	
	/**
	 * 
	 * 
	 * @param object
	 */
	public void setData(T object) {
		this.object = object;
	}

	/**
	 * 
	 * 
	 * @param other
	 * @return
	 */
	public boolean isEqualTo(BinaryTreeNode<T> other) {
		if (other == null)
			return false;
		return this.object.compareTo((T) other.object) == 0;
	}

	/**
	 *
	 *
	 *
	 **/
	public boolean isGreaterThan(BinaryTreeNode<T> other) {
		return this.object.compareTo((T) other.object) > 0;
	}

	/**
	 *
	 *
	 *
	 **/
	public boolean isLessThan(BinaryTreeNode<T> other) {
		return this.object.compareTo((T) other.object) < 0;
	}
	

	/**
	 *
	 *
	 *
	 **/
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o) {
		if (o instanceof BinaryTreeNode<?>)
			return isEqualTo((BinaryTreeNode<T>) o);
		else
			return false;
	}
	
	/**
	 * 
	 * 
	 */
	@Override
	public int hashCode() {		
		return this.object == null ? 0: this.object.hashCode() * 17 + 31;
	}
	

	/**
	 *
	 *
	 **/
	public String toString() {		
		return " [ " + " object: " + object.toString() + " ] ";
	}
}