package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class numberGreaterThan10 {

	// ========================================================================
	// PROBLEM : Find Numbers Greater Than 10
	// ========================================================================
	/*
	 * Problem Statement: Print numbers greater than 10 from a list.
	 * Input: [5, 12, 8, 20, 3]
	 * Output: 12 20
	 * 
	 * Approach: Apply filter(n -> n > 10) and print result.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3);

		numbers.stream().filter(number -> number > 10).forEach(System.out::println);

	}

}

// Output :
// 12
// 20
