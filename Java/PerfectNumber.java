package Java;

public class PerfectNumber {
	
	// ========================================================================
	// PROBLEM: Perfect Number
	// ========================================================================
	/*
	 * Problem Statement: Check if a number is a perfect number.
	 * A perfect number is equal to the sum of its proper divisors (excluding itself).
	 * Input: 6 Output: true (1 + 2 + 3 = 6)
	 * Input: 28 Output: true (1 + 2 + 4 + 7 + 14 = 28)
	 * Input: 12 Output: false
	 * 
	 * Approach: Find all divisors less than n, sum them, and check if equal to n.
	 * Time Complexity: O(√n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 28;
		if (isPerfectNumber(num)) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
	}
	
	private static boolean isPerfectNumber(int num) {
		if (num <= 1) return false;
		
		int sum = 1; // 1 is always a divisor
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}
		
		return sum == num;
	}
}

// Output : 
// 28 is a Perfect Number
