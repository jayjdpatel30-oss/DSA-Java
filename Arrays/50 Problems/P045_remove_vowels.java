package Problems;

public class P045_remove_vowels {

	// ========================================================================
	// PROBLEM 45: Remove Vowels from String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, remove all vowels from it.
	 *
	 * Example:
	 * Input  : "education"
	 * Output : "dctn"
	 *
	 * Optimal Approach:
	 * 1. Convert string to lowercase for easy comparison.
	 * 2. Traverse each character.
	 * 3. Append only non-vowel characters to StringBuilder.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "education";
		System.out.println(vowels(text));
	}

	private static String vowels(String text) {

		if (text.length() < 1) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		
		
		text = text.toLowerCase();
		char[] letters = text.toCharArray();
		for(char letter : letters) {
			if ("aeiou".indexOf(letter) == -1) {
				sb.append(letter);
			}
		}
		
		return sb.toString();
	}

}
