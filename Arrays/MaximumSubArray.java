```java

public class MaximumSubArray {

	// ========================================================================
	// PROBLEM 3: Maximum Subarray (Kadane's Algorithm)
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, find the subarray with the
	 * largest sum, and return its sum.
	 * 
	 * Example: Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The
	 * subarray [4,-1,2,1] has the largest sum = 6.
	 */

	/**
	 * Approach: Use Kadane's Algorithm - a dynamic programming approach. Maintain
	 * currentSum which is the max sum ending at current position. At each element,
	 * decide: start fresh from current element OR extend previous subarray. Keep
	 * track of the maximum sum seen so far.
	 * 
	 * Intuition: If currentSum becomes negative, it won't help future elements, so
	 * we reset it to 0 (start fresh).
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using two variables
	 */

	public static void main(String[] args) {
		System.out.println("Max sub Array sum : " + maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	public static int maxSubArray(int[] nums) {

		if (nums == null || nums.length < 0) {
			return 0;
		}

		int currentSum = 0;
		int maxSum = 0;

		for (int num : nums) {

			currentSum = Math.max(num, num + currentSum);

			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

}
```
