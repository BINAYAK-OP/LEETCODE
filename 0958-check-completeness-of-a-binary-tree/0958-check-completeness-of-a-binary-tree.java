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
// class Solution {
//     public boolean isCompleteTree(TreeNode root) {
        
//     }
// }

class Solution {
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        // code here
        s=size(root);
        return isCBT(root,1);
        
    }
    public int size(TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+size(root.left)+size(root.right);
    }
    public boolean isCBT(TreeNode root,int idx)
    {
        if(root==null)
        return true;
        if(idx>s)
        return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);
    }
    // public boolean isMaxHeap(TreeNode root)
    // {
    //     if(root==null)
    //     return true;
    //     // int leftval=(root.left!=null)?root.left.data :Integer.MIN_VALUE;
    //     // int rightval=(root.right!=null)?root.right.data :Integer.MIN_VALUE;
    //     // if(root.data<=leftval || root.data<=rightval)
    //     // return false;
    //     if (root.left != null && root.val < root.left.val)
    //                return false;

    //            if (root.right != null && root.val < root.right.val)
    //                return false;
    //     return isMaxHeap(root.left) && isMaxHeap(root.right);
    // }
}