package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	
	// ========================================================================
	// PROBLEM : Find First Element
	// ========================================================================
	/*
	 * Problem Statement: Get the first element from a list.
	 * Input: [5, 10, 15]
	 * Output: 5
	 * 
	 * Approach: Use findFirst() and Optional.
	 * Time Complexity: O(1)
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 10, 15);
		
		Optional<Integer> firstElement = numbers.stream().findFirst();
		
		int first = numbers.stream().findFirst().orElse(7);
		
		System.out.println(firstElement.get());
		System.out.println(firstElement.orElse(45));
		
		System.out.println(first);
	}

}

// Output :
// 5
// 5
// 5
