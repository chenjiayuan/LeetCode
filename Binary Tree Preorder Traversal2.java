/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

==idea==
iteration (root -> left -> right) use stack
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
public List<Integer> preorderIt(TreeNode root) {
    List<Integer> result = new LinkedList<Integer>();
    //edge condition
    if (root == null) return result;
    Stack<TreeNode> tovisit = new Stack<TreeNode>();
    tovisit.push(root);
    while (!tovisit.empty()) {
        TreeNode visiting = tovisit.pop();
        list.add(visiting.val);
        if (visiting.right != null) tovisit.push(visiting.right);
        if (visiting.left != null) tovisit.push(visiting.left);
    }
    return list;
}