package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printElements {

	// ========================================================================
	// PROBLEM : Print All Elements
	// ========================================================================
	/*
	 * Problem Statement: Given a list of integers, print all elements using Java
	 * Streams. Input: [1, 2, 3, 4, 5] Output: 1 2 3 4 5
	 * 
	 * Approach: Convert list to stream and use forEach to print elements. Time
	 * Complexity: O(n) Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().forEach(System.out::print);

		System.out.println("\n" + list);

	}

}

// Output :
// 12345
// [1, 2, 3, 4, 5]
