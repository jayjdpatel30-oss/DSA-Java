package Java;

public class KrishnamurthyNumber {
	
	// ========================================================================
	// PROBLEM: Krishnamurthy Number (Strong Number)
	// ========================================================================
	/*
	 * Problem Statement: Check if sum of factorials of digits equals the number.
	 * A Krishnamurthy number equals sum of factorials of its digits.
	 * Input: 145 Output: true (1! + 4! + 5! = 1 + 24 + 120 = 145)
	 * Input: 40585 Output: true (4! + 0! + 5! + 8! + 5! = 40585)
	 * Input: 123 Output: false
	 * 
	 * Approach: Calculate factorial of each digit and sum them.
	 * Time Complexity: O(d * k) where d is digits, k is max digit value | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 145;
		if (isKrishnamurthyNumber(num)) {
			System.out.println(num + " is a Krishnamurthy Number");
		} else {
			System.out.println(num + " is not a Krishnamurthy Number");
		}
	}
	
	private static boolean isKrishnamurthyNumber(int num) {
		int original = num;
		int sum = 0;
		
		while (num > 0) {
			int digit = num % 10;
			sum += factorial(digit);
			num /= 10;
		}
		
		return sum == original;
	}
	
	private static int factorial(int n) {
		if (n == 0 || n == 1) return 1;
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}

// Output :
// 145 is a Krishnamurthy Number
