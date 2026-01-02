package Problems;

import java.util.HashSet;
import java.util.Set;

public class P042_first_repeating_element {

	// ========================================================================
	// PROBLEM 42: First Repeating Element
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, find the first repeating element.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 2, 4]
	 * Output : 2
	 *
	 * Optimal Approach:
	 * 1. Use a HashSet to track visited elements.
	 * 2. Traverse the array from left to right.
	 * 3. If an element already exists in the set,
	 *    it is the first repeating element.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 2, 4 };

		System.out.println(repeated(nums));
	}

	private static int repeated(int[] nums) {

		if (nums.length <= 1) {
			return 0;
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}
		
		return 0;
	}

}
