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
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         if(root==null)
//         return ans;
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         while(q.size()>0)
//         {
//             int n=q.size();
//            for(int i=0;i<n;i++)
//            {
//             TreeNode curr=q.remove();
//             if(i==n-1)
//             ans.add(curr.val);
//             if(curr.left!=null)
//             q.add(curr.left);
//              if(curr.right!=null)
//             q.add(curr.right);
//            }
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        view(root,0,ans);
        return ans;
    }
    void view(TreeNode root,int level, List<Integer> ans)
    {
        if(root==null)
        return;
        if(level>=ans.size())
        ans.add(root.val);
        else
        ans.set(level,root.val);
         view(root.left,level+1,ans);
        view(root.right,level+1,ans);
    }
       
}