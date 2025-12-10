package ArrayEasy;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargest {

	// ========================================================================
	// PROBLEM 6: Find Second Largest Element
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, find and return the second
	 * largest element. If it doesn't exist, return -1.
	 * 
	 * Example: Input: nums = [12, 35, 1, 10, 34, 1] Output: 34
	 */

	/**
	 * Approach 1 (Single Pass): Keep track of largest and second largest in one
	 * iteration.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only storing two variables
	 * 
	 * Approach 2 (Sorting): Sort the array and find second largest. Time: O(n log
	 * n), Space: O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 12, 35, 1, 10, 34, 1 };
//		int[] nums = { 1, 1, 1, 1, 1, 1 };
		System.out.println("Second Largest Element : " + secondLargest(nums));
		System.out.println("Second Largest Element : " + secondLargestSort(nums));
	}

	// approach 1
	private static int secondLargest(int nums[]) {

		if (nums.length < 2) {
			return -1;
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : nums) {

			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}

		}

		if (secondLargest == Integer.MIN_VALUE) {
			return -1;
		}

		return secondLargest;
	}

	// approach 2
	private static int secondLargestSort(int nums[]) {

		if (nums.length < 2) {
			return -1;
		}

		Arrays.sort(nums);

		for (int i = nums.length - 2; i >= 0; i--) {

			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}

		}

		return -1;
	}

}
