package org.ghosh.sanjay.datastructure;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import org.ghosh.sanjay.datastructures.BinaryTree;
import org.ghosh.sanjay.datastructures.BinaryTreeNode;

/**
 * Unit test for simple App.
 */
public class BinaryTreeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BinaryTreeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BinaryTreeTest.class );
    }

    /**
	 *
	 *
	 *
     * Test Tree upto 10 elements
     */
    public void testInsertTree()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode(count));
				list.add(count);
			}
		}
		tree.inOrder(root, otherList);
		for(Integer data : otherList) {
			assertTrue(list.contains(data));
		}
    }

	/**
	 *
	 *
	 *
     * Test Tree upto 10 elements
     */
    public void testInsertTreeAndTreeTraversal()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> preOrderList = new ArrayList<Integer>();
		List<Integer> inOrderList = new ArrayList<Integer>();
		List<Integer> postOrderList = new ArrayList<Integer>();
		
		List<Integer> checkList1 = Arrays.asList(new Integer[]{5, 0, 1, 2, 3, 4, 6, 7, 8, 9});
		List<Integer> checkList2 = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
		List<Integer> checkList3 = Arrays.asList(new Integer[]{4, 3, 2, 1, 0, 9, 8, 7, 6, 5});
		
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode(count));
				list.add(count);
			}
		}
		tree.preOrder(root, preOrderList);
		tree.inOrder(root, inOrderList);
		tree.postOrder(root, postOrderList);		
		assertTrue(preOrderList.equals(checkList1));
		assertTrue(inOrderList.equals(checkList2));
		assertTrue(postOrderList.equals(checkList3));
    }	
	
	
	/**
	 *
	 * Search the Tree for a particular node.
	 *
     * 
     */
    public void testSearchTree()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode<Integer>(count));
				list.add(count);
			}
		}
		System.out.println(tree.search(new BinaryTreeNode<Integer>(0)));
    }
	
	/**
	 *
	 * Delete a node and check out the tree by traversal
	 *
     * 
     */
    public void testDeleteNode()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode<Integer>(count));
				list.add(count);
			}
		}
		System.out.println("-----------------------------------------");
		System.out.println(" delete (9) node " +  tree.delete(new BinaryTreeNode<Integer>(9)));
		System.out.println("-----------------------------------------");
		tree.inOrder(root);
		System.out.println("-----------------------------------------");
    }
	
	
	/**
	 *
	 * Delete root node and check out the tree by traversal
	 *
     * 
     */
    public void testDeleteRootNode()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode<Integer>(count));
				list.add(count);
			}
		}
		System.out.println("-----------------------------------------");
		System.out.println(" delete root node " + tree.delete(new BinaryTreeNode<Integer>(5)));
		System.out.println("-----------------------------------------");
		tree.inOrder(root);
		System.out.println("-----------------------------------------");
    }
	
	
	/**
	 *
	 * Test the inOrder Succesor of the node of the Tree
	 *
     * 
     */
    public void testInOrderPredecessor()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> otherList = new ArrayList<Integer>();
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode(count));
				list.add(count);
			}
		}		
		assertTrue(tree.inOrderSuccessor(new BinaryTreeNode<Integer>(5), new ArrayList<Integer>()).equals(new BinaryTreeNode<Integer>(6)));
    }
	
	
	/**
	 *
	 * Test minima
	 *
     * 
     */
    public void testMinima()
    {		
	    List<Integer> list = new ArrayList<Integer>();		
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode(count));
				list.add(count);
			}
		}		
		//System.out.println("-----------------------------------------");
		//System.out.println(" minimum " + tree.minimum(tree.getRoot()));
		//System.out.println("-----------------------------------------");
		assertTrue(tree.minimum(tree.getRoot()).equals(new BinaryTreeNode<Integer>(0)));
    }
	
	
	/**
	 *
	 * Test maxima
	 *
     * 
     */
    public void testMaxima()
    {		
	    List<Integer> list = new ArrayList<Integer>();		
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		list.add(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);
		for(int count=0;count<10;count++) {
			if(count != 5) {
			    tree.add(new BinaryTreeNode(count));
				list.add(count);
			}
		}
		//System.out.println("-----------------------------------------");
		//System.out.println("maximum " + tree.maximum(tree.getRoot()));
		//System.out.println("-----------------------------------------");
		assertTrue(tree.maximum(tree.getRoot()).equals(new BinaryTreeNode<Integer>(9)));
    }
}