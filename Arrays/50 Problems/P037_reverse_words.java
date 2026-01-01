package Problems;

public class P037_reverse_words {
	
	// ========================================================================
	// PROBLEM 37: Reverse Words in String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, reverse each word in the string
	 * while maintaining the word order.
	 *
	 * Example:
	 * Input  : "java is easy"
	 * Output : "avaj si ysae"
	 *
	 * Optimal Approach:
	 * 1. Split the string into words using space delimiter.
	 * 2. Reverse each word individually.
	 * 3. Append reversed words to result string.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */
	public static void main(String[] args) {
		
//		String text = "I am a boy";
		String text = "java is easy";
		
		String[] words = text.split(" ");
	
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
//			sb.append(new StringBuilder(word).reverse() + " ");
			sb.append(rev(word) + " ");
		}
		System.out.println(sb.toString());
	}
	
	private static String rev(String word) {
		
		char[] letters = word.toCharArray();
		int left = 0, right = letters.length-1;
		
		while(left < right) {
			
			char letter = letters[left];
			letters[left] = letters[right];
			letters[right] = letter;
			
			left++;
			right--;
		}
		
		return new String(letters);
	}

}
