package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
	
	// ========================================================================
	// PROBLEM : Sum of All Numbers
	// ========================================================================
	/*
	 * Problem Statement: Find the sum of all elements in a list.
	 * Input: [1, 2, 3, 4, 5]
	 * Output: 15
	 * 
	 * Approach: Use reduce() to add all elements.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 3);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);

		System.out.println(sum);

	}

}

// Output :
// 15
