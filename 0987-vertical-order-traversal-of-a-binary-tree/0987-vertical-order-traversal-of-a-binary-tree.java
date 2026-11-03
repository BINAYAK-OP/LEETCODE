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
 class Pair {
    TreeNode node;
    int row;
    int col;

    Pair(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
 class add
 {
    int row;
    int col;
    int data;
    add(int row,int col,int data)
    {
        this.row=row;
        this.col=col;
        this.data=data;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;
        HashMap<Integer,ArrayList<add>> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0,0));
         int mindist=Integer.MAX_VALUE;
        int maxdist=Integer.MIN_VALUE;
        while(q.size()>0)
        {
            Pair front=q.remove();
            TreeNode node = front.node;
            int row = front.row;
            int col = front.col;
            mindist=Math.min(col,mindist);
           maxdist=Math.max(col,maxdist);
            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new add(row,col, node.val));
            if(node.left!=null)
            q.add(new Pair(node.left,row+1,col-1));
             if(node.right!=null)
            q.add(new Pair(node.right,row+1,col+1));
        }
        for(int i=mindist;i<=maxdist;i++)
        {
            ArrayList<add> temp = map.get(i);

            temp.sort((a,b) -> {
                if(a.row != b.row)
                    return Integer.compare(a.row,b.row);

                return Integer.compare(a.data,b.data);
        });
        List<Integer> list = new ArrayList<>();

            for(add ele : temp)
                list.add(ele.data);

            ans.add(list);
        }
            return ans;
    }
}