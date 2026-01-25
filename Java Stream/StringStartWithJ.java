package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartWithJ {
	
	// ========================================================================
	// PROBLEM : Filter Strings Starting with 'j'
	 // ========================================================================
	/*
	 * Problem Statement: Print strings starting with letter 'j'.
	 * Input: ["java", "python", "javascript", "go"]
	 * Output: java javascript
	 * 
	 * Approach: Use filter(s -> s.startsWith("j")).
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "python", "javascript", "go");
		
		List<String> result = words.stream().filter(s -> s.startsWith("j")).collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}

// Output :
// [java, javascript]
