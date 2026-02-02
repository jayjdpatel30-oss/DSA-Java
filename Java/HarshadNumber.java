package Java;

public class HarshadNumber {
	
	// ========================================================================
	// PROBLEM: Harshad Number (Niven Number)
	// ========================================================================
	/*
	 * Problem Statement: Check if a number is divisible by sum of its digits.
	 * A Harshad number is divisible by the sum of its digits.
	 * Input: 18 Output: true (1 + 8 = 9, and 18 % 9 = 0)
	 * Input: 21 Output: true (2 + 1 = 3, and 21 % 3 = 0)
	 * Input: 19 Output: false (1 + 9 = 10, and 19 % 10 != 0)
	 * 
	 * Approach: Calculate sum of digits, check if number is divisible by this sum.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 18;
		if (isHarshadNumber(num)) {
			System.out.println(num + " is a Harshad Number");
		} else {
			System.out.println(num + " is not a Harshad Number");
		}
	}
	
	private static boolean isHarshadNumber(int num) {
		int original = num;
		int digitSum = 0;
		
		while (num > 0) {
			digitSum += num % 10;
			num /= 10;
		}
		
		return digitSum != 0 && original % digitSum == 0;
	}
}

// Output : 
// 18 is a Harshad Number
