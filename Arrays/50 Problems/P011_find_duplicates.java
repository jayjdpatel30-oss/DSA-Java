package Problems;

import java.util.HashSet;
import java.util.Set;

public class P011_find_duplicates {

	// ========================================================================
	// PROBLEM 11: Find Duplicate Elements
	// ========================================================================
	/*
	 * Given an integer array, find and print all duplicate elements.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 2, 4, 1]
	 * Output : 1 2
	 *
	 * Approach:
	 * 1. Use a HashSet to store visited elements.
	 * 2. If an element is already present in the set, it is a duplicate.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 2, 4, 1 };
		duplicates(nums);
	}

	private static void duplicates(int[] nums) {

		if (nums.length <= 1) {
			System.out.println("No duplicates.");
			return;
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int val : nums) {
			if (!set.add(val)) {
				System.out.print(val + " ");
			}
		}

	}

}
