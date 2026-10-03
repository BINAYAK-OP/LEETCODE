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
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         inorder(root,arr);
//         if(k>arr.size())
//         return 0;
//        return arr.get(k-1);
//     }
//     void inorder(TreeNode root, ArrayList<Integer> arr)
//     {
//         if(root==null)
//         return;
//          inorder(root.left,arr);
//         arr.add(root.val);
//         inorder(root.right,arr);
//     }
// }

class Solution {
    int ans;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        count=k;
        inorder(root);
       return ans;
    }
    void inorder(TreeNode root)
    {
        if(root==null)
        return;
         inorder(root.left);
        count--;
        if(count==0)
        ans=root.val;
        inorder(root.right);
    }
}