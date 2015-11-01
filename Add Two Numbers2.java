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
        ListNode dummy = new ListNode(0);
        ListNode traverser = dummy;
        int sum = 0;
        
        while (l1 != null || l2 != null) {
            sum /= 10; //would be either 0 or 1 (carry)
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            traverser.next = new ListNode(sum % 10);
            traverser = traverser.next;
        }
            //check for the final carry
            if (sum / 10 == 1) traverser.next = new ListNode(1);
            return dummy.next;

    }
}
