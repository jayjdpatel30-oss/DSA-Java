package Foundation_problems;

import java.util.Arrays;

public class RunningSumOf1DArray {

	/**
	 * Running Sum of 1D Array Problem Statement: Given an array nums, the running
	 * sum is defined as runningSum[i] = sum(nums[0]…nums[i]). Return the running
	 * sum of nums.
	 * 
	 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is [1,
	 * 1+2, 1+2+3, 1+2+3+4]
	 * 
	 * Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5]
	 * 
	 * Input: nums = [3,1,2,10,1] Output: [3,4,6,16,17]
	 * 
	 * Approach: Simple iteration where each element becomes the sum of itself and
	 * all previous elements. We can modify the array in-place or use a new array.
	 * 
	 * Time Complexity: O(n) Space Complexity: O(1) - In-place modification
	 */

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(nums)));

	}

	private static int[] runningSum(int[] nums) {

//		int sum = 0;

		for (int i = 1; i < nums.length; i++) {
//			nums[i] += sum;
//			sum = nums[i];

			nums[i] += nums[i - 1];
		}

		return nums;
	}
}
