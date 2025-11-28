package TwoPointers_SlidingWindow;

import javax.swing.text.PlainDocument;

public class ValidPalindromeII {

	// ========================================================================
	// PROBLEM 1: Valid Palindrome II
	// ========================================================================
	/**
	 * Problem Statement: Given a string s, return true if the s can be palindrome
	 * after deleting at most one character from it.
	 * 
	 * Example: Input: s = "aba" Output: true
	 * 
	 * Input: s = "abca" Output: true Explanation: You could delete the character
	 * 'c'.
	 * 
	 * Input: s = "abc" Output: false
	 */

	/**
	 * Approach: Use two pointers from both ends: 1. Move pointers inward while
	 * characters match 2. When mismatch found, we have ONE deletion chance 3. Try
	 * deleting left character OR right character 4. Check if either resulting
	 * substring is a palindrome
	 * 
	 * Key insight: We can only delete ONE character, so when we find a mismatch, we
	 * must decide which character to skip.
	 * 
	 * Time Complexity: O(n) - worst case we check the string twice Space
	 * Complexity: O(1) - only using pointers
	 */

	public static void main(String[] args) {

		String s = "abdhjfdba";
		System.out.println("Is this palindrome after getting 1 off? : " + (isPalindrome(s) ? "Yes" : "No"));
	}

	private static boolean isPalindrome(String text) {

		int left = 0, right = text.length() - 1;

		while (left < right) {

			if (text.charAt(left) != text.charAt(right)) {
				return palindromeHelper(text, left + 1, right) || palindromeHelper(text, left, right - 1);
			}

			left++;
			right--;
		}

		return true;
	}

	static boolean palindromeHelper(String text, int start, int end) {

		int left = start;
		int right = end;

		while (left < right) {

			if (text.charAt(left) != text.charAt(right)) {
				return false;
			}

			left++;
			right--;

		}
		return true;
	}

}
