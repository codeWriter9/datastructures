package org.ghosh.sanjay.datastructures;

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

	public BinaryTreeNode<T> delete(BinaryTreeNode<T> node) {
		this.root = deleteKey(root, node);
		return root;
	}

	/**
	 *
	 *
	 * 
	 **/
	protected BinaryTreeNode<T> deleteKey(BinaryTreeNode<T> root, BinaryTreeNode<T> node) {
		if (node == null) // if Tree is empty
			return node;
		else {
			/* Otherwise, recur down the tree */
			if (node.getData().compareTo(root.getData()) < 0)
				root.setLeft(deleteKey(root.getLeft(), node));
			else if (node.getData().compareTo(root.getData()) > 0)
				root.setRight(deleteKey(root.getRight(), node));

			// if key is same as root's key, then This is the node
			// to be deleted
			else {
				// node with only one child or no child
				if (root.getLeft() == null)
					return root.getRight();
				else if (root.getRight() == null)
					return root.getLeft();

				// node with two children: Get the inorder successor (smallest
				// in the right subtree)
				root.setData(minimum(root.getRight()).getData());

				// Delete the inorder successor
				root.setRight(deleteKey(root.getRight(), root));
			}

			return root;
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
	@SuppressWarnings("unchecked")
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
					current = current.getLeft();
				} else {
					current = current.getRight();
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
	public BinaryTreeNode<T> add(BinaryTreeNode<T> node) {
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