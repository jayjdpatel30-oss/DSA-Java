package ArrayEasy;

import java.util.Arrays;

public class RotateArray {

	// ========================================================================
	// PROBLEM 7: Rotate Array
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, rotate the array to the right
	 * by k steps, where k is non-negative.
	 * 
	 * Example: Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
	 */

	/**
	 * Approach 1 (Reversal Algorithm): Reverse entire array, then reverse first k
	 * elements, then reverse remaining elements.
	 * 
	 * Time Complexity: O(n) - three passes through array Space Complexity: O(1) -
	 * in-place rotation
	 * 
	 * Approach 2 (Using Extra Array): Copy elements to new array at rotated
	 * positions. Time: O(n), Space: O(n)
	 */

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

//		rotate(nums, k);
//		System.out.println("Roatated Array : " + Arrays.toString(nums));

		rotateArr(nums, k);
	}

	// approach 1
	private static void rotate(int[] nums, int k) {

		// nums = 1,2,3,4,5,6,7
		// reverse whole arrays

		reverseArrays(nums, 0, nums.length - 1);

		// nums = 7,6,5,4,3,2,1
		// revserse first k elements

		reverseArrays(nums, 0, k - 1);
		// nums = 5,6,7,4,3,2,1
		// reverse other half
		// nums = 5,6,7,1,2,3,4

		reverseArrays(nums, k, nums.length - 1);

	}

	private static void reverseArrays(int[] nums, int start, int end) {

		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;

			start++;
			end--;
		}

	}

	// approach 2
	private static void rotateArr(int[] nums, int k) {

		int[] result = new int[nums.length];

		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}

		for (int i = k; i < nums.length; i++) {
			result[i] = nums[i - k];
		}

		System.out.println(Arrays.toString(result));
	}

}
