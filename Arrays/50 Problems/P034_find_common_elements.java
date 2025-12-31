package Problems;

import java.util.HashSet;

public class P034_find_common_elements {

	// ========================================================================
	// PROBLEM 34: Find Common Elements
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two integer arrays, find common elements between them.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4] and [3, 4, 5]
	 * Output : 3 4
	 *
	 * Optimal Approach:
	 * 1. Store elements of first array in a HashSet.
	 * 2. Traverse second array.
	 * 3. If element exists in the set, it is common.
	 *
	 * Time Complexity:
	 * O(n + m)
	 *
	 * Space Complexity:
	 * O(n)
	 */
		
	
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5 };
		commonElements(arr1, arr2);
		
		System.out.println();
		commons(arr1, arr2);

	}

	// Brute Force Approach
	private static void commonElements(int[] arr1, int[] arr2) {

		if (arr1 == null || arr2 == null) {
			System.out.println("No Common Elements!");
			return;
		}

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					continue;
				}
			}
		}
	}
	
	// Using HashSet
	private static void commons(int[] arr1, int[] arr2) {
		
		if (arr1 == null || arr2 == null) {
			System.out.println("No Common Elements!");
			return;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int val : arr1) {
			set.add(val);
		}
		
		for(int val : arr2) {
			if(set.contains(val)) {
				System.out.print(val + " ");
			}
		}
		
	}

}
