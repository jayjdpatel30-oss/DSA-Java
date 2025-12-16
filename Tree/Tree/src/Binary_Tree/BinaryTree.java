package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

	// InOrder Traversal
	public void inOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}

	// PostOrder Traversal
	public void postOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
	}

	// PreOrder Traversal
	public void preOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// Level Order Traversal
	public void levelOrder() {

		if (root == null) {
			System.out.println("Empty tree.");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryNode present = queue.remove();
			System.out.print(present.value + " ");

			if (present.left != null) {
				queue.add(present.left);
			}

			if (present.right != null) {
				queue.add(present.right);
			}
		}

	}

	// Search in Binary Tree
	public void search(String value) {

		if (root == null) {
			System.out.println("Empty tree.");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryNode presentNode = queue.remove();

			if (presentNode.value.equals(value)) {
				System.out.println(value + " found in tree!");
				return;
			}

			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}

			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}

		}

		System.out.println(value + " not found in tree!");
	}

	// Delete in Binary Tree
	public void delete(String value) {

		if (root == null) {
			System.out.println("Empty tree!");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		BinaryNode nodeToDelete = null;

		while (!queue.isEmpty()) {

			BinaryNode present = queue.remove();

			if (present.value.equals(value)) {
				nodeToDelete = present;
				break;
			}

			if (present.left != null) {
				queue.add(present.left);
			}

			if (present.right != null) {
				queue.add(present.right);
			}

		}

		if (nodeToDelete == null) {
			System.out.println(value + " doesnt exist in tree!");
		} else {

			BinaryNode deepestNode = getDeepestNode();
			nodeToDelete.value = deepestNode.value;
			deleteDeepestNode(deepestNode);
			System.out.println(value + " deleted from tree!");
		}

	}

	// get last node or deepest node
	public BinaryNode getDeepestNode() {

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);

		BinaryNode present = null;

		while (!queue.isEmpty()) {

			present = queue.remove();

			if (present.left != null) {
				queue.add(present.left);
			}

			if (present.right != null) {
				queue.add(present.right);
			}

		}

		return present;
	}

	// delete deepest node in tree
	public void deleteDeepestNode(BinaryNode deepestNode) {

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryNode present = queue.remove();

			if (present.left != null) {

				if (present.left == deepestNode) {
					present.left = null;
					return;
				} else {
					queue.add(present.left);
				}
			}

			if (present.right != null) {

				if (present.right == deepestNode) {
					present.right = null;
					return;
				} else {
					queue.add(present.left);
				}
			}

		}

	}

	// InOrder Iterative Using Stack
	public void inOrderIte(BinaryNode root) {

		if (root == null) {
			return;
		}

		Stack<BinaryNode> stack = new Stack<String>();

		BinaryNode current = root;

		while (!stack.isEmpty() && current != null) {

			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			System.out.print(current.value + " ");
			current = current.right;

		}

	}

}