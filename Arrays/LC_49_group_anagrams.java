package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC_49_group_anagrams {
	
	// ========================================================================
    // LeetCode 49: Group Anagrams
    // ========================================================================
    /**
     * Problem Statement:
     * Given an array of strings strs, group the anagrams together. 
     * You can return the answer in any order.
     * An Anagram is a word or phrase formed by rearranging the letters of 
     * a different word or phrase, using all the original letters exactly once.
     * 
     * Example 1:
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * 
     * Example 2:
     * Input: strs = [""]
     * Output: [[""]]
     * 
     * Example 3:
     * Input: strs = ["a"]
     * Output: [["a"]]
     * 
     * Constraints:
     * - 1 <= strs.length <= 10^4
     * - 0 <= strs[i].length <= 100
     * - strs[i] consists of lowercase English letters
     *
     * Approach : Sorted String as Key
     * - Sort each string, use as HashMap key
     * - Time: O(n × k log k) where k = max string length
     * 
     * Time Complexity: O(n × k) where n = number of strings, k = max length
     * Space Complexity: O(n × k) for HashMap
     */
	
	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(strs);
	}

	private static void groupAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();

		if (strs.length == 0) {
			System.out.println(result);
			return;
		}

		HashMap<String, List<String>> groups = new HashMap<String, List<String>>();

		for (String str : strs) {

			char[] charArray = str.toCharArray();

			Arrays.sort(charArray);

			String sortedKey = new String(charArray);

			if (groups.containsKey(sortedKey)) {
				groups.get(sortedKey).add(str);
			} else {
				groups.put(sortedKey, new ArrayList<>(Arrays.asList(str)));
			}

		}

		for (String key : groups.keySet()) {
			List<String> list = groups.get(key);
			result.add(list);
		}

		System.out.println(result);
	}

}

// Output :
// [[eat, tea, ate], [bat], [tan, nat]]

