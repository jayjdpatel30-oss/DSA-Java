package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class NumberGreaterThan50 {

	// ========================================================================
	// PROBLEM : Check If Any Number Is Greater Than 50
	// ========================================================================
	/*
	 * Problem Statement: Check if any element in list is greater than 50.
	 * Input: [10, 20, 60, 30]
	 * Output: true
	 * 
	 * Approach: Use anyMatch() to test condition.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 60, 30);

		boolean exists = numbers.stream().anyMatch(a -> a > 50);

		System.out.println(exists);
	}
}

// Output :
// true
