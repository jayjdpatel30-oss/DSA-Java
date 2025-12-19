package Tree_Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTLevelOrder {

	// ========================================================================
	// PROBLEM 4: Binary Tree Level Order Traversal
	// ========================================================================
	/**
	 * Problem Statement: Given the root of a binary tree, return the level order
	 * traversal of its nodes' values. (i.e., from left to right, level by level).
	 * 
     * Example:
     * Input: root = [3,9,20,null,null,15,7]
     *        3
     *       / \
     *      9  20
     *        /  \
     *       15   7
     * Output: [[3],[9,20],[15,7]]
	 * 
	 * Input: root = [1] Output: [[1]]
	 * 
	 * Input: root = [] Output: []
	 */

	/**
	 * Approach: BFS (Breadth-First Search) using queue: 1. Start with root in queue
	 * 2. For each level: - Record number of nodes in queue (level size) - Process
	 * that many nodes - Add their children to queue 3. Each level becomes one list
	 * in result
	 * 
	 * This is the classic BFS pattern!
	 * 
	 * Time Complexity: O(n) - visit each node once Space Complexity: O(w) where w
	 * is max width of tree
	 */

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		System.out.println("Level order traversal of its node's values : " + levelOrder(root));
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		List<Integer> currentLevel;

		while (!queue.isEmpty()) {

			currentLevel = new ArrayList<Integer>();

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				TreeNode currentNode = queue.poll();

				currentLevel.add(currentNode.val);

				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}

			}

			result.add(currentLevel);

		}

		return result;
	}

}
