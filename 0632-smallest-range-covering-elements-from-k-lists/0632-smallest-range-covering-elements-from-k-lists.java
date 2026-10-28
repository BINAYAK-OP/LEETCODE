class Solution {
    public class Triplet implements Comparable<Triplet>
    {
        int ele;
        int row;
        int col;
         Triplet(int ele,int row,int col)
        {
            this.ele=ele;
            this.row=row;
            this.col=col;
        }
        public int compareTo(Triplet t)
        {
            return this.ele-t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans=new int[2];
        PriorityQueue<Triplet> minHeap=new PriorityQueue<>();
        
        int k=nums.size();
        int n=nums.get(0).size();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            min=Math.min(min,nums.get(i).get(0));
            max=Math.max(max,nums.get(i).get(0));
            minHeap.add(new Triplet(nums.get(i).get(0),i,0));

        }
        ans[0]=min;
        ans[1]=max;
        while(true)
        {
            Triplet top=minHeap.remove();
            int ele=top.ele;
            int row=top.row;
            int col=top.col;
            min=ele;
            if(max-min<ans[1]-ans[0])
            {
                ans[0]=min;
                ans[1]=max;
            }
            if(col==nums.get(row).size()-1)
            break;
            int next=nums.get(row).get(col+1);
            max=Math.max(max,next);
            minHeap.add(new Triplet(next,row,col+1));


        }
    return ans;
}
}