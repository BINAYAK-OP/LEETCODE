/**
 * Defpostition for a bpostary tree node.
 * public class TreeNode {
 *     postt val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(postt val) { this.val = val; }
 *     TreeNode(postt val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public void postorder(TreeNode root,ArrayList<Integer> ans) {
        if(root==null)
        return;
       postorder(root.left,ans);
        postorder(root.right,ans);
         ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root)
    {
         ArrayList<Integer> ans = new ArrayList<>();
         postorder(root,ans);
         return ans;
    }
}