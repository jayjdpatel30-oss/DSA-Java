package Java_Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDESC {
	
	// ========================================================================
	// PROBLEM : Sort List in Descending Order
	// ========================================================================
	/*
	 * Problem Statement: Sort a list of integers in descending order.
	 * Input: [4, 1, 3, 2]
	 * Output: [4, 3, 2, 1]
	 * 
	 * Approach: Use sorted() with Comparator.reverseOrder().
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4, 1, 3, 2);

		List<Integer> desc = numbers.stream().sorted(Collections.reverseOrder()).toList();

		System.out.println(desc);
		
	}
}

// Output : 
// [4, 3, 2, 1]
