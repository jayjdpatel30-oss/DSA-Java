package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	// ========================================================================
	// PROBLEM 3: Implement Stack Using Queues
	// ========================================================================
	/**
	 * Problem Statement: Implement a last-in-first-out (LIFO) stack using only two
	 * queues. The implemented stack should support all the functions of a normal
	 * stack (push, top, pop, and empty).
	 * 
	 * Implement the MyStack class: - void push(int x) Pushes element x to the top
	 * of the stack. - int pop() Removes the element on the top of the stack and
	 * returns it. - int top() Returns the element on the top of the stack. -
	 * boolean empty() Returns true if the stack is empty, false otherwise.
	 * 
	 * Example: MyStack myStack = new MyStack(); myStack.push(1); myStack.push(2);
	 * myStack.top(); // return 2 myStack.pop(); // return 2 myStack.empty(); //
	 * return false
	 * 
	 * Approach 1 (Make Push Expensive): - O(n) push, O(1) pop
	 * 
	 * Key insight: Queue is FIFO, Stack is LIFO. We need to reverse order!
	 * 
	 * Time Complexity: - push(): O(1) - pop(): O(n) - top(): O(n) - empty(): O(1)
	 * Space Complexity: O(n) - two queues
	 */

	private Queue<Integer> queue;

	public StackUsingQueue() {
		queue = new LinkedList<>();
	}

	public void push(int x) {
		queue.offer(x);
		int size = queue.size();

		// Rotate queue so new element is at front
		for (int i = 1; i < size; i++) {
			queue.offer(queue.poll());
		}
	}

	public int pop() {
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}

}
