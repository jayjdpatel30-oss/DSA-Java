package BinaryTree_Array;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree(9);
		tree.insert("N1");
		tree.insert("N2");
		tree.insert("N3");
		tree.insert("N4");
		tree.insert("N5");
		tree.insert("N6");
		tree.insert("N7");
		tree.insert("N8");
		tree.insert("N9");

		System.out.println("Pre Order Traversal : ");
		tree.preOrder(1);

		System.out.println("\nIn Order Traversal : ");
		tree.inOrder(1);

		System.out.println("\nPost Order Traversal : ");
		tree.postOrder(1);

		System.out.println();
		tree.search("N5");

		// Delete Node from tree
		tree.delete("N5");

		System.out.println("\nIn Order Traversal : ");
		tree.inOrder(1);

//		feat: Add Deletion method in tree!
//		we find node to be deleted then change value of that node to deepest node and decrement index by 1 so deepest node is getting deleted.
	}

}
