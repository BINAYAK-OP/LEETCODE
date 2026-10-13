class single implements Comparable<single>
{
    int x;
    int y;
    single(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int compareTo(single t)
    {
        int d1=Math.abs(this.x-this.y);
        int d2=Math.abs(t.x-t.y);

        if(d1==d2)
        return Integer.compare(this.x,t.x);
        
        return Integer.compare(d1,d2);
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<single> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr)
        {
            pq.add(new single(i,x));
            if(pq.size()>k)
            pq.remove();
        }
        for(int i=0;i<k;i++)
        {
            ans.add(pq.remove().x);
        }
        Collections.sort(ans);
        return ans;
    }
}