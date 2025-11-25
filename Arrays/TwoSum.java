```java

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	// ========================================================================
	// PROBLEM 1: Two Sum
	// ========================================================================
	/**
	 * Problem Statement: Given an array of integers nums and an integer target,
	 * return indices of the two numbers such that they add up to target. You may
	 * assume that each input would have exactly one solution, and you may not use
	 * the same element twice.
	 * 
	 * Example: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
	 * Because nums[0] + nums[1] == 9, we return [0, 1].
	 */

	/**
	 * Approach: Used a HashMap to store each number and its index as we iterate
	 * through the array. For each element, check if (target - current element)
	 * exists in the HashMap. If it does, we found our pair. If not, add current
	 * element to HashMap.
	 * 
	 * Time Complexity: O(n) - single pass through array. Space Complexity: O(n) -
	 * HashMap to store elements
	 */

	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 19;

		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			// if complement is not in HashMap than add current value with its index
			map.put(nums[i], i);
		}

		return new int[] {};
	}

}
```
