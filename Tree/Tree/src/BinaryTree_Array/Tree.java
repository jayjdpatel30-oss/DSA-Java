package BinaryTree_Array;

public class Tree {

	String[] nodes;
	int lastUsedIndex;

	public Tree(int size) {
		this.nodes = new String[size + 1];
		lastUsedIndex = 0;
	}

	// Inserting node in binary tree
	public void insert(String value) {

		if (lastUsedIndex >= nodes.length - 1) {
			System.out.println("Full Tree!");
			return;
		}

		nodes[++lastUsedIndex] = value;
	}

	// Pre Order Traversal
	public void preOrder(int index) {

		if (index > lastUsedIndex) {
			return;
		}

		System.out.print(nodes[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}

	// In Order Traversal
	public void inOrder(int index) {

		if (index > lastUsedIndex) {
			return;
		}

		inOrder(index * 2);
		System.out.print(nodes[index] + " ");
		inOrder(index * 2 + 1);
	}

	// Post Order Traversal
	public void postOrder(int index) {

		if (index > lastUsedIndex) {
			return;
		}

		postOrder(index * 2);
		postOrder(index * 2 + 1);
		System.out.print(nodes[index] + " ");

	}

	// Search Method in tree
	public void search(String value) {

		for (int i = 1; i < nodes.length; i++) {
			if (nodes[i].equals(value)) {
				System.out.println(value + " found in tree!");
				return;
			}
		}

		System.out.println(value + " does not found in the tree!");
	}

}
