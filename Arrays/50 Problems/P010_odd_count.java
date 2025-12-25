package Problems;

public class P010_odd_count {

	// ========================================================================
	// PROBLEM 10: Count Odd numbers
	// ========================================================================
	/*
	 * Problem Statement: Given an integer array, count how many elements are odd.
	 * 
	 * Example:
	 * Input  : [1, 2, 3, 4, 6]
	 * Output : 2
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 6 };
		System.out.println("Total Odd numbers : " + oddCount(nums));

	}

	private static int oddCount(int[] nums) {

		if (nums.length < 1) {
			return 0;
		}

		int oddCount = 0;

		for (int val : nums) {
			if (val % 2 == 1) {
				oddCount++;
			}
		}

		return oddCount;
	}

}
