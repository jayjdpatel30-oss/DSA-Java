package Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
	
	// ========================================================================
	// PROBLEM : Find Longest String
	// ========================================================================
	/*
	 * Problem Statement: Find the longest string in a list.
	 * Input: ["java", "stream", "programming"]
	 * Output: programming
	 * 
	 * Approach: Use max() with Comparator.comparingInt(String::length).
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "stream", "programming");
		
		String longestWord = words.stream().max(Comparator.comparingInt(String::length)).orElse("");
		
		System.out.println(longestWord);
		
	}

}

// Output :
// programming
