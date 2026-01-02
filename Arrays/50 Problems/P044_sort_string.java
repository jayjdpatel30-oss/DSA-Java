package Problems;

import java.util.Arrays;

public class P044_sort_string {

	// ========================================================================
	// PROBLEM 44: Sort String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, sort its characters in ascending order.
	 *
	 * Example:
	 * Input  : "dcba"
	 * Output : "abcd"
	 *
	 * Optimal Approach:
	 * 1. Convert the string into a character array.
	 * 2. Use Arrays.sort() to sort the array.
	 * 3. Convert the sorted array back to string.
	 *
	 * Time Complexity:
	 * O(n log n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "dcba";
		System.out.println(sort(text));
	}

	private static String sort(String text) {

		char[] words = text.toCharArray();
		Arrays.sort(words);
		
		return new String(words);
	}

}
