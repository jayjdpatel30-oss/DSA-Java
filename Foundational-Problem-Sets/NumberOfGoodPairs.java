package Foundation_problems;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class NumberOfGoodPairs {

	/**
	 * Problem Statement: Given an array of integers nums, a pair (i, j) is called
	 * good if nums[i] == nums[j] and i < j. Return the number of good pairs.
	 * 
	 * Input: nums = [1,2,3,1,1,3] Output: 4 Explanation: There are 4 good pairs:
	 * (0,3), (0,4), (3,4), (2,5)
	 * 
	 * Input: nums = [1,1,1,1] Output: 6 Explanation: All pairs are good.
	 * 
	 * Input: nums = [1,2,3] Output: 0
	 * 
	 * Approach: Use a HashMap to count frequency of each number. For each number
	 * with frequency f, the number of pairs is f × (f-1) / 2 (combination formula).
	 * 
	 * Time and Space complexity : 0(n)
	 * 
	 * In another brute force approach Time Complexity : O(n^2) Space complexity :
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1 };

		System.out.println("Good pairs : " + goodPairs(nums));
		System.out.println("Good pairs : " + numIdenticalPairs(nums));
	}

	private static int goodPairs(int[] nums) {

		int goodPairsCount = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					goodPairsCount++;
				}
			}
		}
		return goodPairsCount;
	}

	public static int numIdenticalPairs(int[] nums) {

		HashMap<Integer, Integer> freqTracker = new HashMap<>();
		int frequncies = 0;

		for (int num : nums) {
			int freq = freqTracker.getOrDefault(num, 0);
			frequncies += freq;
			freqTracker.put(num, freqTracker.getOrDefault(num, 0) + 1);
		}

		return frequncies;
	}

}
