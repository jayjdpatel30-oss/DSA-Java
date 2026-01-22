package Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndRemoveDuplicates {
	
	// ========================================================================
	// PROBLEM : Sort and Remove Duplicates
	// ========================================================================
	/*
	 * Problem Statement: Sort list and remove duplicates.
	 * Input: [3, 1, 2, 3, 2, 1]
	 * Output: [1, 2, 3]
	 * 
	 * Approach: Apply distinct() then sorted().
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 1, 2, 3, 2, 1);
		
		List<Integer> result = numbers.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}

// Output :
// [1, 2, 3]
