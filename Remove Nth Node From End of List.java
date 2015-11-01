/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

==idea==
A one pass solution can be done using pointers. Move one pointer fast --> n+1 places forward, 
to maintain a gap of n between the two pointers and then move both at the same speed. 
Finally, when the fast pointer reaches the end, the slow pointer will be n+1 places behind - 
just the right spot for it to be able to skip the next node.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tmp = new ListNode(0);
		tmp.next = head;
		ListNode fast = tmp, slow = tmp;

		for (int i=1; i<=n; i++) {
			fast = fast.next;
		} //move fast n nodes beyond slow

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		} //move slow to the ndoe before the one being removed

		slow.next = slow.next.next;
		return tmp.next; //in case the first node was deleted, not using head here


	}
}