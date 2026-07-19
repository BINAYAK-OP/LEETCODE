class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(i=0;i<n;i++)
        {
            int stcol=0,endcol=n-1;
            while(stcol<endcol)
            {
            int temp=a[i][stcol];
            a[i][stcol]=a[i][endcol];
            a[i][endcol]=temp;
            stcol++;
            endcol--;
            }
        }
    }
}