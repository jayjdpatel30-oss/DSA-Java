package Problems;

public class P027_find_length_of_string {

	// ========================================================================
	// PROBLEM 27: Find Length of String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, find its length without using the built-in length() method.
	 *
	 * Example:
	 * Input  : "java"
	 * Output : 4
	 *
	 * Optimal Approach:
	 * 1. Convert the string to a character array.
	 * 2. Traverse the array and increment a counter.
	 * 3. Return the counter value.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */
	
	public static void main(String[] args) {

		String text = "i am a boy";
		System.out.println("Length of String is : " + text.length());
		System.out.println("Length of String is : " + length(text));
		System.out.println("Length of String is : " + strLength(text));
	}

	// Using While Loop
	private static int length(String text) {

		if (text == null) {
			return 0;
		}

		int length = 0;
		try {
			char letter = text.charAt(length);
			while (true) {
				length++;
				letter = text.charAt(length);
			}
		} catch (Exception e) {
		}

		return length;
	}

	// Using Character Array
	private static int strLength(String text) {

		if (text == null) {
			return 0;
		}

		char[] letters = text.toCharArray();

		int length = 0;

		for (char letter : letters) {
			length++;
		}

		return length;
	}

}
