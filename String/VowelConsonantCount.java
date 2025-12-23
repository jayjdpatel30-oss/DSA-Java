package String;

public class VowelConsonantCount {

	// ========================================================================
	// PROBLEM 5: Count Vowels and Consonants
	// ========================================================================
	/**
	 * Problem Statement: Count vowels and consonants in a string.
	 * 
	 * Example: Input: "hello" Output: Vowels = 2, Consonants = 3
	 */

	/**
	 * Approach:
	 * Traverse string and check characters.
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	
	public static void main(String[] args) {

		String text = "hello";

		vowelConstCount(text);

	}

	private static void vowelConstCount(String text) {

		if (text.isEmpty()) {
			System.out.println("Empty text!");
			return;
		}

		int vowelCount = 0;
		int ConsonantsCount = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isLetter(text.charAt(i))) {

				char letter = text.charAt(i);

				switch (letter) {

				case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> vowelCount++;
				default -> ConsonantsCount++;
				}

			}
		}

		System.out.println("Vowel count : " + vowelCount);
		System.out.println("Consonants count : " + ConsonantsCount);

	}

}
