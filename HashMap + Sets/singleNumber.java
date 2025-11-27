package HashMap_Set;

import java.util.HashSet;

public class singleNumber {

	// ========================================================================
	// PROBLEM 3: Single Number
	// ========================================================================
	/**
	 * Problem Statement: Given a non-empty array of integers nums, every element
	 * appears twice except for one. Find that single one. You must implement a
	 * solution with O(n) time and O(1) space complexity.
	 * 
	 * Example: Input: nums = [2,2,1] Output: 1
	 * 
	 * Input: nums = [4,1,2,1,2] Output: 4
	 */

	/**
	 * Approach: Use XOR (Exclusive OR) bit manipulation: - XOR of two same numbers
	 * is 0: a ^ a = 0 - XOR of a number with 0 is the number itself: a ^ 0 = a -
	 * XOR is commutative and associative
	 * 
	 * So if we XOR all numbers: a ^ b ^ a ^ c ^ b = (a ^ a) ^ (b ^ b) ^ c = 0 ^ 0 ^
	 * c = c
	 * 
	 * Alternative: Use HashSet (add if not present, remove if present) - O(n) space
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using one variable
	 */
	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };
//		int[] nums = { 2, 1, 2 };

		System.out.println("Single number is : " + singleNum(nums));

	}

	// using XOR operator
	private static int singleNumber(int[] nums) {

		int result = 0;

		for (int num : nums) {
			result ^= num;
		}

		return result;
	}

	// using HashSet
	private static int singleNum(int[] nums) {

		HashSet<Integer> numSet = new HashSet();

		for (int num : nums) {

			if (numSet.contains(num)) {
				numSet.remove(num);
			} else {

				numSet.add(num);
			}
		}

		int result = 0;
		for (int num : numSet) {
			result = num;
		}

		return result;
	}

}
