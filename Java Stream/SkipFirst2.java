package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class SkipFirst2 {

	// ========================================================================
	// PROBLEM : Skip First 2 Elements
	// ========================================================================
	/*
	 * Problem Statement: Skip first 2 elements and print remaining.
	 * Input: [10, 20, 30, 40, 50]
	 * Output: [30, 40, 50]
	 * 
	 * Approach: Use skip(2).
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		List<Integer> skp2 = numbers.stream().skip(2).toList();
		
		System.out.println(skp2);
		
	}
  
}

// Output :
// [30, 40, 50]
