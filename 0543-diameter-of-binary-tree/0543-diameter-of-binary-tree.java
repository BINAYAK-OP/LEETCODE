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
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        max=0;
        level(root);
        return max;
        // int a=level(root.left)+level(root.right);
        // int b=diameterOfBinaryTree(root.left);
        //  int c=diameterOfBinaryTree(root.right);
        //  return Math.max(a,Math.max(b,c));

    }
     public int level(TreeNode root)
    {
        if(root==null)
        return 0;
        int leftlevel=level(root.left);
        int rightlevel=level(root.right);
        max=Math.max(max,leftlevel+rightlevel);
        return 1+Math.max(leftlevel,rightlevel);
    }
}