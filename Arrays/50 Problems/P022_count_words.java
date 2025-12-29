package Problems;

public class P022_count_words {

	// ========================================================================
	// PROBLEM 22: Count Words in String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, count the number of words present in it.
	 * Words are separated by one or more spaces.
	 *
	 * Example:
	 * Input  : "java is easy"
	 * Output : 3
	 *
	 * Optimal Approach:
	 * 1. Trim the string to remove leading and trailing spaces.
	 * 2. Split the string using one or more spaces as delimiter.
	 * 3. The length of the resulting array gives the word count.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n) — space used by split array.
	 */
	
	public static void main(String[] args) {

		String text = "Hey! How you doing!";
		System.out.println("Total words : " + totalWords(text));
		System.out.println("Total words : " + totalWordsCount(text));
	}

	private static int totalWords(String text) {

		if (text == null) {
			return 0;
		}

		text = text.trim();

		String[] words = text.split(" ");

		return words.length;
	}

	private static int totalWordsCount(String text) {

		if (text == null) {
			return 0;
		}

		text = text.trim();

		int wordCount = 1;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}

		return wordCount;
	}

}
