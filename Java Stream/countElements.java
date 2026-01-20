package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countElements {

	// ========================================================================
	// PROBLEM : Count Elements in List
	// ========================================================================
	/*
	 * Problem Statement: Count number of elements in a list using streams.
	 * Input: [10, 20, 30, 40]
	 * Output: 4
	 * 
	 * Approach: Use stream().count() to count elements.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

		long totalElements = list.stream().count();

		System.out.println(list + "\nTotal elements : " + totalElements);

		System.out.println(list.size());

		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1, 2));

		long totalDistinctElements = list1.stream().distinct().count();

		System.out.println("\n" + list1 + "\nTotal Distinct elements : " + totalDistinctElements);

	}

}

// Output : 
// [10, 20, 30, 40]
// Total elements : 4
// 4

// [1, 2, 3, 2, 1, 2]
// Total Distinct elements : 3
