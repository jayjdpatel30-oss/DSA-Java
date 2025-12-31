package Problems;

import java.util.Arrays;

public class P031_bubble_sort {

	// ========================================================================
	// PROBLEM 31: Bubble Sort
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, sort the array using Bubble Sort.
	 *
	 * Example:
	 * Input  : [5, 1, 4, 2]
	 * Output : [1, 2, 4, 5]
	 *
	 * Optimal Approach:
	 * 1. Traverse the array multiple times.
	 * 2. In each pass, compare adjacent elements.
	 * 3. Swap them if they are in the wrong order.
	 * 4. After each pass, the largest element moves to the end.
	 * 5. Stop early if no swaps occur in a pass (optimization).
	 *
	 * Time Complexity:
	 * Best Case    : O(n)   (already sorted)
	 * Average Case : O(n²)
	 * Worst Case   : O(n²)
	 *
	 * Space Complexity:
	 * O(1) — in-place sorting.
	 */
	
	public static void main(String[] args) {

		int[] nums = { 5, 1, 4, 2 };
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void bubbleSort(int[] nums) {

		if (nums.length <= 1) {
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			// Boolean for optimization : If no swap happens in pass break or return
			boolean isSwapped = false;

			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {

					isSwapped = true;

					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}

			if (!isSwapped) {
				break;
			}
		}
	}

}
