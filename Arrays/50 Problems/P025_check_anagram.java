package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class P025_check_anagram {

	// ========================================================================
	// PROBLEM 25: Check Anagram
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two strings, check whether they are anagrams.
	 * Anagrams contain the same characters with the same frequency.
	 *
	 * Example:
	 * Input  : "listen", "silent"
	 * Output : true
	 *
	 * Optimal Approach:
	 * 1. If lengths of both strings are different, they cannot be anagrams.
	 * 2. Create an HashMap to store frequencies of each letters
	 * 3. Increment frequency for characters in first string.
	 * 4. Decrement frequency for characters in second string.
	 * 5. If all values in frequency array are zero, strings are anagrams.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1) — In worse case 26 keys.
	 */
	
	
	public static void main(String[] args) {

		String text1 = "listen";
		String text2 = "silent";

		System.out.println("Strings are " + (isAnagram(text1, text2) ? "" : "not ") + "anagram.");
		System.out.println("Strings are " + (anagram(text1, text2) ? "" : "not ") + "anagram.");
		System.out.println("Strings are " + (isAnagramString(text1, text2) ? "" : "not ") + "anagram.");
	}

	private static boolean isAnagram(String text1, String text2) {

		if (text1.length() != text2.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (char letter : text1.toCharArray()) {
			map.put(letter, map.getOrDefault(letter, 0) + 1);
		}

		for (char letter : text2.toCharArray()) {
			map.put(letter, map.getOrDefault(letter, 0) - 1);
		}
		
		for(char key : map.keySet()) {
			if(map.get(key) != 0) {
				return false;
			}
		}

		return true;
	}
	
	//Using sorting
	private static boolean anagram(String text1, String text2) {
		
		if(text1.length() != text2.length()) {
			return false;
		}
		
		char[] Arr1 = text1.toCharArray();
		char[] Arr2 = text2.toCharArray();
		
		Arrays.sort(Arr1);
		Arrays.sort(Arr2);
		
		return Arrays.equals(Arr1, Arr2);
	}

	
	//use int array
	private static boolean isAnagramString(String text1, String text2) {
		if (text1.length() != text2.length()) {
			return false;
		}
		
		text1 = text1.toLowerCase();
		text2 = text2.toLowerCase();
		
		int[] freq = new int[26];
		
		for(char letter : text1.toCharArray()) {
			freq[letter - 'a']++;
		}
		
		for(char letter : text2.toCharArray()) {
			freq[letter - 'a']--;
		}
		
		for(int val : freq) {
			if(val != 0) {
				return false;
			}
		}
		
		return true;
	}

}
