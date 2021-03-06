/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

==idea==
Since n may be a large number compared to the length of list. So we need to know the length of linked list.After that, move the list after the (l-n%l )th node to the front to finish the rotation.
Ex: {1,2,3} k=2 Move the list after the 1st node to the front
Ex: {1,2,3} k=5, In this case Move the list after (3-5%3=1)st node to the front.
So the code has three parts.
1) Get the length
2) Move to the (l-n%l)th node
3)Do the rotation
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
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null) return head;
    
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy,slow = dummy;

        int i;
        for (i=1; fast.next != null; i++) {
            fast=fast.next;
        } //get total length

        for (int j = i-n%i; j>0; j--)
            slow = slow.next;

        //do rotation
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}