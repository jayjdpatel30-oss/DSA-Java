package Problems;

public class P017_reverse_string {

	// ========================================================================
	// PROBLEM 17: Reverse a String
	// ========================================================================
	/*
	 * Problem Statement: 
	 * Given a string, reverse it.
	 *
	 * Example: Input : "java" Output : "avaj"
	 * 
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */
	

	public static void main(String[] args) {

		String text = "java";
		reverse(text);
		rev(text);
		revStr(text);

	}

	private static void reverse(String text) {

		char[] letters = text.toCharArray();

		int left = 0, right = letters.length - 1;

		while (left < right) {

			char letter = letters[left];
			letters[left] = letters[right];
			letters[right] = letter;

			left++;
			right--;
		}

		System.out.println(new String(letters));
	}

	// using StringBuilder -
	private static void rev(String text) {
		System.out.println(new StringBuilder(text).reverse().toString());
	}

	// iterative way
	private static void revStr(String text) {

		if (text.length() <= 1) {
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
