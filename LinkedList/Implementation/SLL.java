public class SLL {

	ListNode head, tail;
	int size;

	void createSLL(int val) {
		head = new ListNode(val);
		tail = head;
		size = 1;
		System.out.println(val + " inserted!");
	}

	void insertNode(int val) {

		ListNode newNode = new ListNode(val);

		if (head == null) {
			createSLL(val);
			return;
		}

		newNode.next = head;
		head = newNode;
		System.out.println(val + " inserted!");

		size++;
	}

}
