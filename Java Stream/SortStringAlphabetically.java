package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAlphabetically {
	
	// ========================================================================
	// PROBLEM : Sort Strings Alphabetically
	// ========================================================================
	/*
	 * Problem Statement: Sort strings in alphabetical order.
	 * Input: ["banana", "apple", "cherry"]
	 * Output: ["apple", "banana", "cherry"]
	 * 
	 * Approach: Use sorted().
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 */

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("banana", "apple", "cherry");
		
		List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}

}

// Output :
// [apple, banana, cherry]
