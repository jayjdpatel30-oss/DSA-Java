package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class squareEachNumber {

	// ========================================================================
	// PROBLEM : Square Each Number
	// ========================================================================
	/*
	 * Problem Statement: Print square of each number in a list.
	 * Input: [1, 2, 3, 4]
	 * Output: 1 4 9 16
	 * 
	 * Approach: Use map(n -> n * n) to transform each element.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		numbers.stream().map(number -> number * number).forEach(System.out::println);

	}

}

// Output :
// 1
// 4
// 9
// 16
