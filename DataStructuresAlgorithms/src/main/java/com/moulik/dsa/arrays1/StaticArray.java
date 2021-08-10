package com.moulik.dsa.arrays1;

/**
 * 	Static Array is a fixed length container containing n elements, indexable from [0,n-1]
 *	Indexable means each slot/index can be referenced with a number.
 *	Static arrays are given as contiguous chunks of memory. All the addresses of the array are continuous.
 *
 *	They are used in :
 *	1. Storing and accessing sequential data
 *	2. Temporarily storing objects.
 *	3. Used by IO Routines as buffers
 *	4. Lookup Tables and Inverse Lookup Tables
 *	5. Can be used to return multiple values from a function
 *	6. Used in Dynamic Programming to cache answers to subproblems
 *
 *	In Java, it is 0-based
 *
 *		0	1	2	3	4	5	6	7	8	9	10	
 *	A:	44	12	-5	7	6	0	5	1	32	-25	11
 *		
 *	Accessing the elements		O(1)
 *	Searching an element		O(n)
 */
public class StaticArray {

	public static void main(String[] args) {
		
		int[] x = new int[20];
		int[] y = {1,5,3};

	}

}
