package Foundation_problems;

public class CountWithOneGreater {

	// ========================================================================
	// PROBLEM : Count Elements With Exactly One Greater Element
	// ========================================================================
	/**
	 * Approach:
	 * Find max number.
	 * Find second max number.
	 * Now count how many second max numbers are!
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 3, 4 };
		System.out.println(count(arr));
	}

	private static int count(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int num : arr) {
			max = Math.max(max, num);
		}

		int secondMax = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num != max)
				secondMax = Math.max(secondMax, num);
		}

		int count = 0;
		for (int num : arr) {
			if (num == secondMax)
				count++;
		}

		return count;
	}
}
