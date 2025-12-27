package Problems;

public class P018_palindrome_string {

	// ========================================================================
	// PROBLEM 18: Palindrome String
	// ========================================================================
	/*
	 * Given a string, check whether it is a palindrome.
	 *
	 * Example:
	 * Input  : "madam"
	 * Output : true
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		String text = "madam";
		System.out.println(text + " is :" + (isPalindrome(text) ? "" : " not") + " palindrome.");
		System.out.println(text + " is :" + (palindrome(text) ? "" : " not") + " palindrome.");

	}

	private static boolean isPalindrome(String text) {

		if (text.length() <= 1) {
			return true;
		}

		int left = 0, right = text.length() - 1;

		while (left < right) {

			if (text.charAt(left) != text.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	// using StringBuilder -
	private static boolean palindrome(String text) {
		return text.equals(new StringBuilder(text).reverse().toString());
	}

}
