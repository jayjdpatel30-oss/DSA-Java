package ArrayEasy;

import java.util.Arrays;

public class CountEvenOdd {

	// ========================================================================
	// PROBLEM 5: Count Even and Odd Numbers
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, count and return the number
	 * of even and odd numbers in the array.
	 * 
	 * Example: Input: nums = [1, 2, 3, 4, 5, 6] Output: Even: 3, Odd: 3
	 */

	/**
	 * Approach 1 (Single Pass): Iterate through the array once and count even and
	 * odd numbers using modulo operator.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only storing two counters
	 * 
	 * Approach 2 (Using Streams): Use Java streams to filter and count. Time: O(n),
	 * Space: O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 8, 3, 1 };
		int result[] = oddEvenCount(nums);
		System.out.println("Even Count : " + result[0]);
		System.out.println("Odd Count : " + result[1]);

		int res[] = oddEvenCountStream(nums);
		System.out.println("Even Count : " + res[0]);
		System.out.println("Odd Count : " + res[1]);

	}

	// approach 1
	private static int[] oddEvenCount(int[] nums) {

		if (nums.length == 0) {
			return null;
		}

		int evenCount = 0, oddCount = 0;

		for (int num : nums) {

			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		return new int[] { evenCount, oddCount };
	}

	// approach 2
	private static int[] oddEvenCountStream(int[] nums) {

		if (nums.length == 0) {
			return null;
		}

		int evenCount = (int) Arrays.stream(nums).filter(n -> n % 2 == 0).count();
		int oddCount = (int) Arrays.stream(nums).filter(n -> n % 2 == 1).count();

		return new int[] { evenCount, oddCount };
	}

}
