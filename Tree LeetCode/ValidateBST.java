package Tree_Leetcode;

import java.util.Stack;

public class ValidateBST {

	// ========================================================================
	// PROBLEM 2: Validate Binary Search Tree
	// ========================================================================
	/**
	 * Problem Statement: Given the root of a binary tree, determine if it is a
	 * valid binary search tree (BST).
	 * 
	 * A valid BST is defined as follows: - The left subtree of a node contains only
	 * nodes with keys less than the node's key. - The right subtree of a node
	 * contains only nodes with keys greater than the node's key. - Both the left
	 * and right subtrees must also be binary search trees.
	 * 
	 * Example:
     * Input: root = [2,1,3]
     *        2
     *       / \
     *      1   3
     * Output: true
     * 
     * Input: root = [5,1,4,null,null,3,6]
     *        5
     *       / \
     *      1   4
     *         / \
     *        3   6
     * Output: false
	 * 
	 * Explanation: The root node's value is 5 but its right child's value is 4.
	 */

	/**
	 * Approach: Use inOrder Traversal with stack: - We fill stack with inoOrder
	 * manner so values inssert in increment manner then we pop elements 1 by 1 and
	 * checking if its value is not less or equal to the stack's peek value if yes
	 * then return false when stack is empty we return true
	 * 
	 * 
	 * Time Complexity: O(n) - visit each node once Space Complexity: O(n) -
	 * recursion stack + queue = 2n
	 */
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(2);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(3);

		TreeNode root2 = new TreeNode(5);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(4);
		root2.right.left = new TreeNode(3);
		root2.right.right = new TreeNode(6);

		System.out.println("Tree 1 is valid : " + (isValid(root1) ? "Yes" : "No"));
		System.out.println("Tree 2 is valid : " + (isValid(root2) ? "Yes" : "No"));

	}

	public static boolean isValid(TreeNode root) {

		if (root == null) {
			return true;
		}

		fillStackInOrder(root);

		while (!stack.isEmpty()) {

			int lastVal = stack.pop();

			if (stack.isEmpty()) {
				return true;
			}

			if (lastVal <= stack.peek()) {
				return false;
			}

		}

		return true;
	}

	private static void fillStackInOrder(TreeNode root) {

		if (root != null) {
			fillStackInOrder(root.left);
			stack.push(root.val);
			fillStackInOrder(root.right);
		}

	}

}
