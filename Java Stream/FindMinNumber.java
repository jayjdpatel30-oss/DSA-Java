package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class FindMinNumber {
	
	// ========================================================================
	// PROBLEM : Find Minimum Number
	// ========================================================================
	/*
	 * Problem Statement: Find the minimum number in a list.
	 * Input: [10, 50, 20, 40]
	 * Output: 10
	 * 
	 * Approach: Use min() with comparator.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 50, 20, 40);

		int min = numbers.stream().min(Integer::compareTo).get();

		System.out.println(min);
	}
}

// Output :
// 10
