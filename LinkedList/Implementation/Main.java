public class Main {
	
	public static void main(String[] args) {
		
		SLL sll = new SLL();
		sll.createSLL(1);
		
		sll.insertNode(2);
		sll.insertNode(3);
		sll.insertNode(4);
		sll.insertNode(5);
		
		sll.printList();
		
		sll.search(2);
		sll.search(7);
	}

}

/*
o/p :
1 inserted!
2 inserted!
3 inserted!
4 inserted!
5 inserted!
5 -> 4 -> 3 -> 2 -> 1
2 present in linked list!
7 not present in linked list!
*/
