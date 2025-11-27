package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

	// ========================================================================
	// PROBLEM 5: First Unique Character in a String
	// ========================================================================
	/**
	 * Problem Statement: Given a string s, find the first non-repeating character
	 * in it and return its index. If it does not exist, return -1.
	 * 
	 * Example: Input: s = "leetcode" Output: 0 Explanation: 'l' is the first
	 * character that appears only once.
	 * 
	 * Input: s = "loveleetcode" Output: 2 Explanation: 'v' is the first unique
	 * character at index 2.
	 * 
	 * Input: s = "aabb" Output: -1
	 */

	/**
	 * Approach: Two-pass solution using frequency counter: - First pass: Count
	 * frequency of each character - Second pass: Find first character with
	 * frequency 1
	 * 
	 * We use an array of size 26 for lowercase English letters, which is more
	 * efficient than HashMap for this specific case.
	 * 
	 * Time Complexity: O(n) - two passes through the string Space Complexity: O(1)
	 * - array of constant size 26
	 */
	public static void main(String[] args) {

//		String s = "leetcode";
		String s = "loveleetcodeandv";
		System.out.println("First unique character at index : " + firstUniqChar(s));
		System.out.println("First unique character at index : " + firstUniqCharArr(s));

		System.out.println("Fisrt unique charcter is : " + s.charAt(firstUniqCharArr(s)));
		
		firstUniqCharLinkedhm(s);
	}

	// using int Array
	public static int firstUniqCharArr(String s) {

		int[] charCount = new int[26];

		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {

			if (charCount[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

	// using HashMap
	public static int firstUniqChar(String s) {

		HashMap<Character, Integer> freqCount = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			freqCount.put(s.charAt(i), freqCount.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (freqCount.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}

}

