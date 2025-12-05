package Foundation_problems;

public class FindTheDifference {

	/**
	 * Problem Statement: You are given two strings s and t. String t is generated
	 * by random shuffling string s and then add one more letter at a random
	 * position. Return the letter that was added to t.
	 * 
	 * Input: s = "abcd", t = "abcde" Output: "e" Explanation: 'e' is the letter
	 * that was added.
	 * 
	 * Input: s = "", t = "y" Output: "y"
	 * 
	 * Input: s = "a", t = "aa" Output: "a"
	 * 
	 * Input: s = "ae", t = "aea" Output: "a"
	 * 
	 * 
	 * Approach: Method (XOR): XOR all characters in both strings. Duplicate
	 * characters cancel out, leaving only the extra character.
	 * 
	 * Time Complexity: O(n), Space Complexity: O(1) for XOR
	 */

	public static void main(String[] args) {

		String s = "";
		String t = "y";
		System.out.println("The difference is : " + differnce(s, t));

	}

	private static String differnce(String s, String t) {

		for (int i = 0; i < t.length(); i++) {

			if (i == s.length()) {
				return String.valueOf(t.charAt(i));
			}

			if (s.charAt(i) != s.charAt(i)) {
				return String.valueOf(s.charAt(i));
			}
		}

		return null;
	}

	private static String differnceUsingXOR(String s, String t) {

		char diff = 0;

		for (char letter : s.toCharArray()) {
			diff ^= letter;
		}

		for (char letter : t.toCharArray()) {
			diff ^= letter;
		}

		return String.valueOf(diff);

	}

}
