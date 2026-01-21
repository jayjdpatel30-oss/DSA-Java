package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class CollectEvenNumbers {
	
	// ========================================================================
	// PROBLEM : Collect Even Numbers into New List
	// ========================================================================
	/*
	 * Problem Statement: Create a new list containing only even numbers.
	 * Input: [1, 2, 3, 4, 5, 6]
	 * Output: [2, 4, 6]
	 * 
	 * Approach: Filter even numbers and collect using Collectors.toList().
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
		
		evenNumbers.stream().forEach(System.out::println);
		
	}
}

// Output :
// 2
// 4
// 6
