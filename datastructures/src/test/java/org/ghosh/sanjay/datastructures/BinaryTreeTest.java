package org.ghosh.sanjay.datastructures;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

/**
 * Unit test for simple App.
 */

public class BinaryTreeTest {

	private static final Logger LOG = getLogger(lookup().lookupClass());

	/**
	 *
	 * Test Tree upto 10 elements
	 * 
	 */
	@Test
	public void testInsertTree() {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		tree.preOrder(root, otherList);
		assertEquals(otherList, list);
	}

	/**
	 * 
	 * Check that level order performs correctly
	 * 
	 */
	@Test
	public void testLevelOrder() {
		BinaryTree<Integer> tree = createBST();
		List<Integer> order = new LinkedList<>();
		LOG.info("------LEVEL---ORDER------------------------");
		tree.levelOrder(order);
		LOG.info(order.toString());
		assertEquals(Arrays.asList(new Integer[] { 5, 0, 6, 1, 7, 2, 8, 3, 9, 4 }), order);
		LOG.info("-----------------------------------------");
	}

	/**
	 * 
	 * Check that In order and pre order and post order performs correctly
	 * 
	 */
	@Test
	public void testInOrderAndPreOrderAndPostOrder() {		
		BinaryTree<Integer> tree = createBST();
		LOG.info("------PRE---ORDER------------------------");
		tree.preOrder(tree.getRoot());
		LOG.info("------POST--ORDER------------------------");
		tree.postOrder(tree.getRoot());
		LOG.info("-------IN---ORDER------------------------");
		tree.inOrder(tree.getRoot());
		LOG.info("-----------------------------------------");
	}

	/**
	 *
	 * Test Tree upto 10 elements
	 * 
	 */
	@Test
	public void testInsertTreeAndTreeTraversal() {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> preOrderList = new ArrayList<Integer>();
		List<Integer> inOrderList = new ArrayList<Integer>();
		List<Integer> postOrderList = new ArrayList<Integer>();

		List<Integer> checkList1 = Arrays.asList(new Integer[] { 5, 0, 1, 2, 3, 4, 6, 7, 8, 9 });
		List<Integer> checkList2 = Arrays.asList(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		List<Integer> checkList3 = Arrays.asList(new Integer[] { 4, 3, 2, 1, 0, 9, 8, 7, 6, 5 });

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for (int count = 0; count < 10; count++) {
			if (count != 5) {
				tree.add(new BinaryTreeNode<Integer>(count));
				list.add(count);
			}
		}
		tree.preOrder(root, preOrderList);
		tree.inOrder(root, inOrderList);
		tree.postOrder(root, postOrderList);
		assertEquals(preOrderList, checkList1);
		assertEquals(inOrderList, checkList2);
		assertEquals(postOrderList, checkList3);
	}

	/**
	 *
	 * Search the Tree for a particular node.
	 *
	 * 
	 */
	@Test
	public void testSearchTree() {
		List<Integer> list = new ArrayList<Integer>();		
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.search(new BinaryTreeNode<Integer>(0)), new BinaryTreeNode<Integer>(0));
		assertEquals(tree.search(new BinaryTreeNode<Integer>(9)), new BinaryTreeNode<Integer>(9));
	}

	/**
	 *
	 * Search the Tree for a Null node.
	 *
	 * 
	 */
	@Test
	public void testSearchNullTree() {
		BinaryTreeNode<Integer> root = null;
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		assertEquals(tree.search(new BinaryTreeNode<Integer>(null)), null);
	}

	/**
	 *
	 * Delete a node and check out the tree by traversal
	 *
	 * 
	 */
	@Test
	public void testLeftTreeDeleteNode() {
		List<Integer> list = new ArrayList<Integer>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		LOG.info("-----------------------------------------");
		LOG.info(" delete (0) node ");
		tree.delete(new BinaryTreeNode<Integer>(0));
		LOG.info("-----------------------------------------");
		tree.inOrder(root);
		LOG.info("-----------------------------------------");
	}

	/**
	 *
	 * Delete a node and check out the tree by traversal
	 *
	 * 
	 */
	@Test
	public void testRightTreeDeleteNode() {
		List<Integer> list = new ArrayList<Integer>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		LOG.info("-----------------------------------------");
		LOG.info(" delete (9) node ");
		tree.delete(new BinaryTreeNode<Integer>(9));
		LOG.info("-----------------------------------------");
		tree.inOrder(root);
		LOG.info("-----------------------------------------");
	}

	/**
	 *
	 * Delete root node and check out the tree by traversal
	 *
	 * 
	 */
	@Test
	public void testDeleteRootNode() {
		List<Integer> list = new ArrayList<Integer>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		LOG.info("-----------------------------------------");
		LOG.info(" delete root (5) node ");
		tree.delete(new BinaryTreeNode<Integer>(5));
		LOG.info("-----------------------------------------");
		tree.inOrder(root);
		LOG.info("-----------------------------------------");
	}

	/**
	 *
	 * Delete root node and check out the tree by traversal
	 *
	 * 
	 */
	@Test
	public void testEmptyTree() {
		BinaryTree<Integer> tree = new BinaryTree<Integer>(null);
		tree.delete(new BinaryTreeNode<Integer>(0));
		LOG.info("-----------------------------------------");
		LOG.info(" delete root (0) node from an empty tree ");
		LOG.info("-----------------------------------------");
		tree.inOrder(tree.getRoot());
		LOG.info("-----------------------------------------");
	}

	/**
	 *
	 * Test the inOrder Succesor of the node of the Tree
	 *
	 * 
	 */
	@Test
	public void testInOrderPredecessor() {
		List<Integer> list = new ArrayList<Integer>();		
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.inOrderSuccessor(new BinaryTreeNode<Integer>(5), new ArrayList<Integer>()),
				new BinaryTreeNode<Integer>(6));
	}

	/**
	 *
	 * Test minima
	 *
	 * 
	 */
	@Test
	public void testMinima() {
		List<Integer> list = new ArrayList<Integer>();		
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.minimum(tree.getRoot()), new BinaryTreeNode<Integer>(0));
	}

	/**
	 *
	 * Test maxima
	 *
	 * 
	 */
	@Test
	public void testMaxima() {
		List<Integer> list = new ArrayList<Integer>();		
		list.add(5);
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.maximum(tree.getRoot()), new BinaryTreeNode<Integer>(9));
	}

	/**
	 * 
	 * Test the Height
	 * 
	 */
	@Test
	public void testHeight() {
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.height(tree.getRoot()), 6);
		LOG.info(" height " + tree.height(tree.getRoot()));
	}

	@Test
	public void testBalanceFactor() {
		BinaryTree<Integer> tree = createBST();
		assertEquals(tree.balanceFactor(tree.getRoot()), -1);
		LOG.info(" balance Factor " + tree.balanceFactor(tree.getRoot()));
	}

	/**
	 * 
	 * 
	 * 
	 * @return BinaryTree<Integer>
	 */	
	private BinaryTree<Integer> createBST() {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for (int count = 0; count < 10; count++) {
			if (count != 5) {
				tree.add(new BinaryTreeNode<Integer>(count));
			}
		}
		return tree;
	}
}