package Problems;

public class P008_second_largest_element {

	// ========================================================================
	// PROBLEM 8: Second Largest element in Array
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, find the second largest element.
	 *
	 * Example:
	 * Input  : [10, 5, 20, 8]
	 * Output : 10
	 *
	 * Approach:
	 * 1. Maintain two variables: largest and secondLargest.
	 * 2. Traverse the array once.
	 * 3. Update values accordingly.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */


	public static void main(String[] args) {

//		int[] numbers = { 7, 7, 7, 7, 7 };
		int[] numbers = { 10, 5, 20, 8 };
		System.out.println("Second largest element is : " + secondLargest(numbers));

	}

	private static int secondLargest(int[] nums) {

		if (nums.length <= 1) {
			return -1;
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int val : nums) {

			if (val > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = val;
			} else if (val > secondLargest && val != firstLargest) {
				secondLargest = val;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("All are same values.\nNo second largest!");
		}

		return secondLargest;
	}

}
