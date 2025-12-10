package ArrayEasy;

import java.util.Arrays;

public class CheckSorted {

	// ========================================================================
	// PROBLEM 4: Check if Array is Sorted
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, return true if the array is
	 * sorted in non-decreasing order, otherwise return false.
	 * 
	 * Example: Input: nums = [1, 2, 3, 4, 5] Output: true
	 * 
	 * Input: nums = [1, 3, 2, 4] Output: false
	 */

	/**
	 * Approach 1 (Single Pass): Iterate through the array and check if each element
	 * is less than or equal to the next element.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) - no
	 * extra space used
	 * 
	 * Approach 2 (Compare with Sorted Copy): Create a sorted copy and compare with
	 * original. Time: O(n log n), Space: O(n)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 3, 4, 5 };
		System.out.println(arraySorted(nums) ? "Sorted!" : "Not Sorted!");
		System.out.println(isSortedUsingCopy(nums) ? "Sorted!" : "Not Sorted!");
	}

	// approach 1
	private static boolean arraySorted(int[] nums) {

		if (nums.length == 0) {
			return false;
		}

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				return false;
			}
		}

		return true;
	}

	// approach 2
	private static boolean isSortedUsingCopy(int[] nums) {

		int[] sorted = nums.clone();
		Arrays.sort(sorted);

		return Arrays.equals(nums, sorted);
	}
}
