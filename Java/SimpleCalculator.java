package Java;

public class SimpleCalculator {

	// ========================================================================
	// PROBLEM: Simple Calculator (Add, Subtract, Multiply, Divide)
	// ========================================================================
	/*
	 * Problem Statement: Create a simple calculator that takes two numbers and an operator
	 * Input: num1 = 10, num2 = 5, operator = '+' Output: 15
	 * Input: num1 = 10, num2 = 5, operator = '-' Output: 5
	 * Input: num1 = 10, num2 = 5, operator = '*' Output: 50
	 * Input: num1 = 10, num2 = 5, operator = '/' Output: 2.0
	 * 
	 * Approach: Use switch case to check operator and perform corresponding operation.
	 * Time Complexity: O(1) | Space Complexity: O(1)
	 */

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 5;
		char operator = '+';

		double result = calculate(num1, num2, operator);
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

	private static double calculate(double num1, double num2, char operator) {
		double result = 0;
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator");
		}
		return result;
	}
}

