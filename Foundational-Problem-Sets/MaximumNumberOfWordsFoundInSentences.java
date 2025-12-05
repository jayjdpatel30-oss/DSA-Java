package Foundation_problems;

public class MaximumNumberOfWordsFoundInSentences {

	/**
	 * Problem Statement: A sentence is a list of words that are separated by a
	 * single space with no leading or trailing spaces. You are given an array of
	 * strings sentences, where each sentences[i] represents a single sentence.
	 * Return the maximum number of words that appear in a single sentence.
	 * 
	 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
	 * great thanks very much"] Output: 6 Explanation: First sentence has 5 words,
	 * second has 4, third has 6.
	 * 
	 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
	 * Output: 3
	 * 
	 * Input: sentences = ["one", "two three", "four five six"] Output: 3
	 * 
	 * Approach: For each sentence, split by spaces and count the words. Keep track
	 * of the maximum count found.
	 * 
	 * Time Complexity: O(n × m) where n = sentences, m = avg sentence length Space
	 * Complexity: O(m) - Temporary split array
	 */

	public static void main(String[] args) {

		String[] sentences = { "one", "two three", "four five six" };

		System.out.println("Max words in sentenses are : " + maximumWordsInSenetense(sentences));
		System.out.println("Max words in sentenses are : " + mostWordsFound(sentences));

	}

	private static int maximumWordsInSenetense(String[] sentences) {

		int wordCount = 0;
		for (int i = 0; i < sentences.length; i++) {

			int currentWordCount = 0;

			for (int j = 0; j < sentences[i].length(); j++) {
				if (sentences[i].charAt(j) == ' ') {
					currentWordCount++;
				}
			}

			wordCount = Math.max(wordCount, currentWordCount + 1);
		}

		return wordCount;

	}

	public static int mostWordsFound(String[] sentences) {
		int maxWords = 0;

		for (String sentence : sentences) {
			int wordCount = sentence.split(" ").length;
			maxWords = Math.max(maxWords, wordCount);
		}

		return maxWords;
	}

}
