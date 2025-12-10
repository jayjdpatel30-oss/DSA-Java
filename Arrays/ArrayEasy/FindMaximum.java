package ArrayEasy;

import java.util.Arrays;

public class FindMaximum {

	// ========================================================================
	// PROBLEM 1: Find Maximum Element in Array
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, find and return the maximum
	 * element in the array.
	 * 
	 * Example: Input: nums = [3, 7, 2, 9, 1] Output: 9
	 */

	/**
	 * Approach 1 (Linear): Iterate through the array and keep track of the maximum
	 * element found so far.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only storing one variable
	 * 
	 * Approach 2 (Sorting): Sort the array and return the last element. Time: O(n
	 * log n), Space: O(1)
	 */

	public static void main(String[] args) {

		int nums[] = { 3, 7, 2, 9, 1 };
		System.out.println("Maximum number in array is : " + max(nums));
		System.out.println("Maximum number in array is : " + maximum(nums));

	}

	// approach 1
	private static int max(int nums[]) {

		if (nums == null) {
			return -1;
		}

		int max = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}

	// approach 2
	private static int maximum(int nums[]) {

		if (nums == null) {
			return -1;
		}

		Arrays.sort(nums);

		return nums[nums.length - 1];
	}

}
