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
//     int k=0;
//     int t=0;
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         inorder(root,arr);
//         return t!=-1;
//     }
//     void inorder(TreeNode root,ArrayList<Integer> arr)
//     {
//         if(root==null)
//         return;
//         inorder(root.left,arr);
//         arr.add(root.val);
//         if(k!=0 && arr.get(k-1)>=root.val)
//         t=-1;
//         k++;
//         inorder(root.right,arr);
//     }
// }


// class Solution {
//     int prev;
//     boolean first=true;
//     boolean flag=true;
//     public boolean isValidBST(TreeNode root) {
//         inorder(root);
//         return flag;
//     }
//     void inorder(TreeNode root)
//     {
//         if(root==null || !flag)
//         return;
//         inorder(root.left);

//         if(!first && prev>=root.val)
//         flag=false;

//         prev=root.val;
//         first=false;
//         inorder(root.right);
//     }
// }

// 

//using morris traversal
class Solution
{
    public boolean isValidBST(TreeNode root)
    {
        TreeNode curr=root;
        long prev = Long.MIN_VALUE;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
            TreeNode pred=curr.left;
            while(pred.right!=null && pred.right!=curr)
            pred=pred.right;
            if(pred.right==null)
            {
            pred.right=curr;
            curr=curr.left;
            }
            else
            {
                pred.right=null;
                if(curr.val<=prev)
                return false;
                prev=curr.val;
                curr=curr.right;
            }
            }
            else
            {
              if(curr.val<=prev)
                return false;
                prev=curr.val;
                curr=curr.right;
            }

        }
        return true;
    }
}