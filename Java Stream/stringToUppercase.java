package Java_Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class stringToUppercase {

	// ========================================================================
	// PROBLEM : Convert List of Strings to Uppercase
	/*
	 * Problem Statement: Convert all strings in a list to uppercase.
	 * Input: ["java", "stream", "api"]
	 * Output: ["JAVA", "STREAM", "API"]
	 * 
	 * Approach: Use map() to transform each string to uppercase.
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */

	public static void main(String[] args) {

		List<String> words = Arrays.asList("java", "stream", "api");

		words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
		
		List<String> uppercaseList = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("\n" + uppercaseList);
	}

}

// Output : 
// JAVA
// STREAM
// API

// [JAVA, STREAM, API]
