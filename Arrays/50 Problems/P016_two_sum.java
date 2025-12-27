package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class P016_two_sum {

	// ========================================================================
	// PROBLEM 16: Two Sum Problem
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array and a target value, find two indices such that
	 * their elements add up to the target.
	 *
	 * Example:
	 * Input  : [2, 7, 11, 15], target = 9
	 * Output : [0, 1]
	 *
	 * Approach:
	 * 1. Use a HashMap to store element and its index.
	 * 2. For each element, calculate complement (target - current).
	 * 3. If complement exists in map, return indices.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	private static int[] twoSum(int[] nums, int target) {

		if (nums.length <= 1) {
			return new int[] {};
		}

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}

		return new int[] {};
	}

}
