package Problems;

public class P019_count_characters {

	// ========================================================================
	// PROBLEM 19: Count Characters in String
	// ========================================================================
	/*
	 * Given a string, count the number of characters (excluding spaces).
	 *
	 * Example:
	 * Input  : "java dsa"
	 * Output : 7
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

		String text = "java dsa";

		System.out.println("Characters in strings are : " + countCharacters(text));
	}

	private static int countCharacters(String text) {

		if (text.length() < 1) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ') {
				continue;
			}
			count++;
		}

		return count;
	}

}
