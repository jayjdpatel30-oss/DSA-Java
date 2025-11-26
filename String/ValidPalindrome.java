package String;

public class ValidPalindrome {

	// ========================================================================
	// PROBLEM 2: Valid Palindrome
	// ========================================================================
	/**
	 * Problem Statement: A phrase is a palindrome if, after converting all
	 * uppercase letters into lowercase letters and removing all non-alphanumeric
	 * characters, it reads the same forward and backward. Given a string s, return
	 * true if it is a palindrome, or false otherwise.
	 * 
	 * Example: Input: s = "A man, a plan, a canal: Panama" Output: true
	 * Explanation: "amanaplanacanalpanama" is a palindrome.
	 * 
	 * Input: s = "race a car" Output: false
	 */

	/*
	 * Approach: Use two-pointer technique: - Left pointer starts at beginning,
	 * right pointer at end - Skip non-alphanumeric characters - Compare characters
	 * (case-insensitive) - If mismatch found, return false - If pointers meet, it's
	 * a palindrome
	 * 
	 * Time Complexity: O(n) - single pass with two pointers. Space Complexity: O(1)
	 * - only using two pointers
	 */
	public static void main(String[] args) {

		System.out.println("Is Palindrome? : " + (isPalindrome("NAMkAN") ? "Yes" : "No"));

	}

	public static boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}

			left++;
			right--;

		}

		return true;
	}

}
