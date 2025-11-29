package StackQueue;

import java.util.Stack;

public class QueueUsingStack {

	// ========================================================================
	// PROBLEM 4: Implement Queue Using Stacks
	// ========================================================================
	/**
	 * Problem Statement: Implement a first in first out (FIFO) queue using only two
	 * stacks. The implemented queue should support all the functions of a normal
	 * queue (push, peek, pop, and empty).
	 * 
	 * Implement the MyQueue class: - void push(int x) Pushes element x to the back
	 * of the queue. - int pop() Removes the element from the front of the queue and
	 * returns it. - int peek() Returns the element at the front of the queue. -
	 * boolean empty() Returns true if the queue is empty, false otherwise.
	 * 
	 * Example: MyQueue myQueue = new MyQueue(); myQueue.push(1); // queue is: [1]
	 * myQueue.push(2); // queue is: [1, 2] myQueue.peek(); // return 1
	 * myQueue.pop(); // return 1, queue is [2] myQueue.empty(); // return false
	 * 
	 * Approach: Use two stacks - input stack and output stack: 1. Push: Always push
	 * to input stack - O(1) 2. Pop/Peek: If output stack is empty, transfer all
	 * from input to output This reverses the order, making first pushed element on
	 * top
	 * 
	 * Key insight: Transferring between stacks reverses order! Stack 1: [1,2,3]
	 * (top=3) Transfer to Stack 2: [3,2,1] (top=1) - now acts like queue!
	 * 
	 * Amortized Time Complexity: - push(): O(1) - pop(): O(1) amortized (each
	 * element moved once) - peek(): O(1) amortized - empty(): O(1) Space
	 * Complexity: O(n) - two stacks
	 */

	Stack<Integer> inputStack;
	Stack<Integer> outputStack;

	public QueueUsingStack() {
		inputStack = new Stack<>();
		outputStack = new Stack<>();
	}

	public void push(int x) {
		inputStack.push(x);
	}

	public int pop() {
		peek(); // Ensures outputStack has elements
		return outputStack.pop();
	}

	public int peek() {
		if (outputStack.isEmpty()) {
			// Transfer all elements from input to output
			while (!inputStack.isEmpty()) {
				outputStack.push(inputStack.pop());
			}
		}
		return outputStack.peek();
	}

	public boolean empty() {
		return inputStack.isEmpty() && outputStack.isEmpty();
	}
}
