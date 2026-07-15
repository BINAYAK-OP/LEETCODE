class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,k=n-1;
        int[] res=new int[n];
        while(i<=j)
        {
            int t=nums[i]*nums[i];
            int w=nums[j]*nums[j];
            if(t<w)
            {
                res[k--]=w;
                j--;
            }
            else
            {
                res[k--]=t;
                i++;
            }
        }
       return res;
    }
}