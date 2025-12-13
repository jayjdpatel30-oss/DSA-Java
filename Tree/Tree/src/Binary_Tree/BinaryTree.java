package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

//Binary Tree using Queue (Linked list)
public class BinaryTree {

	BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	// Insert node using level order manner
	public void insert(String value) {

		BinaryNode newNode = new BinaryNode(value);

		if (root == null) {
			root = newNode;
			System.out.println(value + " inserted in tree.");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryNode presentNode = queue.remove();

			if (presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println(value + " inserted in tree.");
				return;
			} else if (presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println(value + " inserted in tree.");
				return;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}

		}

	}

}
