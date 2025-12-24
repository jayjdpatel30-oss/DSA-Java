package Problems;

public class P003_sum_array_elements {

	// ========================================================================
	// PROBLEM 3: Sum of Array Elements...
	// ========================================================================
	/**
	 * Given an integer array, calculate and return the sum of all its elements.
	 *
	 * Example:
	 * Input  : [ 45, 30, 7, 18 ]
	 * Output : 100
	 *
	 * Approach:
	 * 1. Initialize a variable `sum` to 0.
	 * 2. Traverse through the array.
	 * 3. Add each element to `sum`.
	 * 4. Return the final sum.
	 *
	 * Time Complexity:
	 * O(n) — array is traversed once.
	 *
	 * Space Complexity:
	 * O(1) — constant extra space.
	 */

	public static void main(String[] args) {

		int[] numbers = { 45, 30, 7, 18 };
		System.out.println("Sum of array elements : " + sum(numbers));

	}

	private static int sum(int[] numbers) {

		if (numbers.length < 1) {
			return 0;
		}

		int sum = 0;
		for (int val : numbers) {
			sum += val;
		}

		return sum;
	}

}
