package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class ProductOfAllElements {
	
	// ========================================================================
	// PROBLEM : Product of All Numbers
	// ========================================================================
	/*
	 * Problem Statement: Find product of all numbers in a list.
	 * Input: [1, 2, 3, 4]
	 * Output: 24
	 * 
	 * Approach: Use reduce() with multiplication.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		int product = numbers.stream().reduce(1, (a , b) -> a * b);
		
		System.out.println(product);
		
	}

}

// Output:
// 24
