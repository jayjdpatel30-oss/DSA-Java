package Problems;

import java.util.Map;
import java.util.TreeMap;

public class P028_find_frequency_in_string {

	// ========================================================================
	// PROBLEM 28: Find Frequencies of Characters
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, find the frequency of each character.
	 *
	 * Example:
	 * Input  : "java"
	 * Output : j=1, a=2, v=1
	 *
	 * Optimal Approach:
	 * 1. Use a HashMap to store character frequencies.
	 * 2. Traverse the string character by character.
	 * 3. Increment count if character exists, otherwise add it.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "java";
		frequencies(text);
		freqCount(text);

	}

	// Using int Array
	private static void frequencies(String text) {

		if (text.isEmpty() || text == null) {
			System.out.println("No characters!");
			return;
		}

		text = text.toLowerCase();

		int[] charCount = new int[26];

		for (char letter : text.toCharArray()) {
			charCount[letter - 'a']++;
		}

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + charCount[i]);
			}
		}

	}

	// Using HashMap
	private static void freqCount(String text) {

		if (text == null || text.isEmpty()) {
			System.out.println("No characters!");
			return;
		}

		Map<Character, Integer> map = new TreeMap<>();
		for (char letter : text.toCharArray()) {
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}

		System.out.println(map);
	}

}
