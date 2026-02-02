package Java;

public class SpyNumber {
	
	// ========================================================================
	// PROBLEM: Spy Number
	// ========================================================================
	/*
	 * Problem Statement: Check if sum of digits equals product of digits.
	 * A spy number has sum of its digits equal to product of its digits.
	 * Input: 123 Output: true (1 + 2 + 3 = 6, and 1 * 2 * 3 = 6)
	 * Input: 1124 Output: true (1 + 1 + 2 + 4 = 8, and 1 * 1 * 2 * 4 = 8)
	 * Input: 23 Output: false (2 + 3 = 5, but 2 * 3 = 6)
	 * 
	 * Approach: Calculate both sum and product of digits, then compare.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 123;
		if (isSpyNumber(num)) {
			System.out.println(num + " is a Spy Number");
		} else {
			System.out.println(num + " is not a Spy Number");
		}
	}
	
	private static boolean isSpyNumber(int num) {
		int sum = 0;
		int product = 1;
		
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			product *= digit;
			num /= 10;
		}
		
		return sum == product;
	}
}

// Output :
// 123 is a Spy Number
