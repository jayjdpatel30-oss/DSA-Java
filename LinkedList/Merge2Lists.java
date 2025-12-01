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

public class Merge2Lists {

	// ========================================================================
	// PROBLEM 3: Merge Two Sorted Lists
	// ========================================================================
	/**
	 * Problem Statement: You are given the heads of two sorted linked lists list1
	 * and list2. Merge the two lists into one sorted list. The list should be made
	 * by splicing together the nodes of the first two lists. Return the head of the
	 * merged linked list.
	 * 
	 * Example: Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
	 * 
	 * Input: list1 = [], list2 = [] Output: []
	 * 
	 * Input: list1 = [], list2 = [0] Output: [0]
	 */

	/**
	 * Approach (Iterative): Use a dummy node to simplify edge cases: 1. Create
	 * dummy node as starting point 2. Compare values from both lists 3. Link
	 * smaller value to result 4. Move pointer in the list we took from 5. After
	 * loop, link remaining nodes
	 * 
	 * 
	 * Time Complexity: O(n + m) where n, m are lengths of two lists Space
	 * Complexity: O(1) for iterative
	 */

	public static void main(String[] args) {

		ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
		ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(7)));

		printList(mergeTwoLists(list1, list2));

	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode list = new ListNode(0);
		ListNode ans = list;

		while (list1 != null && list2 != null) {

			if (list1.val < list2.val) {
				list.next = list1;
				list1 = list1.next;

			} else {
				list.next = list2;
				list2 = list2.next;
			}

			list = list.next;
		}

		list.next = list1 == null ? list2 : list1;

		return ans.next;

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
