/*
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

==idea==
recursion, fast & slow pointers
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        //first check edge condition
        if (head == null) return null;
        if (head.next == null) return (new TreeNode(head.val));
        
        ListNode middle = head;
        ListNode preMiddle = null;
        ListNode fast = head;
        
        while (true) {
            if (fast !=null && fast.next != null) {
                fast = fast.next.next;                
            } else {
                break;
            }
            preMiddle = middle;
            middle = middle.next;
        }
        
        //now preMiddle is the tail of the left half list
        preMiddle.next = null;
        
        //create the tree using recursion
        TreeNode root = new TreeNode(middle.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);

        return root;
    }
}