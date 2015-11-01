/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.

==idea==
use dummy (return dummy.next)
go to the node before the first node being reversed
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //when you're not sure if head will be removed, use dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = dummy;
        
        for (int i=0; i<m-1; i++) {
            tmp = tmp.next;
        } //tmp before the first node being reversed
        
        ListNode first = tmp.next;
        ListNode second = first.next;
        
        for (int j=0; j<n-m; j++) {
            //reverse the list selected
            first.next = second.next;
            second.next = tmp.next;
            tmp.next = second;
            second = first.next;
        }
        
        return dummy.next;
    }
}
