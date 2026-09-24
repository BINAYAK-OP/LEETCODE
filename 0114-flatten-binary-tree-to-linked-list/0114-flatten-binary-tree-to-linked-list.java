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
    public void flatten(TreeNode root) {
        if(root==null)
        return ;
        ArrayList<TreeNode> arr=new ArrayList<>();
        dfs(root,arr);
        int n=arr.size();
        for(int i=0;i<n-1;i++)
        {
            TreeNode a=arr.get(i);
            TreeNode b=arr.get(i+1);
            a.right=b;
            a.left=null;
        }
        TreeNode last=arr.get(n-1);
        last.right=null;
        last.left=null;
    }
    public void dfs(TreeNode root,ArrayList<TreeNode> arr)
    {
        if(root==null)
        return;
        arr.add(root);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
}