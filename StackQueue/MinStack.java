package StackQueue;

import java.util.Stack;

public class MinStack {

	// ========================================================================
	// PROBLEM 2: Min Stack
	// ========================================================================
	/**
	 * Problem Statement: Design a stack that supports push, pop, top, and
	 * retrieving the minimum element in constant time.
	 * 
	 * Implement the MinStack class: - MinStack() initializes the stack object. -
	 * void push(int val) pushes the element val onto the stack. - void pop()
	 * removes the element on the top of the stack. - int top() gets the top element
	 * of the stack. - int getMin() retrieves the minimum element in the stack.
	 * 
	 * You must implement a solution with O(1) time complexity for each function.
	 * 
	 * Example: MinStack minStack = new MinStack(); minStack.push(-2);
	 * minStack.push(0); minStack.push(-3); minStack.getMin(); // return -3
	 * minStack.pop(); minStack.top(); // return 0 minStack.getMin(); // return -2
	 * 
	 * Approach: Use two stacks: 1. Main stack: stores all elements 2. Min stack:
	 * stores minimum at each level
	 * 
	 * When pushing: if new element <= current min, push to both stacks When
	 * popping: if popped element == current min, pop from both stacks
	 * 
	 * Alternative: Store pairs (value, min) in single stack
	 * 
	 * Time Complexity: O(1) for all operations Space Complexity: O(n) - two stacks
	 * in worst case
	 */

	private Stack<Integer> mainStack;
	private Stack<Integer> minStack;

	public MinStack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		mainStack.push(val);

		// Push to minStack if it's empty or val is new minimum
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		if (mainStack.isEmpty()) {
			return;
		}

		int popped = mainStack.pop();

		// If popped element was minimum, remove from minStack too
		if (popped == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		return mainStack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

}

//Alternative Approach
class MinStackAlternative {
	private Stack<int[]> stack; // [value, minAtThisLevel]

	public MinStackAlternative() {
		stack = new Stack<>();
	}

	public void push(int val) {
		if (stack.isEmpty()) {
			stack.push(new int[] { val, val });
		} else {
			int currentMin = Math.min(val, stack.peek()[1]);
			stack.push(new int[] { val, currentMin });
		}
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek()[0];
	}

	public int getMin() {
		return stack.peek()[1];
	}
}
