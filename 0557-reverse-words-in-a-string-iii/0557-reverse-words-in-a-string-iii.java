class Solution {
    public String reverseWords(String s) {
        int m=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(int j=0;j<=m;j++)
        {
            if(j==m || s.charAt(j)==' ')
            {
                for(int k=j-1;k>=i;k--)
                {
                    sb.append(s.charAt(k));
                }
                if(j!=m)
                sb.append(" ");
                i=j+1;
            }
        }
              
        return sb.toString();
    }
}