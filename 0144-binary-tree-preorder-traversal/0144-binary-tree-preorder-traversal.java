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
    public void preorder(TreeNode root,ArrayList<Integer> ans) {
        if(root==null)
        return;
        ans.add(root.val);
       preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root)
    {
         ArrayList<Integer> ans = new ArrayList<>();
         preorder(root,ans);
         return ans;
    }
}

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         if(root == null)
//             return ans;

//         ans.add(root.val);

//         ans.addAll(preorderTraversal(root.left));
//         ans.addAll(preorderTraversal(root.right));

//         return ans;
//     }
// }
