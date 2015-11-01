/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.

==idea==
1, Get the length of the two lists.

2, Align them to the same start point.

3, Move them together until finding the intersection point, or the end null
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //deal with edge conditions
        if (headA == null || headB == null) {
            return null;
        }
        
        //find the length of 2 lists
        int lenA = linkLength(headA);
        int lenB = linkLength(headB);
        
        //align them to the same distance to their end
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        //traverse 2 lists together, until find a node
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int linkLength(ListNode head) {
        int len=1;
        while (head.next != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}