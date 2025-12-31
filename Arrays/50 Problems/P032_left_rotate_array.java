package Problems;

import java.util.Arrays;

public class P032_left_rotate_array {

	// ========================================================================
	// PROBLEM 32: Left Rotate Array
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, rotate it to the left by one position.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4]
	 * Output : [2, 3, 4, 1]
	 *
	 * Optimal Approach:
	 * 1. Store the first element in a variable.
	 * 2. Shift all elements one position to the left.
	 * 3. Place the stored element at the last index.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		leftRotate(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void leftRotate(int[] nums) {

		int first = nums[0];

		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}

		nums[nums.length - 1] = first;
	}

}
