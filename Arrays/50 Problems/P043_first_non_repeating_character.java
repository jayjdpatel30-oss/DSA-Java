package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class P043_first_non_repeating_character {

	// ========================================================================
	// PROBLEM 43: Find First Non Repeating Character
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, find the first non-repeating character.
	 *
	 * Example:
	 * Input  : "swiss"
	 * Output : w
	 *
	 * Optimal Approach:
	 * 1. Use LinkedHashMap to maintain insertion order.
	 * 2. Store frequency of each character.
	 * 3. Traverse the map and find the first character
	 *    with frequency equal to 1.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "swiss";
		System.out.println(non_repeating(text));
	}

	private static char non_repeating(String text) {

		char[] words = text.toCharArray();

		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char letter : words) {
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}

		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				return key;
			}
		}

		return ' ';
	}

}
