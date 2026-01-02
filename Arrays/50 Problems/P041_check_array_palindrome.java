package Problems;

import String.reverseString;

public class P041_check_array_palindrome {

	// ========================================================================
	// PROBLEM 41: Check Array Palindrome
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given an integer array, check whether it is a palindrome.
	 *
	 * Example:
	 * Input  : [1, 2, 3, 2, 1]
	 * Output : Palindrome
	 *
	 * Optimal Approach:
	 * 1. Use two pointers: one from start and one from end.
	 * 2. Compare elements at both pointers.
	 * 3. If mismatch occurs, array is not a palindrome.
	 * 4. If all elements match, array is a palindrome.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 2, 1 };
		System.out.println((checkArray(numbers) ? "Palindrome" : "Not Palindrome"));
	}

	private static boolean checkArray(int[] numbers) {

		if (numbers.length <= 1) {
			return true;
		}

		int left = 0, right = numbers.length-1;
		
		while(left < right) {
			
			if(numbers[left] != numbers[right]) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

}
