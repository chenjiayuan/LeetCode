/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

==idea==
recursive solution:
head.next = deleteDuplicates(head.next);
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        head.next = deleteDuplicates(head.next); //next node is the head of the new list
        if (head.val == head.next.val) {
            return head.next;
        } else {
            return head;
        }
        
        //or use:
        //return head.val == head.next.val ? head.next : head;
    }
}
