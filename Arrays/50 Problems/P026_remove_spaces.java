package Problems;

public class P026_remove_spaces {

	// ========================================================================
	// PROBLEM 26: Remove Spaces from String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, remove all spaces from it.
	 *
	 * Example:
	 * Input  : "java dsa easy"
	 * Output : "javadsaeasy"
	 *
	 * Optimal Approach:
	 * 1. Use a StringBuilder to efficiently build the result.
	 * 2. Traverse each character of the string.
	 * 3. Append the character to StringBuilder only if it is not a space.
	 * 4. Convert StringBuilder to String and return.
	 *
	 * Time Complexity:
	 * O(n) — single traversal of the string.
	 *
	 * Space Complexity:
	 * O(n) — space for the new string.
	 */
	
	public static void main(String[] args) {

		String text = "I am a boy";
		System.out.println("Text without spaces : " + removeSpaces(text));
	}

	private static String removeSpaces(String text) {

		if (text == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				sb.append(text.charAt(i));
			}
		}
		return sb.toString();
	}

}
