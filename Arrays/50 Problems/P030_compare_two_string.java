package Problems;

import java.util.Comparator;

public class P030_compare_two_string implements Comparator<String> {

	// ========================================================================
	// PROBLEM 30: Compare two Strings
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two strings, compare whether they are equal without using equals().
	 *
	 * Example:
	 * Input  : "java", "java"
	 * Output : true
	 *
	 * Optimal Approach:
	 * 1. If lengths differ, strings are not equal.
	 * 2. Compare characters at each index.
	 * 3. If any mismatch occurs, return false.
	 * 4. If all characters match, return true.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */
	
	public static void main(String[] args) {

		String text1 = "abc";
		String text2 = "abc";

		int ans = new P030_compare_two_string().compare(text1, text2);

		// just check is they are same
		System.out.println("Both are same : " + ((text1.equals(text2)) ? "Yes" : "No"));
		System.out.println("Both are same : " + (comparing(text1, text2) ? "Yes" : "No"));	
	}

	@Override
	public int compare(String text1, String text2) {

		if (text1.compareTo(text2) == 0) {
			System.out.println("Both are equal.");
			return 0;
		} else if (text1.compareTo(text2) < 0) {
			System.out.println("text1 is first.");
			return -1;
		} else {
			System.out.println("text2 is first.");
			return 1;
		}
	}

	private static boolean comparing(String text1, String text2) {

		if (text1.length() != text2.length()) {
			return false;
		}

		for (int i = 0; i < text1.length(); i++) {

			if (text1.charAt(i) != text2.charAt(i)) {
				return false;
			}
		}

		return true;
	}

}
