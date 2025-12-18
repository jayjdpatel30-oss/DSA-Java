public class Main {

	public static void main(String[] args) {

		System.out.println("BINARY SEARCH TREE");

		BinarySearchTree bst = new BinarySearchTree();

		int[] values = { 50, 30, 70, 20, 40, 60, 80, 10, 35, 65 };
		for (int val : values) {
			bst.insert(val);
		}

//			        50
//			      /    \
//			    30      70
//			   /  \    /  \
//			 20   40  60   80
//			/    /      \
//		  10    35       65

		System.out.println("Root : " + bst.root.val);

		// In Order Traversal
		System.out.println("InOrder Traversal : ");
		bst.inOrder(bst.root);

		// Pre Order Traversal
		System.out.println("\nPreOrder Traversal : ");
		bst.preOrder(bst.root);

		// In Order Traversal
		System.out.println("\nPostOrder Traversal : ");
		bst.postOrder(bst.root);

//		 Level Order Traversal
		System.out.println("\nLevelOrder Traversal : ");
		bst.levelOrder();

//		 Delete NOde
		bst.delete(bst.root, 70);
		
		// In Level Traversal
		System.out.println("\nLevelOrder Traversal : ");
		bst.levelOrder();

		System.out.print("\nSearch in binary search tree : ");
		bst.search(bst.root, 30);

		/**
		O/P -> 
			BINARY SEARCH TREE
			50 inserted in binary search tree!
			30 inserted in binary search tree!
			70 inserted in binary search tree!
			20 inserted in binary search tree!
			40 inserted in binary search tree!
			60 inserted in binary search tree!
			80 inserted in binary search tree!
			10 inserted in binary search tree!
			35 inserted in binary search tree!
			65 inserted in binary search tree!
			Root : 50
			InOrder Traversal : 
			10 20 30 35 40 50 60 65 70 80 
			PreOrder Traversal : 
			50 30 20 10 40 35 70 60 65 80 
			PostOrder Traversal : 
			10 20 35 40 30 65 60 80 70 50 
			LevelOrder Traversal : 
			50 30 70 20 40 60 80 10 35 65 
			LevelOrder Traversal : 
			50 30 80 20 40 60 10 35 65 
			Search in binary search tree : 30 found in binary Search tree!
		*/
	}

}
