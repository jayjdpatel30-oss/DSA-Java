package Java;

public class SunnyNumber {
	
	// ========================================================================
	// PROBLEM: Sunny Number
	// ========================================================================
	/*
	 * Problem Statement: Check if N+1 is a perfect square.
	 * A sunny number is one where N+1 is a perfect square.
	 * Input: 8 Output: true (8 + 1 = 9, which is 3^2)
	 * Input: 80 Output: true (80 + 1 = 81, which is 9^2)
	 * Input: 10 Output: false (10 + 1 = 11, not a perfect square)
	 * 
	 * Approach: Check if N+1 is a perfect square by taking square root.
	 * Time Complexity: O(1) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 8;
		if (isSunnyNumber(num)) {
			System.out.println(num + " is a Sunny Number");
		} else {
			System.out.println(num + " is not a Sunny Number");
		}
	}
	
	private static boolean isSunnyNumber(int num) {
		int nextNum = num + 1;
		int sqrt = (int) Math.sqrt(nextNum);
		return sqrt * sqrt == nextNum;
	}
}

// Output :
// 8 is a Sunny Number
