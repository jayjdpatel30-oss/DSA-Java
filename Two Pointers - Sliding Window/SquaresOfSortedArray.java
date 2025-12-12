package TwoPointers_SlidingWindow;

import java.util.Arrays;

public class SquaresOfSortedArray {

	// ========================================================================
	// PROBLEM 4: Squares of a Sorted Array
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums sorted in non-decreasing
	 * order, return an array of the squares of each number sorted in non-decreasing
	 * order.
	 * 
	 * Example: Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation:
	 * After squaring: [16,1,0,9,100]. After sorting: [0,1,9,16,100].
	 * 
	 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
	 */

	/**
	 * Approach: Two pointers from both ends (OPTIMAL): - Since input is sorted,
	 * largest absolute values are at ends - Use two pointers: left at start, right
	 * at end - Compare absolute values, place larger square at end of result - Move
	 * corresponding pointer inward - Fill result array from right to left
	 * 
	 * Key insight: Negative numbers squared can be large! Think about the parabola
	 * shape when you square numbers.
	 * 
	 * Alternative: Square all elements and sort - O(n log n)
	 * 
	 * Time Complexity: O(n) - single pass with two pointers Space Complexity: O(n)
	 * - result array (O(1) if we don't count output)
	 */

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(squares(nums)));
//		System.out.println(Arrays.toString(squaresSort(nums)));

	}
	
	private static int[] squares(int[] nums) {
		int[] result = new int[nums.length];

		int left = 0, right = nums.length - 1;
		int index = right;

		while (left <= right) {

			int leftElementSquare = nums[left] * nums[left];
			int rightElementSquare = nums[right] * nums[right];

			if (leftElementSquare > rightElementSquare) {
				result[index--] = leftElementSquare;
				left++;
			} else {
				result[index--] = rightElementSquare;
				right--;
			}

		}
		
		return result;
	}
	
	private static int[] squaresSort(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (nums[i] * nums[i]);
		}
		
		Arrays.sort(nums);
		
		return nums;
		
	}


}
