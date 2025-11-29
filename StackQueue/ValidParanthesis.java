package StackQueue;

import java.util.Stack;

public class ValidParanthesis {

	// ========================================================================
	// PROBLEM 1: Valid Parentheses
	// ========================================================================
	/**
	 * Problem Statement: Given a string s containing just the characters '(', ')',
	 * '{', '}', '[' and ']', determine if the input string is valid.
	 * 
	 * An input string is valid if: 1. Open brackets must be closed by the same type
	 * of brackets. 2. Open brackets must be closed in the correct order. 3. Every
	 * close bracket has a corresponding open bracket of the same type.
	 * 
	 * Example: Input: s = "()" Output: true
	 * 
	 * Input: s = "()[]{}" Output: true
	 * 
	 * Input: s = "(]" Output: false
	 * 
	 * Input: s = "([)]" Output: false
	 * 
	 * Input: s = "{[]}" Output: true
	 * 
	 * Approach: Use Stack (LIFO - Last In First Out): 1. For opening brackets: push
	 * to stack 2. For closing brackets: check if it matches top of stack 3. If
	 * matches, pop from stack; if not, return false 4. At end, stack should be
	 * empty
	 * 
	 * Key insight: Stack is perfect for matching pairs with nesting! The most
	 * recently opened bracket must be closed first.
	 * 
	 * Time Complexity: O(n) - single pass through string Space Complexity: O(n) -
	 * worst case all opening brackets
	 */

	public static void main(String[] args) {

		String s = "()[]{}";
		System.out.println("Valid paratheses : " + (isValid(s) ? "Yes" : "No"));

	}

	public static boolean isValid(String s) {
		if (s == null || s.length() % 2 != 0) {
			return false; // Odd length can't be valid
		}

		Stack<Character> stack = new Stack<>();

		for (char currentParanthes : s.toCharArray()) {
			// Push opening brackets
			if (currentParanthes == '(' || currentParanthes == '{' || currentParanthes == '[') {
				stack.push(currentParanthes);
			}
			// Check closing brackets
			else {
				if (stack.isEmpty()) {
					return false; // No matching opening bracket
				}

				char top = stack.pop();

				if (currentParanthes == ')' && top != '(')
					return false;
				if (currentParanthes == '}' && top != '{')
					return false;
				if (currentParanthes == ']' && top != '[')
					return false;
			}
		}

		return stack.isEmpty(); // All brackets should be matched and removed
	}

}
