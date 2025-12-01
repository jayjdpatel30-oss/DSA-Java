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

public class RemoveDuplicates {

	// ========================================================================
	// PROBLEM 4: Remove Duplicates from Sorted List
	// ========================================================================
	/**
	 * Problem Statement: Given the head of a sorted linked list, delete all
	 * duplicates such that each element appears only once. Return the linked list
	 * sorted as well.
	 * 
	 * Example: Input: head = [1,1,2] Output: [1,2]
	 * 
	 * Input: head = [1,1,2,3,3] Output: [1,2,3] * Approach: Since list is sorted,
	 * duplicates are adjacent: 1. Traverse list with current pointer 2. If
	 * current.val == current.next.val, skip next node 3. Otherwise, move to next
	 * node 4. Continue until end of list Time Complexity: O(n) - single pass
	 * through list Space Complexity: O(1) - only one pointer, in-place modification
	 */

	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4))));
		printList(deleteDuplicates(head));
	}

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				// Skip duplicate node
				current.next = current.next.next;
			} else {
				// Move to next distinct value
				current = current.next;
			}
		}

		return head;
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
