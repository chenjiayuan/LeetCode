/*
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

==idea==
simply traverse (see codes)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //since they are both valid, no need to check for null
        
        //calculate the mathematical sum, using long to prevent overflow 
        long num1 = getValue(l1);
        long num2 = getValue(l2);
        num1 = num1 + num2;
        
        //an edge condition
        if (num1 == 0) return l1;
        
        //"print" the new linked list
        ListNode newHead = new ListNode(0);
        ListNode traverser = newHead;
        while (num1 > 0) {
            traverser.next = new ListNode((int)(num1 % 10));
            traverser = traverser.next;
            num1 = num1/10;
        }
        return newHead.next;
    }
    
    private long getValue(ListNode head) {
        long result = 0;
        int count = 0;
        while (head != null) {
            result = result + head.val * (long)Math.pow(10, count);
            head = head.next;
            count++;
        }
        return result;
    }
}
