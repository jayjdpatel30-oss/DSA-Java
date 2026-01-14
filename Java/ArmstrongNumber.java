package Java;

public class ArmstrongNumber {
	
	// ========================================================================
	// PROBLEM: Armstrong Number
	// ========================================================================
	/*
	 * Problem Statement: Check if number is Armstrong number (narcissistic number).
	 * An Armstrong number is one where sum of its digits raised to power of digit count equals itself.
	 * Input: 153 Output: true (1^3 + 5^3 + 3^3 = 153)
	 * Input: 370 Output: true (3^3 + 7^3 + 0^3 = 370)
	 * Input: 123 Output: false
	 * 
	 * Approach: Extract each digit, raise to power of total digits, sum and compare.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 153;
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong Number");
		} else {
			System.out.println(num + " is not an Armstrong Number");
		}
	}

	private static boolean isArmstrong(int num) {
		int originalNum = num;
		int digitCount = String.valueOf(num).length();
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digitCount);
			num /= 10;
		}

		return sum == originalNum;
	}

}
