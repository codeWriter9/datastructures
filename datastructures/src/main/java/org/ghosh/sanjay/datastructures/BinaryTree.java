package org.ghosh.sanjay.datastructures;

import java.util.ArrayList;
import java.util.List;

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

	/**
	 *
	 *
	 * 
	 **/
	public BinaryTreeNode<T> delete(BinaryTreeNode<T> node) {
		if (root == null)
			return null;
		else {
			BinaryTreeNode<T> parent = this.findParent(node);
			if (parent == null) {
				BinaryTreeNode<T> successor = inOrderSuccessor(node, new ArrayList<T>());
				System.out.println(" succesor " + successor);
				// root node case
				if (node.getLeft() != null && node.getRight() != null) {
					// Then it is complicated.

				} else if ((node.getLeft() != null && node.getRight() == null)
						|| (node.getLeft() == null && node.getRight() != null)) {

				}
			} else if (!node.equals(parent.getLeft()) && !node.equals(parent.getRight())) {
				// we did not find the node
				System.out.println(" did not find the node ");
				return null;
			} else {
				BinaryTreeNode<T> actual = node.equals(parent.getLeft()) ? parent.getLeft() : parent.getRight();
				boolean isLeft = node.equals(parent.getLeft()) ? true : false;
				if (actual.getLeft() == null && actual.getRight() == null) {
					if (isLeft) {
						parent.setLeft(null);
					} else {
						parent.setRight(null);
					}
				}
				if ((actual.getLeft() != null && actual.getRight() == null)
						|| (actual.getLeft() == null && actual.getRight() != null)) {
					if (isLeft && actual.getLeft() != null) {
						parent.setLeft(actual.getLeft());
					} else if (isLeft && actual.getRight() != null) {
						parent.setLeft(actual.getRight());
					} else if (!isLeft && actual.getLeft() != null) {
						parent.setRight(actual.getLeft());
					} else if (!isLeft && actual.getRight() != null) {
						parent.setRight(actual.getRight());
					}
				}
				if (actual.getLeft() != null && actual.getRight() != null) {
					// Then it is complicated.
				}
			}
			return node;
		}
	}

	/**
	 *
	 * Returns the parent of a node
	 *
	 **/
	public BinaryTreeNode<T> findParent(BinaryTreeNode<T> node) {
		if (root == null)
			return null;
		else {
			BinaryTreeNode<T> search = null;
			BinaryTreeNode<T> current = root;
			BinaryTreeNode<T> saved = null;
			while (search == null && current != null) {
				if (current.isEqualTo(node)) {
					break;
				} else if (node.isGreaterThan(current)) {
					saved = current;
					current = current.getRight();
				} else if (node.isLessThan(current)) {
					saved = current;
					current = current.getLeft();
				}
			}
			return saved;
		}
	}

	/**
	 *
	 *
	 *
	 **/
	public BinaryTreeNode<T> search(BinaryTreeNode<T> node) {
		if (root == null)
			return null;
		else {
			BinaryTreeNode<T> search = null;
			BinaryTreeNode<T> current = root;
			while (search == null && current != null) {
				if (current.isEqualTo(node)) {
					search = current;
				} else if (current.isGreaterThan(node)) {
					current = current.getRight();
				} else {
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
		if (root == null)
			root = node;
		else {
			BinaryTreeNode<T> current = root;
			while (current != null) {
				if (node.isLessThan(current)) {
					if (current.getLeft() == null) {
						current.setLeft(node);
						break;
					} else {
						current = current.getLeft();
					}
				}
				if (node.isGreaterThan(current)) {
					if (current.getRight() == null) {
						current.setRight(node);
						break;
					} else {
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
	 *
	 **/
	public BinaryTreeNode<T> minimum(BinaryTreeNode<T> node) {
		if (node.getLeft() == null)
			return node;
		else
			return minimum(node.getLeft());
	}

	/**
	 *
	 *
	 *
	 *
	 **/
	public BinaryTreeNode<T> maximum(BinaryTreeNode<T> node) {
		if (node.getRight() == null)
			return node;
		else
			return maximum(node.getRight());
	}

	/**
	 *
	 *
	 *
	 *
	 **/
	public BinaryTreeNode<T> inOrderSuccessor(BinaryTreeNode<T> node, List<? super T> list) {
		if (node != null) {
			inOrder(getRoot(), list);
			int index = list.indexOf(node.getData());
			return index + 1 < list.size() ? new BinaryTreeNode<T>((T) list.get(index + 1)) : null;
		} else
			return null;
	}

	/**
	 *
	 *
	 *
	 **/
	public void inOrder(BinaryTreeNode<T> node, List<? super T> list) {
		if (node != null) {
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
		if (node != null) {
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
		if (node != null) {
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
		if (node != null) {
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
		if (node != null) {
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
		if (node != null) {
			inOrder(node.getLeft());
			inOrder(node.getRight());
			System.out.println(node);
		}
	}
}