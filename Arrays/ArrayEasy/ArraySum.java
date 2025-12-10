package ArrayEasy;

public class ArraySum {

	// ========================================================================
	// PROBLEM 3: Find Sum of Array Elements
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, calculate and return the sum
	 * of all elements in the array.
	 * 
	 * Example: Input: nums = [1, 2, 3, 4, 5] Output: 15
	 */

	/**
	 * Approach 1 (Iterative): Use a loop to iterate through the array and add each
	 * number in the sum.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only storing sum variable
	 * 
	 * Approach 2 (Recursive): Use recursion to calculate the sum. Time: O(n),
	 * Space: O(n) due to recursion stack
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of the array is : " + sum(nums));
		System.out.println("Sum of the array is : " + sumRecursive(nums, 0));

	}

	// approach 1
	private static int sum(int nums[]) {

		if (nums.length == 0) {
			return 0;
		}

		int sum = 0;

		for (int num : nums) {
			sum += num;
		}

		return sum;
	}

	// approach 2
	private static int sumRecursive(int[] nums, int index) {

		if (index == nums.length) {
			return 0;
		}

		return nums[index] + sumRecursive(nums, index + 1);
	}

}
