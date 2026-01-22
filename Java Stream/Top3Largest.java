package Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Top3Largest {
	
	// ========================================================================
	// PROBLEM : Top 3 Largest Numbers
	// ========================================================================
	/*
	 * Problem Statement: Find top 3 largest numbers in a list.
	 * Input: [5, 1, 9, 3, 7]
	 * Output: [9, 7, 5]
	 * 
	 * Approach: Sort in descending order, then limit to 3.
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7);
		
		List<Integer> largestThree = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println(largestThree);
		
	}

}

// Output :
// [9, 7, 5]
