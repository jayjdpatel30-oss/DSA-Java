package Problems;

import java.util.Arrays;

public class P033_right_rotate_array {

	// ========================================================================
	// PROBLEM 33: Right Rotate Array
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, rotate it to the right by one position.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4]
	 * Output : [4, 1, 2, 3]
	 *
	 * Optimal Approach:
	 * 1. Store the last element in a variable.
	 * 2. Shift all elements one position to the right.
	 * 3. Place the stored element at index 0.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		rightRotate(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void rightRotate(int[] nums) {

		int last = nums[nums.length - 1];

		for (int i = nums.length - 1; i > 0; i--) {
			nums[i] = nums[i - 1];
		}

		nums[0] = last;
	}

}
