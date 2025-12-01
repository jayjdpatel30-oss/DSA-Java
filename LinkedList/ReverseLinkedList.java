package LinkedList;

class ListNode {

	int val;
	ListNode next;

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(int val) {
		this.val = val;
	}
}

public class ReverseLinkedList {

	// ========================================================================
	// PROBLEM 1: Reverse Linked List
	// ========================================================================
	/**
	 * Problem Statement: Given the head of a singly linked list, reverse the list,
	 * and return the reversed list.
	 * 
	 * Example: Input: head = [1,2,3,4,5] Output: [5,4,3,2,1]
	 * 
	 * Input: head = [1,2] Output: [2,1]
	 * 
	 * Input: head = [] Output: []
	 */

	/**
	 * Approach (Iterative): Use three pointers: prev, current, next 1. Initialize
	 * prev = null, current = head 2. While current != null: - Save next node -
	 * Reverse current's pointer to prev - Move prev and current forward
	 * 
	 * Time Complexity: O(n) - visit each node once. Space Complexity: O(1) for
	 * iterative
	 */

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

		printList(head);
		ListNode newHead = ReverseList(head);
		printList(newHead);

	}

	private static ListNode ReverseList(ListNode head) {

		ListNode current = head;
		ListNode prev = null;

		while (current != null) {
			ListNode nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}

		return prev;

	}

	private static void printList(ListNode head) {

		while (head != null) {
			System.out.print(head.val);

			if (head.next != null) {
				System.out.print(" -> ");
			}

			head = head.next;
		}
		System.out.println();
	}
}
