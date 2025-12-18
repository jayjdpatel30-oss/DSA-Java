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

	// PreOrder Traversal
	public void preOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// PostOrder Traversal
	public void postOrder(BinaryNode node) {

		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}

	// LevelOrder Traversal
	public void levelOrder() {

		if (root == null) {
			System.out.println("Empty Tree!");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryNode currentNode = queue.remove();
			System.out.print(currentNode.val + " ");

			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}

			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}

		}
	}

	// Search in Binary Search Tree
	public BinaryNode search(BinaryNode node, int val) {

		if (node == null) {
			System.out.println(val + " does not found in binary Search tree!");
			return null;
		}

		if (val == node.val) {
			System.out.println(val + " found in binary Search tree!");
			return node;
		} else if (val < node.val) {
			return search(node.left, val);
		} else {
			return search(node.right, val);

		}
	}

}
