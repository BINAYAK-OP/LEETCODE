/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;
        int count1=level(root.left);
        int count2=level(root.right);
        if(Math.abs(count1-count2)>1)
        return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int level(TreeNode root)
    {
        if(root==null)
        return 0;
        int leftlevel=level(root.left);
        int rightlevel=level(root.right);
        return 1+Math.max(leftlevel,rightlevel);
    }
}