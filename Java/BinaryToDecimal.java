package Java;

public class BinaryToDecimal {

	// ========================================================================
	// PROBLEM: Binary to decimal
	// ========================================================================
	/*
	 * Problem Statement: Convert binary number to decimal.
	 * Input: 1010 Output: 10
	 * Input: 11111 Output: 31
	 * Input: 1 Output: 1
	 */
	public static void main(String[] args) {
		int binary = 1010;
		System.out.println("Binary " + binary + " = Decimal " + binaryToDecimal(binary));
	}

	private static int binaryToDecimal(int binary) {
	        int decimal = 0, power = 0;
	        while (binary > 0) {
	            int remainder = binary % 10;
	            decimal += remainder * (int) Math.pow(2, power);
				binary /= 10;
				power++;
			}
			return decimal;
		}
	}
