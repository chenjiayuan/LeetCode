/*
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?

==idea==
假设linked list有环，环长Y，环以外的长度是X。

现在有两个指针，第一个指针，每走一次走一步，第二个指针每走一次走两步，如果他们走了t次之后相遇在K点

那么       指针一  走的路是      t = X + nY + K        ①

             指针二  走的路是     2t = X + mY+ K       ②          m,n为未知数

把等式一代入到等式二中, 有

2X + 2nY + 2K = X + mY + K

=>   X+K  =  (m-2n)Y    ③

这就清晰了，X和K的关系是基于Y互补的。等于说，两个指针相遇以后，再往下走X步就回到Cycle的起点了。这就可以有O(n)的实现了。
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
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head; //slow
        ListNode p2 = head; //fast
        
        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) break;
        }
        
        if (p2 == null || p2.next == null){
            return null;
        }
        
        p2 = head; //back to head
        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}