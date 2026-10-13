// class Solution {
//     public int[][] kClosest(int[][] points, int k) {
        
//     }
// }

import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>
{
    long dist;
    int x;
    int y;
    Triplet(long dist,int x,int y)
    {
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t)
    {
        // return this.dist-t.dist; or
         return Long.compare(this.dist, t.dist);
    }

}
class Solution
{
    public int[][] kClosest(int[][] points,int k)
    {
        PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point:points)
        {
            int x=point[0];
            int y=point[1];
            long dist=(long)x*x+(long)y*y;
            pq.add(new Triplet(dist,x,y));
            if(pq.size()>k)
                pq.remove();
        }
        int [][] ans=new int[k][2];
        for(int i=0;i<k;i++)
        {
            Triplet top=pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;
    }
}