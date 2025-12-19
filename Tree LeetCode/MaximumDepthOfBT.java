package Tree_Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBT {

	// ========================================================================
	// PROBLEM 1: Maximum Depth of Binary Tree
	// ========================================================================
	/**
	 * Problem Statement: Given the root of a binary tree, return its maximum depth.
	 * A binary tree's maximum depth is the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 * 
	 * Example: Input: root = [3,9,20,null,null,15,7]
	 * 
     *        3
     *       / \
     *      9  20
     *        /  \
     *       15   7
     * 
     * Output: 3
	 */

	/**
	 * Input: root = [1,null,2] Output: 2
	 * 
	 * Approach 1 (Recursive - DFS): - Base case: null node has depth 0 - Recursive
	 * case: 1 + max(left depth, right depth)
	 * 
	 * Approach 2 (Iterative - BFS): - Level order traversal, count levels
	 * 
	 * Time Complexity: O(n) - visit each node once Space Complexity: O(h) where h
	 * is height - recursion stack
	 */

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
//		root.right.right.left = new TreeNode(1); // Adding extra node for testing
		
//		TreeNode root = new TreeNode(1);
//		root.right = new TreeNode(2);

		System.out.println("Maximum depth is : " + maxDepth(root));
		System.out.println("Maximum depth is : " + maxDepthIte(root));

	}

	// Recursiv
	public static int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftLength = maxDepth(root.left);
		int rightLength = maxDepth(root.right);

		return 1 + Math.max(leftLength, rightLength);
	}

	// Iterative
	public static int maxDepthIte(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int depth = 0;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			depth++;

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				TreeNode currentNode = queue.remove();

				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}

		}

		return depth;
	}

}
