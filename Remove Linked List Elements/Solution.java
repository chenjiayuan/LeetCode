/*
Remove ALL elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

==ideas==
this problem can be solved recursively
head.next = removeElements(head.next, val);
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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        
        //recursive solution
        head.next = removeElements(head.next, val);
        
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }
}