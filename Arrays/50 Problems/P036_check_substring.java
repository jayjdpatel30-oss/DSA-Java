package Problems;

public class P036_check_substring {

	// ========================================================================
	// PROBLEM 36: Check SubString
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string and a substring, check whether the substring
	 * exists within the given string.
	 *
	 * Example:
	 * Input  : "java programming", substring = "program"
	 * Output : Found
	 *
	 * Optimal Approach:
	 * 1. Use Java's built-in contains() method.
	 * 2. It internally checks for substring occurrence efficiently.
	 * 3. If substring exists, print "Found", else print "Not Found".
	 *
	 * Time Complexity:
	 * O(n * m) — n = length of string, m = length of substring (worst case).
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		String text = "java programming";
		String target = "program";

		System.out.println(target + " exists in " + text + " : " + (text.contains(target) ? "Yes" : "No"));
		System.out.println(target + " exists in " + text + " : " + (containsString(text, target) ? "Yes" : "No"));

	}

	private static boolean containsString(String text, String target) {

		boolean exists = false;

		for (int i = 0; i < text.length() - target.length() + 1; i++) {

			if (text.charAt(i) == target.charAt(0)) {

				for (int j = 0; j < target.length(); j++) {

					if (text.charAt(i + j) != target.charAt(j)) {
						continue;
					}

					if (j == target.length() - 1) {
						return true;
					}
				}

			}

		}
		return exists;
	}

}
