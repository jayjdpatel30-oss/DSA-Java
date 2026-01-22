package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	// ========================================================================
	// PROBLEM : Remove Duplicate Elements
	// ========================================================================
	/*
	 * Problem Statement: Remove duplicate integers from a list.
	 * Input: [1, 2, 2, 3, 3, 4]
	 * Output: [1, 2, 3, 4]
	 * 
	 * Approach: Use distinct() to remove duplicates.
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4);
		
		List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(unique);
		
	}

}

// Output :
// [1, 2, 3, 4]
