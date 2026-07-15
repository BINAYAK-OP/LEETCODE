class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,j;
       int prev=digits[n-1];
        if(prev<9)
        {
            digits[n-1]=prev+1;
        return digits;
        }
        else
        {
            for(j=n-1;j>=0;j--)
            {
                if(digits[j]>=9)
                digits[j]=0;
                else 
                break;
            }
        }
            if(j>=0)
            {
            digits[j]=digits[j]+1;
            return digits;
            }
            else
            {
            int[] ans=new int[n+1];
            ans[0]=1;
            return ans;
            }
            
    }
}