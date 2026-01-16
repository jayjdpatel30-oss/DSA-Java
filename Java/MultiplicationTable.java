package Java;

public class MultiplicationTable {

	// ========================================================================
	// PROBLEM: Print Multiplication Table
	// ========================================================================
	/*
	 * Problem Statement: Print multiplication table for a given number.
	 * Input: 5 Output: 5*1=5, 5*2=10, 5*3=15, ... 5*10=50
	 * Input: 3 Output: 3*1=3, 3*2=6, 3*3=9, ... 3*10=30
	 */
	public static void main(String[] args) {
		
		int num = 5;

		System.out.println("Multiplication Table of " + num + ":");

		for (int i = 1; i <= 10; i++) {
//			System.out.println(num + " * " + i + " = " + (num * i));
			System.out.format("%d x %2d = %d%n", num, i, (i * num));
		}
	}

}
