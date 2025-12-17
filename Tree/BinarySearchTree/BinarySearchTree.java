public class BinarySearchTree {

	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	// Insert node in Binary Search Tree
	private BinaryNode insertHelper(BinaryNode currentNode, int val) {

		if (currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.val = val;
			System.out.println(val + " inserted in binary search tree!");
			return newNode;
		}

		if (val < currentNode.val) {
			currentNode.left = insertHelper(currentNode.left, val);
		} else {
			currentNode.right = insertHelper(currentNode.right, val);
		}

		return currentNode;
	}

	public void insert(int val) {
		root = insertHelper(root, val);
	}

	// InOrder Traversal
	public void inOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.val + " ");
		inOrder(node.right);
	}

}
