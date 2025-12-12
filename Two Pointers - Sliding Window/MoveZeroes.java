package TwoPointers_SlidingWindow;

import java.util.Arrays;

public class MoveZeroes {

	// ========================================================================
	// PROBLEM 3: Move Zeroes
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. Note: You must
	 * do this in-place without making a copy of the array.
	 * 
	 * Example: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
	 * 
	 * Input: nums = [0] Output: [0]
	 */

	/**
	 * Approach: Two-pointer technique (similar to partitioning): - 'left' pointer:
	 * tracks position where next non-zero should be placed - 'right' pointer:
	 * iterates through array
	 * 
	 * Strategy: Move all non-zeros to the front, zeros automatically go to end.
	 * When we find non-zero at right, swap with position at left.
	 * 
	 * Alternative: Two-pass solution (collect non-zeros, then fill zeros)
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using pointers, in-place modification
	 */

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12, 0, 2 };
		moveZeroesLR(nums);
		System.out.println(Arrays.toString(nums));
	}

	// using index to fill first nonzero elements then zeroes
	public static void moveZeroes(int[] nums) {

		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		// now filling 0 from index we completed filling nonzeroes
		while (index < nums.length) {
			nums[index++] = 0;
		}

	}

	// using 2 pointer and swap
	public static void moveZeroesLR(int[] nums) {

		int left = 0;
		int right = 0;

		while (right < nums.length) {

			if (nums[left] != 0) {
				left++;
				right++;
			} else if (nums[right] == 0) {
				right++;
			} else {

				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;

			}
		}

	}

}
