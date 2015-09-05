/*
Reverse a singly linked list.

==idea==
A(head) -> B -> C -> D
A <- B(newhead)   C(head) -> D
A <- B <- C(newhead)   D(head)
A <- B <- C <- D(newhead)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


//iterative
public class Solution {
    public ListNode reverseList(ListNode head) {
        
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