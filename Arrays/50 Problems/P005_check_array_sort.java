package Problems;

import java.lang.reflect.Array;

public class P005_check_array_sort {

	// ========================================================================
	// PROBLEM 5: Check Array is Sorted
	// ========================================================================
	/**
	 * Given an integer array, check whether it is sorted in ascending order.
	 *
	 * Example: Input : [2, 4, 6, 8] Output : true
	 *
	 * Input : [3, 1, 4] Output : false
	 *
	 * * Approach:
	 * 1. Traverse the array from index 1 to end.
	 * 2. Compare current element with the previous one.
	 * 3. If any element is smaller than the previous, return false.
	 * 4. If traversal completes, return true.
	 *
	 * Time Complexity: O(n) — single traversal.
	 *
	 * Space Complexity: O(1) — constant extra space.
	 */

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 6, 8 };
		System.out.println("Array is sorted? : " + ((isSorted(numbers)) ? "Yes" : "No"));
	}

	private static boolean isSorted(int[] numbers) {

		if (numbers.length <= 1) {
			return true;
		}

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < numbers[i - 1]) {
				return false;
			}
		}

		return true;
	}

}
