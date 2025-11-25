package DAY1;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	// ========================================================================
	// PROBLEM 4: Contains Duplicate
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, return true if any value
	 * appears at least twice in the array, and return false if every element is
	 * distinct.
	 * 
	 * Example: Input: nums = [1,2,3,1] Output: true
	 */

	/**
	 * Approach 1 (HashSet - Used below): Use a HashSet to track elements we've
	 * seen. If we encounter an element already in the set, we found a duplicate.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(n) -
	 * HashSet to store elements
	 * 
	 * Approach 2 (Sorting - Alternative): Sort the array and check adjacent
	 * elements. Time: O(n log n), Space: O(1)
	 */

	public static void main(String[] args) {

		boolean result1 = containsDuplicate(new int[] { 1, 2, 3, 1 });
		System.out.println("Array contains duplicates : " + ((result1) ? "Yes" : "No"));

		boolean result2 = containsDuplicates(new int[] { 1, 2, 3, 1 });
		System.out.println("Array contains duplicates : " + ((result2) ? "Yes" : "No"));
	}

	// approach 1
	public static boolean containsDuplicate(int[] nums) {

		HashSet<Integer> uniqueElements = new HashSet<Integer>();

		for (int num : nums) {
			if (!uniqueElements.add(num)) {
				return true;
			}
		}

		return false;
	}

	// approach 2
	public static boolean containsDuplicates(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}

		return false;
	}
}
