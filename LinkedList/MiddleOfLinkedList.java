package LinkedList;

//class ListNode {
//
//	int val;
//	ListNode next;
//
//	public ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//
//	public ListNode(int val) {
//		this.val = val;
//	}
//}

public class MiddleOfLinkedList {

	// ========================================================================
	// PROBLEM 2: Middle of Linked List
	// ========================================================================
	/**
	 * Problem Statement: Given the head of a singly linked list, return the middle
	 * node of the linked list. If there are two middle nodes, return the second
	 * middle node.
	 * 
	 * Example: Input: head = [1,2,3,4,5] Output: [3,4,5] Explanation: The middle
	 * node is 3.
	 * 
	 * Input: head = [1,2,3,4,5,6] Output: [4,5,6] Explanation: Two middle nodes are
	 * 3 and 4, return the second (4).
	 */

	/**
	 * Approach: Slow and Fast Pointer (Floyd's Tortoise and Hare): - Slow pointer
	 * moves 1 step at a time - Fast pointer moves 2 steps at a time - When fast
	 * reaches end, slow is at middle
	 * 
	 * * Time Complexity: O(n) - single pass through list Space Complexity: O(1) -
	 * only two pointers
	 */

	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		printList(head);
		System.out.println(MiddleNode(head).val);

	}

	private static ListNode MiddleNode(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;

	}

	private static void printList(ListNode head) {

		ListNode curr = head;

		while (curr != null) {
			System.out.print(curr.val);

			if (curr.next != null) {
				System.out.print(" -> ");
			}

			curr = curr.next;
		}
		System.out.println();
	}

}
