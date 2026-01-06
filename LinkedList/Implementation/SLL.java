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

	void printList() {
		
		if(head == null) {
			System.out.println("Empty list!");
			return;
		}
		
		ListNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.val);
			if(curr.next != null) {
				System.out.print(" -> ");
			}
			
			curr = curr.next;
		}
		
	}

}
