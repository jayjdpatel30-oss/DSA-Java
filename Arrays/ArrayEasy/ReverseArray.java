package ArrayEasy;

import java.util.Arrays;

public class ReverseArray {

	// ========================================================================
	// PROBLEM 2: Reverse an Array
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, reverse the array in-place
	 * and return it.
	 * 
	 * Example: Input: nums = [1, 2, 3, 4, 5] Output: [5, 4, 3, 2, 1]
	 */

	/**
	 * Approach 1 (Two Pointers): Use two pointers, one at the start(left) and one
	 * at the end(right). Swap elements and move pointers towards the center.
	 * 
	 * Time Complexity: O(n) - iterate through half the array Space Complexity: O(1)
	 * - only using pointers
	 * 
	 * Approach 2 (Using Extra Array): Create a new array and copy elements in
	 * reverse order. Time: O(n), Space: O(n)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		reverse(nums);
		System.out.println(Arrays.toString(nums));

		System.out.println(Arrays.toString(reverseArrayUsingExtraSpace(nums)));
	}

	// approach 1
	private static void reverse(int nums[]) {

		if (nums.length == 0) {
			return;
		}

		int left = 0, right = nums.length - 1;

		while (left < right) {

			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
	}

	// approach 2
	private static int[] reverseArrayUsingExtraSpace(int[] nums) {

		if (nums.length == 0) {
			return new int[] {};
		}

		int[] result = new int[nums.length];
		int index = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			result[index++] = nums[i];
		}

		return result;
	}
}
