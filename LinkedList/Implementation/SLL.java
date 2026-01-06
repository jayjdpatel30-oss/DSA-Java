package LinkedList;

public class SLL {

	ListNode head, tail;
	int size;

	void createSLL(int val) {
		head = new ListNode(val);
		tail = head;
		size = 1;
		System.out.println(val + " inserted!");
	}

}
