package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class CountNumberGreaterThan10 {
	
	// ========================================================================
	// PROBLEM : Count Numbers Greater Than 10
	// ========================================================================
	/*
	 * Problem Statement: Count how many numbers are greater than 10.
	 * Input: [5, 12, 8, 20, 3]
	 * Output: 2
	 * 
	 * Approach: Filter numbers greater than 10, then use count().
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3);

		long count = numbers.stream().filter(n -> n > 10).count();
		
		List<Integer> grth10 = numbers.stream().filter(n -> n > 10).collect(Collectors.toList());

		System.out.println(count);
		
		System.out.println(grth10);
    
	}

}

// Output :
// 2
// [12, 20]
