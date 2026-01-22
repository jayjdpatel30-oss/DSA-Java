package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFirst3 {
	
	// ========================================================================
	// PROBLEM : Get First 3 Elements
	// ========================================================================
	/*
	 * Problem Statement: Get first 3 elements from a list.
	 * Input: [10, 20, 30, 40, 50]
	 * Output: [10, 20, 30]
	 * 
	 * Approach: Use limit(3).
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		List<Integer> firstThree = numbers.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(firstThree);
    
	}

}

// Output :
// [10, 20, 30]
