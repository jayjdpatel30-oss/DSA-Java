package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");

		System.out.println("Root : " + bt.root.value);

		System.out.print("InOrder Traversal : ");
		bt.inOrder(bt.root);

		System.out.print("\nPreOrder Traversal : ");
		bt.preOrder(bt.root);

		System.out.print("\nPostOrder Traversal : ");
		bt.postOrder(bt.root);
		
		System.out.print("\nLevelOrder Traversal : ");
		bt.levelOrder();
	}
	
	
	

}
