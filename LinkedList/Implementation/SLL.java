public class SLL {

	ListNode head, tail;
	int size;

	void createSLL(int val) {
		head = new ListNode(val);
		tail = head;
		size = 1;
		System.out.println(val + " inserted!");
	}

	// Insert Node in Linked List
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

	// Print Method 
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

		System.out.println();
	}

	// search in Linked List
	void search(int val) {

		if (head == null) {
			System.out.println("Empty list!");
			return;
		}

		ListNode curr = head;

		while (curr != null) {

			if (curr.val == val) {
				System.out.println(val + " present in linked list!");
				return;
			}
			curr = curr.next;
		}
		
		System.out.println(val + " not present in linked list!");
	}

	// delete node in linked list
	void delete(int index) {

		if (head == null) {
			System.out.println("Empty list!");
			return;
		}

		if (index < 0 || index >= size) {
			System.out.println("Invalid Index.");
			return;
		}

		if (index == 0) {

			head = head.next;
	        if (head == null) {
	            tail = null; 
	        }
	        size--;
	        return;
		}

		ListNode curr = head;

		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}

		curr.next = curr.next.next;

		if (index == size - 1) {
			tail = curr;
		}

		size--;
	}

}
