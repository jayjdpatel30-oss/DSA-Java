package Problems;

import java.lang.StringBuilder;

public class P029_replace_character_in_string {

	// ========================================================================
	// PROBLEM 29: Replace Characters in String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, replace all occurrences of a character with another character.
	 *
	 * Example:
	 * Input  : "banana", old = 'a', new = 'o'
	 * Output : "bonono"
	 *
	 * Optimal Approach:
	 * 1. Use StringBuilder for efficient modification.
	 * 2. Traverse each character.
	 * 3. Replace old character with new character.
	 * 4. Append result and return final string.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "banana";
		System.out.println(text.replace('a', 'o'));
		System.out.println(replace(text, 'a', 'o'));
	}

	private static String replace(String text, char old, char rep) {

		if (text == null || text.isEmpty()) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		for (char letter : text.toCharArray()) {
			if (letter == old) {
				sb.append(rep);
			} else {
				sb.append(letter);
			}
		}

		return sb.toString();
	}

}
