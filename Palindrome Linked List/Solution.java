/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?

==idea==
Solution: Reversed first half == Second half?

Phase 1: Reverse the first half while finding the middle.
Phase 2: Compare the reversed first half with the second half.
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
    public boolean isPalindrome(ListNode head) {
        // Trivial case
        if (head == null || head.next == null) return true;

        ListNode start = new ListNode(0);
        start.next = head;
        ListNode firstHalfStart = head;
        ListNode secondHalfStart = head;
        ListNode fast = head;

        // Traverse to mid node and Reverse the First half of the LinkedList in the same run
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
    
            start.next = secondHalfStart.next;
            secondHalfStart.next = secondHalfStart.next.next;
            start.next.next = firstHalfStart;
    
            firstHalfStart = start.next;
        }
    
        // Offset for odd number of elements
        // As the mid node is common to both halves, this should be skipped
        if (fast.next == null) {
            firstHalfStart = firstHalfStart.next;
        }
    
        // At the end of the previous loop, SecondHalfStart pointer is still stuck on the end of the first half
        // Shift it by one to take it to the start of the SecondHalf
        secondHalfStart = secondHalfStart.next;
    
        while(secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) return false;
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }
}
