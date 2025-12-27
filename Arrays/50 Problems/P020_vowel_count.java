package Problems;

public class P020_vowel_count {

	// ========================================================================
	// PROBLEM 20: Count Vowels in String
	// ========================================================================
	/*
	 * Given a string, count the number of vowels.
	 *
	 * Example:
	 * Input  : "education"
	 * Output : 5
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		String text = "education";
		System.out.println("Total vowels : " + vowels(text));
	}

	private static int vowels(String text) {

		if (text.length() < 1) {
			return 0;
		}

		int vowelCount = 0;

		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++) {

			switch (text.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
			}
		}
		
		return vowelCount;
	}

}
