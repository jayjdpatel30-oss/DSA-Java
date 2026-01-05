package Problems;

import java.util.Arrays;
import java.util.HashSet;

public class P047_union_array {

	// ========================================================================
	// PROBLEM 47: Find Union of Arrays
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two integer arrays, find the union of the arrays
	 * (all unique elements from both arrays).
	 *
	 * Example:
	 * Input  : [1, 2, 3] and [3, 4, 5]
	 * Output : 1 2 3 4 5
	 *
	 * Optimal Approach:
	 * 1. Use a HashSet to store unique elements.
	 * 2. Add all elements from both arrays into the set.
	 * 3. Print elements of the set.
	 *
	 * Time Complexity:
	 * O(n + m)
	 *
	 * Space Complexity:
	 * O(n + m)
	 */

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 3, 4, 5 };
		
		System.out.println(Arrays.toString(union(arr1,arr2)));
	}
	
	private static int[] union(int[] arr1, int[] arr2) {
		
		if(arr1.length == 0) {
			return arr2;
		}
		
		if(arr2.length == 0) {
			return arr1;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int val : arr1) {
			set.add(val);
		}
		for(int val : arr2) {
			set.add(val);
		}
		
		int[] result = new int[set.size()];
		int index = 0;
		
		for(int val : set) {
			result[index++] = val;
		}
		
		return result;
	}

}
