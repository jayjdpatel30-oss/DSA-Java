package String;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

	// ========================================================================
	// PROBLEM 1: Valid Anagram
	// ========================================================================
	/**
	 * Problem Statement: Given two strings s and t, return true if t is an anagram
	 * of s, and false otherwise. An Anagram is a word or phrase formed by
	 * rearranging the letters of a different word or phrase, using all the original
	 * letters exactly once.
	 * 
	 * Example: Input: s = "anagram", t = "nagaram" Output: true
	 * 
	 * Input: s = "rat", t = "car" Output: false
	 */

	/**
	 * Approach: Method 1 (Used below): Use a frequency counter (HashMap or array).
	 * - Count frequency of each character in both strings - If frequencies match,
	 * strings are anagrams
	 * 
	 * Method 2 (Alternative): Sort both strings and compare. - Time: O(n log n),
	 * Space: O(n)
	 * 
	 * Time Complexity: O(n) - iterate through both strings once Space Complexity:
	 * O(1) - array of size 26 for lowercase English letters
	 */

	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";

		System.out.println("Is Anagram? : " + (isAnagram(s, t) ? "Yes" : "No"));
		System.out.println("Is Anagram? : " + (isAnagramHashMap(s, t) ? "Yes" : "No"));
		System.out.println("Is Anagram? : " + (isAnagramSort(s, t) ? "Yes" : "No"));
	}

	// Approach : using int array to store frequency of each letters
	// to get in array index manner we do minus 'a' = -92

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int[] charCount = new int[26];

		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i) - 'a']++;
			charCount[t.charAt(i) - 'a']--;
		}

		for (int val : charCount) {
			if (val != 0) {
				return false;
			}
		}

		return true;
	}

	// Approach : hashmap to store freq we add while trversing s and reduce while
	// trversing t. if any freq is not 0 then its not anagram!
	public static boolean isAnagramHashMap(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
		}

		for (char letter : map.keySet()) {
			if (map.get(letter) != 0) {
				return false;
			}
		}
		return true;
	}

	// Approach sort and compare
	public static boolean isAnagramSort(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		Arrays.sort(sArray);
		Arrays.sort(tArray);

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] != tArray[i]) {
				return false;
			}
		}

		return true;
	}
}
