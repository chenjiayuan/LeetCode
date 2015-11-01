/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

==idea==
O(1) space solution
1. Use two pointers, walker and runner.
2. walker moves step by step. runner moves two steps at time.
3. if the Linked List has a cycle walker and runner will meet at some point.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        
        return false;
    }
}