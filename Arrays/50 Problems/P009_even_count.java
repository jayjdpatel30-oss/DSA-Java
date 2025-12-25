package Problems;

public class P009_even_count {

	// ========================================================================
	// PROBLEM 9: Count Even numbers
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, count how many elements are even.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4, 6]
	 * Output : 3
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */
	
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 6 };
		System.out.println("Total Even numbers : " + evenCount(nums));

	}

	private static int evenCount(int[] nums) {

		if (nums.length < 1) {
			return 0;
		}

		int evenCount = 0;

		for (int val : nums) {
			if (val % 2 == 0) {
				evenCount++;
			}
		}

		return evenCount;
	}

}
