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
    public void testTree()
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
    public void testTree2()
    {		
	    List<Integer> list = new ArrayList<Integer>();
		List<Integer> preOrderList = new ArrayList<Integer>();
		List<Integer> inOrderList = new ArrayList<Integer>();
		List<Integer> postOrderList = new ArrayList<Integer>();
		
		List<Integer> checkList1 = Arrays.asList(new Integer[]{5, 6, 7, 8, 9, 0, 1, 2, 3, 4});
		List<Integer> checkList2 = Arrays.asList(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
		List<Integer> checkList3 = Arrays.asList(new Integer[]{9, 8, 7, 6, 4, 3, 2, 1, 0, 5});
		
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
	 *
	 *
     * Test Tree upto 10 elements
     */
    public void testTree3()
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
}