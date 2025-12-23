package String;

import java.util.HashMap;

public class DuplicateCharacters {

	// ========================================================================
	// PROBLEM 7: Find Duplicate Characters
	// ========================================================================
	/**
	 * Problem Statement: Print duplicate characters from a string.
	 * 
	 * Example: Input: "programming" Output: r, g, m
	 */

	/**
	 * Approach: Use HashMap to count frequency.
	 * 
	 * Use int array to track frequency of each characters
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n)
	 */

	public static void main(String[] args) {

		String text = "programming";
		duplicatesInString(text);

		System.out.println();

		duplicates(text);
	}

	private static void duplicatesInString(String text) {

		if (text.isEmpty()) {
			System.out.println("Empty text!");
			return;
		}

		int[] charFreq = new int[26];

		for (int i = 0; i < text.length(); i++) {
			charFreq[text.charAt(i) - 'a']++;
		}

		for (int i = 0; i < charFreq.length; i++) {
			if (charFreq[i] > 1) {
				System.out.print((char) ('a' + i) + " ");
			}
		}
	}

	// Using HahMap
	private static void duplicates(String text) {

		if (text.length() < 1) {
			System.out.println("No duplicates");
			return;
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
		}

		for (char key : map.keySet()) {

			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}

		}
	}

}

