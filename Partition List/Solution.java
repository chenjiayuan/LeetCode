/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.

==idea==
see codes
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
    public ListNode partition(ListNode head, int x) {
        //create dummy nodes for 2 separate lists
        ListNode dummySmall = new ListNode(0);
        ListNode dummyLarge = new ListNode(0);
        ListNode headSmall = dummySmall;
        ListNode headLarge = dummyLarge;
        
        //partition to two separate lists
        while (head != null) {
            if (head.val < x) {
                headSmall.next = head;
                headSmall = headSmall.next;
            } else {
                headLarge.next = head;
                headLarge = headLarge.next;
            }
            head = head.next;
        }
        
        //connect those two lists
        headLarge.next = null;
        headSmall.next = dummyLarge.next;
        
        return dummySmall.next;
    }
}