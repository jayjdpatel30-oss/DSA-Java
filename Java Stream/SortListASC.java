package Java_Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListASC {
	
	// ========================================================================
	// PROBLEM : Sort List in Ascending Order
	// ========================================================================
	/*
	 * Problem Statement: Sort a list of integers in ascending order.
	 * Input: [4, 1, 3, 2]
	 * Output: [1, 2, 3, 4]
	 * 
	 * Approach: Use sorted() method.
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4, 1, 3, 2);
		numbers.stream().sorted().forEach(n -> System.out.print(n + ""));
		System.out.println();

		List<Integer> asc = numbers.stream().sorted().toList();
		
		System.out.println(asc);
		
	}

}

// Output :
// 1234
// [1, 2, 3, 4]
