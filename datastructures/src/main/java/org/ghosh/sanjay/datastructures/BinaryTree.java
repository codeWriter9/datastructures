package org.ghosh.sanjay.datastructures;

import static java.lang.Math.max;
import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;

/**
 *
 * Binary Tree
 *
 **/
public class BinaryTree<T extends Comparable<T>> extends Tree<T> {
	
	private static final Logger LOG = getLogger(lookup().lookupClass());

	protected BinaryTreeNode<T> root;

	/**
	 * 
	 * 
	 * 
	 * @param root
	 */
	public BinaryTree(BinaryTreeNode<T> root) {
		super();
		this.root = root;
	}

	/**
	 * 
	 * 
	 * @param node
	 * @return BinaryTreeNode<T>
	 */
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
		if (root == null) // if Tree is empty
			return root;
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

	/**
	 * 
	 * 
	 * @return
	 */
	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	/**
	 * 
	 * 
	 * 
	 * @param node
	 * @return
	 */
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
	 * @param node
	 * @return
	 */
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
	 * @param node
	 * @param list
	 * @return
	 */
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
	 * @param list
	 */
	public void levelOrder(List<? super T> list) {
		if (getRoot() == null) {
			return;
		}
		int h = height(getRoot());
		for (int level = 0; level < h; level++) {
			printLevel(getRoot(), level, list);
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param node
	 * @param level
	 * @param list
	 */	
	private void printLevel(BinaryTreeNode<T> node, int level, List<? super T> list) {		
		if (node == null)
			return;
		else if (level == 0)
			list.add(node.getData());
		else {
			printLevel(node.getLeft(), level - 1, list);			
			printLevel(node.getRight(), level - 1, list);
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param node
	 * @param list
	 */
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
	 * @param node
	 */
	public void inOrder(BinaryTreeNode<T> node) {
		if (node != null) {
			inOrder(node.getLeft());
			LOG.info(node.toString());
			inOrder(node.getRight());
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param node
	 * @param list
	 */
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
	 * @param node
	 */
	public void preOrder(BinaryTreeNode<T> node) {
		if (node != null) {
			LOG.info(node.toString());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param node
	 * @param list
	 */
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
	 * @param node
	 */
	public void postOrder(BinaryTreeNode<T> node) {
		if (node != null) {
			inOrder(node.getLeft());
			inOrder(node.getRight());
			LOG.info(node.toString());
		}
	}

	/**
	 * 
	 * 
	 * @param node
	 * @return
	 */
	public int height(BinaryTreeNode<T> node) {
		if (node != null) {
			int left = height(node.getLeft());
			int right = height(node.getRight());
			return max(left, right) + 1;
		} else
			return 0;
	}
}