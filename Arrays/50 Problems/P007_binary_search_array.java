package Problems;

import java.util.Arrays;

public class P007_binary_search_array {

	// ========================================================================
	// PROBLEM 7: Binary Search in Array
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a sorted integer array and a target value,
	 * find its index using binary search.
	 *
	 * Example:
	 * Input  : [10, 20, 30, 40, 50], target = 40
	 * Output : 3
	 *
	 * Approach:
	 * 1. Initialize left and right pointers.
	 * 2. Find mid index.
	 * 3. Compare mid element with target.
	 * 4. Adjust pointers accordingly.
	 * 5. Repeat until found or range becomes invalid.
	 *
	 * Time Complexity:
	 * O(log n)
	 *
	 * Space Complexity:
	 * O(1)
	 */
	
	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40, 50 };
		int target = 5;

		int indexFound = binarySearch(numbers, target);

		System.out.println(target + ((indexFound == -1) ? " not Found!" : " Found at index : " + indexFound));
	}

	private static int binarySearch(int[] nums, int target) {

		if (nums.length < 1) {
			return -1;
		}
		
		Arrays.sort(nums);

		int left = 0, right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}

}
