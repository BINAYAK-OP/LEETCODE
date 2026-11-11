class triplet{
    int row;
    int col;
    int time;
    triplet(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int i,j;
        int m=grid.length;
        int n=grid[0].length;
        Queue<triplet> q=new LinkedList<>();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                q.add(new triplet(i,j,0));
            }
        }
        int maxtime=0;
        while(q.size()>0)
        {
            triplet front=q.remove();
            int r=front.row;
            int c=front.col;
            int time=front.time;
            maxtime=Math.max(maxtime,time);
             if(c+1!=n && grid[r][c+1]==1)
            {
                q.add(new triplet(r,c+1,time+1));
                grid[r][c+1]=2;
            }
            if(r+1!=m && grid[r+1][c]==1 )
            {
                q.add(new triplet(r+1,c,time+1));
                grid[r+1][c]=2;
            }
            if(c-1!=-1 && grid[r][c-1]==1)
            {
                q.add(new triplet(r,c-1,time+1));
                grid[r][c-1]=2;
            }
            if(r-1!=-1 && grid[r-1][c]==1)
            {
                q.add(new triplet(r-1,c,time+1));
                grid[r-1][c]=2;
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        return maxtime;
    }
}