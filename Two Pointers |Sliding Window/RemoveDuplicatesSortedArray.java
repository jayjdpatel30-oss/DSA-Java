package TwoPointers_SlidingWindow;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	// ========================================================================
	// PROBLEM 2: Remove Duplicates from Sorted Array
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums sorted in non-decreasing
	 * order, remove the duplicates in-place such that each unique element appears
	 * only once. The relative order of the elements should be kept the same. Return
	 * k after placing the final result in the first k slots of nums.
	 * 
	 * Example: Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation:
	 * Function should return k = 2, with first two elements being 1 and 2.
	 * 
	 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
	 */

	/**
	 * Approach: Two-pointer technique: - 'slow' pointer: tracks position for next
	 * unique element - 'fast' pointer: scans through array to find unique elements
	 * 
	 * When fast finds a unique element (different from slow), copy it to position
	 * slow+1 and increment slow.
	 * 
	 * Key insight: Since array is sorted, duplicates are adjacent!
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using two pointers
	 */
	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//		removeDuplicates(nums);
		System.out.println(Arrays.toString(nums));

		removeDups(nums);

		System.out.println(Arrays.toString(nums));

	}

	private static void removeDuplicates(int[] nums) {

		int uniqueIndex = 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != nums[i - 1]) {
				nums[uniqueIndex++] = nums[i];
			}

		}

		System.out.println("Unique elements : " + uniqueIndex);
	}

	private static void removeDups(int[] nums) {

		if (nums.length < 1 || nums == null) {
			return;
		}

		int slow = 0;

		for (int fast = 0; fast < nums.length; fast++) {

			if (nums[slow] != nums[fast]) {
				nums[++slow] = nums[fast];
			}

		}

		System.out.println("Total Uniqie elements :  " + (slow + 1));

	}

}
