/*
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

==idea==
First, find the second half of List, (slow and fast pointer) reverse it, and make the end of first half point to null

Second, insert second half node into first half of List

For Example: If we have 1 - 2 - 3 - 4 - 5, reverse 4 - 5 to 5 - 4, make the first half end to null

Now We have 1 - 2 - 3 and 5 - 4, Insert each of second list node into the first list between current and next node which gives 1 - 5 - 2 - 4 - 3
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return; //return void
        
        ListNode fast = head, slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverseList(newHead);
        //now we have two lists: 1->2->3->4 and 7->6->5
        
        ListNode cur = head;
        while (newHead != null) {
            ListNode newNext = newHead.next;
            newHead.next = cur.next;
            cur.next = newHead;
            cur = cur.next.next;
            newHead = newNext;
        }
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}