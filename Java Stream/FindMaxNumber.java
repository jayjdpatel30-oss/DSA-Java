package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {
	
	// ========================================================================
	// PROBLEM : Find Maximum Number
	// ========================================================================
	/*
	 * Problem Statement: Find the maximum number in a list.
	 * Input: [10, 50, 20, 40]
	 * Output: 50
	 * 
	 * Approach: Use max() with comparator.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 50, 20, 40);

		int max = numbers.stream().max(Integer::compareTo).get();

		System.out.println(max);
	}
}

// Output :
// 50
