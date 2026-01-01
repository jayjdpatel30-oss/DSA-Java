package Problems;

public class P040_count_special_characters {

	// ========================================================================
	// PROBLEM 40: Count Special Characters
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, count the number of special characters.
	 * Special characters are those which are not letters or digits.
	 *
	 * Example:
	 * Input  : "java@123#"
	 * Output : 2
	 *
	 * Optimal Approach:
	 * 1. Traverse the string character by character.
	 * 2. Check if the character is NOT a letter and NOT a digit.
	 * 3. If true, increment the counter.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		String text = "java@123#";
		System.out.println("Total special characters are : " + specialCharacterCount(text));
	}

	private static int specialCharacterCount(String text) {

		if (text.length() == 0) {
			return 0;
		}

		int count = 0;

		for (char letter : text.toCharArray()) {
			if (!Character.isLetterOrDigit(letter)) {
				count++;
			}
		}

		return count;
	}

}
