class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> row=new ArrayList<>();
        int i,j;
        row.add(1);
        for(i=1;i<=n;i++)
        {
            for(j=i-1;j>0;j--)
            {
                row.set(j,row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
}
        