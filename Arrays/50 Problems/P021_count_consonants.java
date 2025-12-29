package Problems;

public class P021_count_consonants {

	// ========================================================================
	// PROBLEM 21: Count Consonants in String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, count the number of consonants present in it.
	 * Consider only English alphabets and ignore spaces and digits.
	 *
	 * Example:
	 * Input  : "java dsa"
	 * Output : 4
	 *
	 * Optimal Approach:
	 * 1. Convert the string to lowercase to simplify comparison.
	 * 2. Traverse each character of the string.
	 * 3. Check if the character is an alphabet (a–z).
	 * 4. If it is NOT a vowel (a, e, i, o, u), then it is a consonant.
	 * 5. Increment the counter accordingly.
	 *
	 * Time Complexity:
	 * O(n) — single traversal of the string.
	 *
	 * Space Complexity:
	 * O(1) — constant extra space.
	 */
	
	public static void main(String[] args) {

		String text = "java dsa";
		System.out.println("Total consonants : " + consonants(text));
	}

	private static int consonants(String text) {

		if (text == null) {
			return 0;
		}
		
		text = text.toLowerCase();

		int consonatantCount = 0;

		for (int i = 0; i < text.length(); i++) {

			char letter = text.charAt(i);
			if(letter >= 'a' && letter <= 'z') {
				if(letter == 'a' || letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u') {
					continue;
				}else {
					consonatantCount++;
				}
			}
		}

		return consonatantCount;
	}
}
