package Foundation_problems;

import java.util.Arrays;

public class ConcatenationOfArray {

	/**
	 * Problem Statement: Given an integer array nums of length n, you want to
	 * create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] ==
	 * nums[i] for 0 <= i < n (0-indexed). Specifically, ans is the concatenation of
	 * two nums arrays. Return the array ans.
	 * 
	 * Input: nums = [1,2,1] Output: [1,2,1,1,2,1] Explanation: The array ans is
	 * formed as [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]].
	 * 
	 * Input: nums = [1,3,2,1] Output: [1,3,2,1,1,3,2,1]
	 * 
	 * Input: nums = [1,2] Output: [1,2,1,2]
	 * 
	 * Approach: Create a new array of size 2n. Copy the original array twice into
	 * the result array - once at the beginning and once at position n
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n) - Result array
	 */

	public static void main(String[] args) {

		int nums[] = { 1, 3, 2, 1 };
		System.out.println("Concated Array : " + Arrays.toString(concatenatation(nums)));
	}

	private static int[] concatenatation(int[] nums) {

		int[] result = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i];
			result[nums.length + i] = nums[i];
		}

		return result;
	}
}
