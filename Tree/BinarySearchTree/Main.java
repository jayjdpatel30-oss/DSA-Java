public class Main {

	public static void main(String[] args) {

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

	}

}
