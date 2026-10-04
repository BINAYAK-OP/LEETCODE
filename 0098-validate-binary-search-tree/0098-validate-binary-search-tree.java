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
    int k=0;
    int t=0;
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return t!=-1;
    }
    void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        return;
        inorder(root.left,arr);
        arr.add(root.val);
        if(k!=0 && arr.get(k-1)>=root.val)
        t=-1;
        k++;
        inorder(root.right,arr);
    }
}
