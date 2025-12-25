package Problems;

import java.util.Arrays;

public class P013_find_missing_num {

	// ========================================================================
	// PROBLEM 13: Find Missing Number
	// ========================================================================
	/*
	 * Given an array of size n-1 containing numbers from 1 to n,
	 * find the missing number.
	 *
	 * Example:
	 * Input  : [1, 2, 4, 5]
	 * Output : 3
	 *
	 * Approach:
	 * 1. Calculate expected sum using formula n*(n+1)/2.
	 * 2. Calculate actual sum of array elements.
	 * 3. Missing number = expected sum - actual sum.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 5 };
		System.out.println("Missing number : " + missing(nums));
	}

	private static int missing(int[] nums) {

		if (nums.length < 1) {
			return 0;
		}

		int n = nums.length + 1;

		int total = (n * (n + 1)) / 2;

		for (int val : nums) {
			total -= val;
		}

		return total;
	}

}
