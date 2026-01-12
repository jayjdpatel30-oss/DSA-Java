package HashMap_Set;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

	// ========================================================================
	// PROBLEM 2: Majority Element
	// ========================================================================
	/**
	 * Problem Statement: Given an array nums of size n, return the majority
	 * element. The majority element is the element that appears more than ⌊n / 2⌋
	 * times. You may assume that the majority element always exists in the array.
	 * 
	 * Example: Input: nums = [3,2,3] Output: 3
	 * 
	 * Input: nums = [2,2,1,1,1,2,2] Output: 2
	 */

	public static void main(String[] args) {

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println("Majority element is : " + majorityElement(nums));

	}

	public static int majorityElementSort(int[] nums) {

		Arrays.sort(nums);

		int middleIndex = nums.length / 2;

		return nums[middleIndex];
	}

	public static int majorityElementHashMap(int[] nums) {

		HashMap<Integer, Integer> freqCount = new HashMap<>();

		for (int num : nums) {
			freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
		}

		// for being majority it should be appear more than half of times.
		int majorityCount = nums.length / 2;

		for (int num : nums) {
			if (freqCount.get(num) > majorityCount) {
				return num;
			}
		}

		return -1;
	}

	public static int majorityElement(int[] nums) {

		// Boyer-Moore Voting Algorithm

		int candidate = nums[0];
		int count = 1;

		for (int num : nums) {

			if (count == 0) {
				candidate = num;
				count = 1;
			} else if (candidate == num) {
				count++;
			} else {
				count--;
			}

		}

		return candidate;

	}

}

