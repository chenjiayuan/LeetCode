/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //recursive solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListInt(head, null);
    }
    
    public ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null) return newHead; //no further elements
        
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
    
}