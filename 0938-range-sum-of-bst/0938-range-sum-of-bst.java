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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return Sum(root,low,high);
    }
    public int Sum(TreeNode root, int low, int high)
    {
        if(root==null)
        return 0;
        int c=0;
        if(root.val>=low && root.val<=high)
        c+=root.val;
        c+=Sum(root.left,low,high);
        c+=Sum(root.right,low,high);
        return c;
    }
}