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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int k=0;
        while(q.size()>0)
        {
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                    TreeNode curr=q.remove();
                    temp.add(curr.val);

                        if(curr.left!=null)
                        q.add(curr.left);
                        if(curr.right!=null)
                        q.add(curr.right);

                }
                if(k%2==1)
                Collections.reverse(temp);
                ans.add(temp);
                k++;
        }
        return ans;
    }
}