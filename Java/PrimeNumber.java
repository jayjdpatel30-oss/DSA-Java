package Java;

public class PrimeNumber {
	
	// ========================================================================
	// PROBLEM: Prime Number
	// ========================================================================
	/*
	 * Problem Statement: Check if a number is prime.
	 * A prime number is greater than 1 and divisible only by 1 and itself.
	 * Input: 7 Output: true (only divisible by 1 and 7)
	 * Input: 11 Output: true
	 * Input: 4 Output: false (divisible by 1, 2, and 4)
	 * 
	 * Approach: Check divisibility from 2 to square root of number.
	 * Time Complexity: O(√n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 7;
		if (isPrime(num)) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}
	
	private static boolean isPrime(int num) {
		if (num <= 1) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}

Output :
7 is a Prime Number
