class pair
{
    int row;
    int col;
    pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int i,j;
        int count=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    bfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    void bfs(int i,int j,boolean[][] visited,char[][] grid)
    {
         int m=grid.length;
        int n=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        visited[i][j]=true;
        while(q.size()>0)
        {
            pair front=q.remove();
            int r=front.row;
            int c=front.col;
            if(c+1!=n && grid[r][c+1]=='1' && !visited[r][c+1])
            {
                q.add(new pair(r,c+1));
                visited[r][c+1]=true;
            }
            if(r+1!=m && grid[r+1][c]=='1' && !visited[r+1][c])
            {
                q.add(new pair(r+1,c));
                visited[r+1][c]=true;
            }
            if(c-1!=-1 && grid[r][c-1]=='1' && !visited[r][c-1])
            {
                q.add(new pair(r,c-1));
                visited[r][c-1]=true;
            }
            if(r-1!=-1 && grid[r-1][c]=='1' && !visited[r-1][c])
            {
                q.add(new pair(r-1,c));
                visited[r-1][c]=true;
            }
        }
    }
}