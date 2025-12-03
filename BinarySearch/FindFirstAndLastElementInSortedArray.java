package BinarySearch;

import java.util.Arrays;

import javax.naming.directory.SearchResult;

public class FindFirstAndLastElementInSortedArray {

	/**
	 * PROBLEM STATEMENT: Given an array of integers nums sorted in non-decreasing
	 * order, find the starting and ending position of a given target value. If
	 * target is not found in the array, return [-1, -1]. You must write an
	 * algorithm with O(log n) runtime complexity.
	 * 
	 * Example 1: Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
	 * 
	 * Example 2: Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
	 * 
	 * APPROACH: - Use binary search twice: once to find the leftmost position, once
	 * for rightmost - For leftmost: when we find target, continue searching left
	 * half - For rightmost: when we find target, continue searching right half
	 * 
	 * TIME COMPLEXITY: O(log n) - two binary searches SPACE COMPLEXITY: O(1) -
	 * constant extra space
	 */

	public static void main(String[] args) {

		int[] result = searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
		System.out.println(Arrays.toString(result));

	}

	public static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };
		if (nums == null || nums.length == 0)
			return result;

		// Find leftmost position
		result[0] = findBound(nums, target, true);

		// If target not found, no need to search for right bound
		if (result[0] == -1)
			return result;

		// Find rightmost position
		result[1] = findBound(nums, target, false);

		return result;
	}

	private static int findBound(int[] nums, int target, boolean isLeft) {
		int left = 0, right = nums.length - 1;
		int bound = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				bound = mid;
				// For left bound, continue searching left
				// For right bound, continue searching right
				if (isLeft) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return bound;
	}

}
