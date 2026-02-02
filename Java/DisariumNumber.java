package Java;

public class DisariumNumber {
	
	// ========================================================================
	// PROBLEM: Disarium Number
	// ========================================================================
	/*
	 * Problem Statement: Check if sum of digits raised to their positions equals the number.
	 * A disarium number equals the sum of its digits raised to their respective positions.
	 * Input: 135 Output: true (1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135)
	 * Input: 175 Output: true (1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175)
	 * Input: 123 Output: false
	 * 
	 * Approach: Calculate sum of digits raised to their positions (1-indexed).
	 * Time Complexity: O(log n) | Space Complexity: O(log n)
	 */
	public static void main(String[] args) {
		int num = 135;
		if (isDisariumNumber(num)) {
			System.out.println(num + " is a Disarium Number");
		} else {
			System.out.println(num + " is not a Disarium Number");
		}
	}
	
	private static boolean isDisariumNumber(int num) {
		String numStr = String.valueOf(num);
		int length = numStr.length();
		int sum = 0;
		
		for (int i = 0; i < length; i++) {
			int digit = numStr.charAt(i) - '0';
			sum += Math.pow(digit, i + 1);
		}
		
		return sum == num;
	}
}

// Output :
// 135 is a Disarium Number
