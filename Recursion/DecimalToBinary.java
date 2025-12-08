package Recursion;

public class DecimalToBinary {

	// ============================================================================
	// PROBLEM 4: DECIMAL TO BINARY CONVERSION
	// ============================================================================
	/**
	 * Problem: Convert a decimal number to binary using recursion Example: 10
	 * (decimal) → "1010" (binary)
	 * 
	 * * APPROACH:
     * - Base Case: If n == 0, return empty string
     * - Recursive Case: Convert n/2 to binary, then append n%2
     * 
     * TIME COMPLEXITY: O(log₂ n) - number of bits
     * SPACE COMPLEXITY: O(log₂ n)
     * 
     * VISUALIZATION for 10:
			decimalToBinary(6)
				= 0 + 10 * (1 + 10 * (1 + 10 * 0))
				= 0 + 10 * (1 + 10 * 1)
				= 0 + 10 * (1 + 10)
				= 0 + 10 * 11
				= 110
     */

	public static void main(String[] args) {

		int number = 6;
		System.out.println("Binary of " + number + " is : " + decimalToBinary(number));

	}

	private static int decimalToBinary(int number) {

		if (number == 0) {
			return 0;
		}

		return (number % 2) + 10 * decimalToBinary(number / 2);

	}

}
