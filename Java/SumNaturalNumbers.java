package Java;

public class SumNaturalNumbers {
	
	// ========================================================================
	// PROBLEM: Sum Natural Numbers
	// ========================================================================
	/*
	 * Problem Statement: Find sum of first n natural numbers.
	 * Input: 5 Output: 15 (1+2+3+4+5)
	 * Input: 10 Output: 55 (1+2+3+...+10)
	 * Input: 1 Output: 1
	 * 
	 * Approach: Use loop to add numbers from 1 to n OR use formula n*(n+1)/2
	 * Time Complexity: O(1) with formula | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Sum of first " + n + " natural numbers: " + sumNatural(n));
	}

	private static int sumNatural(int n) {
		// Using formula: n * (n + 1) / 2
		return n * (n + 1) / 2;
	}
}
