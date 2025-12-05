package Foundation_problems;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {

	/**
	 * Problem Statement: Given the array nums, for each nums[i] find out how many
	 * numbers in the array are smaller than it. That is, for each nums[i] you have
	 * to count the number of valid j's such that j != i and nums[j] < nums[i].
	 * Return the answer in an array.
	 * 
	 * Input: nums = [8,1,2,2,3] Output: [4,0,1,1,3] Explanation: For nums[0]=8: 4
	 * numbers smaller (1,2,2,3) For nums[1]=1: 0 numbers smaller For nums[2]=2: 1
	 * number smaller (1) For nums[3]=2: 1 number smaller (1) For nums[4]=3: 3
	 * numbers smaller (1,2,2)
	 * 
	 * Input: nums = [6,5,4,8] Output: [2,1,0,3]
	 * 
	 * Input: nums = [7,7,7,7] Output: [0,0,0,0]
	 * 
	 * Approach: Method 1 (Brute Force): For each element, count how many elements
	 * are smaller by comparing with all other elements.
	 * 
	 * Method 2 (Optimal - Sorting + HashMap): Sort the array while keeping track of
	 * original indices. Use a map to store the count of smaller numbers for each
	 * unique value.
	 * 
	 * Time Complexity: O(n²) for brute force, O(n) for counting sort Space
	 * Complexity: O(n)
	 * 
	 */

	public static void main(String[] args) {

		int nums[] = { 8, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(smallerNumber(nums)));

		System.out.println(Arrays.toString(smallerNumberHashMap(nums)));

	}

	private static int[] smallerNumber(int[] nums) {

		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j] && i != j) {
					count++;
				}
			}

			result[i] = count;
		}

		return result;
	}

	// using hashmap
	private static int[] smallerNumberHashMap(int[] nums) {

		Arrays.sort(nums);
		int[] result = new int[nums.length];
		System.out.println(Arrays.toString(nums));

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.putIfAbsent(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = map.get(nums[i]);
		}

		return result;

	}

}
