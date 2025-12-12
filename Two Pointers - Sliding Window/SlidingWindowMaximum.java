package TwoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import Arrays.MaximumSubArray;

public class SlidingWindowMaximum {

	// ========================================================================
	// PROBLEM 5: Sliding Window Maximum (Easy Version)
	// ========================================================================
	/**
	 * Problem Statement: You are given an array of integers nums, and there is a
	 * sliding window of size k which is moving from the very left to the very
	 * right. You can only see the k numbers in the window. Return the max sliding
	 * window.
	 * 
	 * Example: Input: nums = [1,3,-1,-3,5,3,6,7], k = 3 Output: [3,3,5,5,6,7]
	 * Explanation: Window position Max --------------- ----- [1 3 -1] -3 5 3 6 7 3
	 * 1 [3 -1 -3] 5 3 6 7 3 1 3 [-1 -3 5] 3 6 7 5 1 3 -1 [-3 5 3] 6 7 5 1 3 -1 -3
	 * [5 3 6] 7 6 1 3 -1 -3 5 [3 6 7] 7
	 */

	/**
	 * Approach 1 (Simple/Easy - Used below): Brute force with optimization: - For
	 * each window, find maximum - Use simple loop to find max in window - Time: O(n
	 * * k), but works well for small k
	 * 
	 * Approach 2 (Optimal - Deque): Use monotonic decreasing deque: - Store indices
	 * in deque in decreasing order of values - Front of deque always has maximum -
	 * Time: O(n), Space: O(k)
	 * 
	 * Time Complexity: O(n * k) - for each window, find max Space Complexity:
	 * O(n-k+1) - result array (output space)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

	}

	private static int[] maxWindow(int[] nums, int k) {

		int[] result = new int[nums.length - k + 1];

		for (int i = 0; i < nums.length - k + 1; i++) {

			int max = nums[i];

			for (int j = i; j < i + k; j++) {
				if (nums[j] > max) {
					max = nums[j];
				}
			}
			result[i] = max;
		}

		return result;
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {

		int n = nums.length;
		int[] result = new int[n - k + 1];

		Deque<Integer> dq = new LinkedList();

		for (int i = 0; i < n; i++) {

			if (!dq.isEmpty() && dq.peekFirst() == i - k) {
				dq.pollFirst();
			}

			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
				dq.pollLast();
			}

			dq.offer(i);

			if (i >= k - 1) {
				result[i - k + 1] = nums[dq.peekFirst()];
			}

		}

		return result;
	}

}
