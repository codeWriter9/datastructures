package org.ghosh.sanjay.datastructure;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import org.ghosh.sanjay.datastructures.Stack;

/**
 * Unit test for simple App.
 */
public class StackTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StackTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StackTest.class );
    }

    /**
     * Test Stack upto 10 elements
     */
    public void testStack()
    {		
        Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int count=0;count<10;count++)  {
			list.add(count);
			stack.push(count);			
		}
		Collections.reverse(list);		
		for(Integer element : list)  					
			assertTrue(element == stack.pop());		
    }

    /**
     * Test a stack that has been popped out and then again pushed in
     */
    public void testStack2()
    {		
        Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int count=0;count<10;count++)  {
			list.add(count);
			stack.push(count);			
		}
		stack.pop();
		stack.pop();
		list.remove(new Integer(8));
		list.remove(new Integer(9));
		for(int count=8;count<29;count++)  {
			list.add(count, count);
			stack.push(count);			
		}
		Collections.reverse(list);		
		for(Integer element : list)  					
			assertTrue(element.equals(stack.pop()));		
    }

    /**
     * 
	 * Test the stack for large number of elements [ 1 million ]
	 * 
     */
    public void testStack3()
    {		
        Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();		
		for(int count=0;count<1000000;count++)  {
			list.add(count);
			stack.push(count);			
		}		
		Collections.reverse(list);		
		for(Integer element : list)              
			assertTrue(element.equals(stack.pop()));				
    }	
}