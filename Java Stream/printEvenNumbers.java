package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class printEvenNumbers {

	// ========================================================================
	// PROBLEM : Print Even Numbers
	// ========================================================================
	/*
	 * Problem Statement: Print only even numbers from a list.
	 * Input: [1, 2, 3, 4, 5, 6]
	 * Output: 2 4 6
	 * 
	 * Approach: Use filter() to keep even numbers, then forEach().
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}

// Output :
// 2
// 4
// 6
