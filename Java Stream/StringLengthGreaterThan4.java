package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class StringLengthGreaterThan4 {
	
	// ========================================================================
	// PROBLEM : Count Strings with Length > 4
	// ========================================================================
	/*
	 * Problem Statement: Count strings whose length is greater than 4.
	 * Input: ["java", "stream", "api", "lambda"]
	 * Output: 2
	 * 
	 * Approach: Filter by length and count().
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "stream", "api", "lambda");

		long result = words.stream().filter(s -> s.length() > 4).count();
		
		System.out.println(result);
		
	}

}

// Output : 
// 2
