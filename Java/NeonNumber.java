package Java;

public class NeonNumber {
	
	// ========================================================================
	// PROBLEM: Neon Number
	// ========================================================================
	/*
	 * Problem Statement: Check if sum of digits of square equals the number itself.
	 * A neon number has sum of digits of its square equal to the number.
	 * Input: 9 Output: true (9^2 = 81, 8 + 1 = 9)
	 * Input: 1 Output: true (1^2 = 1, sum = 1)
	 * Input: 8 Output: false (8^2 = 64, 6 + 4 = 10 != 8)
	 * 
	 * Approach: Square the number, sum its digits, compare with original.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 9;
		if (isNeonNumber(num)) {
			System.out.println(num + " is a Neon Number");
		} else {
			System.out.println(num + " is not a Neon Number");
		}
	}
	
	private static boolean isNeonNumber(int num) {
		int square = num * num;
		int digitSum = 0;
		
		while (square > 0) {
			digitSum += square % 10;
			square /= 10;
		}
		
		return digitSum == num;
	}
}

// Output :
// 9 is a Neon Number
