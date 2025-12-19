package Tree_Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	// ========================================================================
	// PROBLEM 3: Symmetric Tree
	// ========================================================================
	/**
	 * Problem Statement: Given the root of a binary tree, check whether it is a
	 * mirror of itself (i.e., symmetric around its center).
	 * 
     * Example:
     * Input: root = [1,2,2,3,4,4,3]
     *        1
     *       / \
     *      2   2
     *     / \ / \
     *    3  4 4  3
     * Output: true
     * 
     * Input: root = [1,2,2,null,3,null,3]
     *        1
     *       / \
     *      2   2
     *       \   \
     *        3   3
     * Output: false
	 */

	/**
	 * Approach: A tree is symmetric if: - Left subtree is mirror of right subtree -
	 * For two nodes to be mirrors: - Both are null, OR - Both have same value AND -
	 * Left's left mirrors Right's right - Left's right mirrors Right's left
	 * 
	 * Time Complexity: O(n) - visit each node once Space Complexity: O(h) -
	 * recursion stack
	 */
	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(2);

		root1.left.left = new TreeNode(3);
		root1.left.right = new TreeNode(4);

		root1.right.left = new TreeNode(4);
		root1.right.right = new TreeNode(3);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(2);
		root2.left.right = new TreeNode(3);
		root2.right.right = new TreeNode(3);

		System.out.println("Is Tree 1 symetric? : " + (isSymetric(root1) ? "Yes" : "No"));
		System.out.println("Is Tree 2 symetric? : " + (isSymetric(root2) ? "Yes" : "No"));

		System.out.println("Is Tree 1 symetric? : " + (isSymmetricIterative(root1) ? "Yes" : "No"));
		System.out.println("Is Tree 2 symetric? : " + (isSymmetricIterative(root2) ? "Yes" : "No"));
	}

	static boolean isSymetric(TreeNode root) {

		if (root == null) {
			return true;
		}

		return isMirror(root.left, root.right);
	}

	static boolean isMirror(TreeNode left, TreeNode right) {

		if (left == null || right == null) {
			return left == right;
		}

		if (left.val != right.val) {
			return false;
		}

		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}
	
	//Iterative approach using queue
	
    public static boolean isSymmetricIterative(TreeNode root) {

    	if(root == null) {
    		return true;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root.left);
    	queue.add(root.right);
    	
    	
    	while(!queue.isEmpty()) {
    		
    		TreeNode left = queue.poll();
    		TreeNode right = queue.poll();
    		
    		if(left == null && right == null) {
    			return true;
    		}
    		
    		if(left == null || right == null) {
    			return false;
    		}
    		
    		if(left.val != right.val) {
    			return false;
    		}
    		
    		// Add element in mirror manner
    		queue.offer(left.left);
    		queue.offer(right.right);
    		
    		queue.offer(left.right);
    		queue.offer(right.left);
    		
    	}
    	
    	return true;
    }
	
	
}
