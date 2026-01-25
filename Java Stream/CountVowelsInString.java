package Java_Streams;

public class CountVowelsInString {
	
	// ========================================================================
	// PROBLEM : Count Vowels in a String
	// ========================================================================
	/*
	 * Problem Statement: Count number of vowels in a given string.
	 * Input: "programming"
	 * Output: 3
	 * 
	 * Approach: Convert string to IntStream using chars(), filter vowels, count.
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	
	public static void main(String[] args) {
		
		String word =  "programming";
		
		long vowels = word.chars().filter(c -> c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u').count();
		
		long count = word.chars().filter(c -> "aeiou".indexOf(c) != -1).count();	
		
		System.out.println(vowels);
		
	}

}

// Output :
// 3
