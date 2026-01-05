package Problems;

public class P048_maximum_sum_subarray {

	// ========================================================================
	// PROBLEM 48: Maximum Sum Subarray
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, find the maximum sum of a contiguous subarray.
	 *
	 * Example:
	 * Input  : [-2, 1, -3, 4, -1, 2, 1]
	 * Output : 6  (subarray [4, -1, 2, 1])
	 *
	 * Optimal Approach (Kadane’s Algorithm):
	 * 1. Initialize two variables: currentSum and maxSum.
	 * 2. Add each element to currentSum.
	 * 3. Update maxSum if currentSum is greater.
	 * 4. If currentSum becomes negative, reset it to 0.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1 };

		System.out.println(maxSum(nums));
	}

	private static int maxSum(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int max_sum = 0;
		int current_sum = 0;

//		int start = 0, end = 0;

		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];

//			if (val > current_sum + val) {
//				start = i;
//			}
			
			current_sum = Math.max(val, current_sum + val);

//			if (max_sum < current_sum) {
//				end = i;
//			}
			max_sum = Math.max(max_sum, current_sum);
		}
		
//		System.out.println(start + " " + end);

		return max_sum;
	}

}
