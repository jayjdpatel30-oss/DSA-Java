package Problems;

import java.util.Arrays;

public class P004_reverse_array {

	// ========================================================================
	// PROBLEM 4: Reverse an Array.
	// ========================================================================
	/**
	 * Given an integer array, reverse the array in place.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4, 5]
	 * Output : [5, 4, 3, 2, 1]
	 *
	 * Approach:
	 * 1. Use two pointers: one at the start and one at the end.
	 * 2. Swap elements at both pointers.
	 * 3. Move start forward and end backward.
	 * 4. Continue until pointers meet.
	 *
	 * Time Complexity:
	 * O(n) — each element is swapped once.
	 *
	 * Space Complexity:
	 * O(1) — reversal is done in place.
	 */

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println("Array : " + Arrays.toString(numbers));
		reverse(numbers);
		System.out.println("Reversed Array : " + Arrays.toString(numbers));
	}

	private static void reverse(int[] numbers) {

		if (numbers.length <= 1) {
			return;
		}

		int left = 0, right = numbers.length - 1;

		while (left < right) {

			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;

			left++;
			right--;
		}
	}

}
